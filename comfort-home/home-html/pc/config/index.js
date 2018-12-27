var path = require('path');

// 根据evns里的值设置请求地址
var envs = process.env.NODE_ENV.split('-');

module.exports = {
    build: {
        env: {
            NODE_ENV: '"' + envs[1] + '"'
        },
        index: path.resolve(__dirname, '../dist/index.html'),
        assetsRoot: path.resolve(__dirname, '../dist'),
        assetsSubDirectory: './',
        assetsPublicPath: './',
        productionSourceMap: true,
        // Surge or Netlify already gzip all static assets for you.
        // Before setting to `true`, make sure to:
        // npm install --save-dev compression-webpack-plugin
        //productionGzip: false,
        //productionGzipExtensions: ['js', 'css']
    },
    dev: {
        env: {
            NODE_ENV: '"' + envs[1] + '"'
        },
        port: 3000,
        assetsSubDirectory: './',
        assetsPublicPath: '/'
    }
}