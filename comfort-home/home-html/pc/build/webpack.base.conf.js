var path = require('path');
var webpack = require('webpack');
var config = require('../config');
var utils = require('./utils');
var HtmlWebpackPlugin = require('html-webpack-plugin');
var ExtractTextPlugin = require('extract-text-webpack-plugin');

// 识别是启动服务还是打包
var envs = process.env.NODE_ENV.split('-');
var isBuild = envs[0] === 'build';
var cssLoaders = utils.cssLoaders(isBuild);

module.exports = {
    entry: './src/main.js',
    output: {
        path: config.build.assetsRoot,
        publicPath: isBuild ? config.build.assetsPublicPath : config.dev.assetsPublicPath,
        filename: '[name].js'
    },
    module: {
        rules: [
            {
                test: /\.css$/,
                use: cssLoaders.css
            },
            {
                test: /\.scss$/,
                use: cssLoaders.scss
            },
            {
                test: /\.sass$/,
                use: cssLoaders.sass
            },
            {
                test: /\.vue$/,
                loader: 'vue-loader',
                options: {
                    loaders: {
                        // Since sass-loader (weirdly) has SCSS as its default parse mode, we map
                        // the "scss" and "sass" values for the lang attribute to the right configs here.
                        // other preprocessors should work out of the box, no loader config like this necessary.
                        'scss': cssLoaders.scss,
                        'sass': cssLoaders.sass
                    }
                }
            },
            {
                test: /\.js$/,
                loader: 'babel-loader',
                exclude: /node_modules/
            },
            {
                test: /\.(png|jpg|gif|svg)$/,
                loader: 'file-loader',
                options: {
                    name: 'img/[name].[ext]'
                }
            },
            {
                test: /\.(woff2?|eot|ttf|otf)(\?.*)?$/,
                loader: 'url-loader',
                query: {
                    limit: 10000,
                    name: utils.assetsPath('fonts/[name].[hash:7].[ext]')
                }
            }
        ]
    },
    plugins: [
        new ExtractTextPlugin({
            filename: 'css/[name].css',
            disable: !isBuild
        }),
        new HtmlWebpackPlugin({
            template: './src/index.html',
            filename: 'index.html',
            favicon: './src/favicon.ico',
            minify: {
                collapseWhitespace: true
            },
            base: isBuild/*,
            hash: true*/
        })
    ],
    resolve: {
        alias: {
            'vue$': 'vue/dist/vue.esm.js'
        },
        extensions: ['*', '.js', '.vue', '.json']
    },
    performance: {
        hints: false
    }
}
