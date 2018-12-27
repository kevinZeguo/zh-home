var path = require('path');
var webpack = require('webpack');
var merge = require('webpack-merge');
var config = require('../config');
var webpackBaseConfig = require('./webpack.base.conf');
var HtmlWebpackPlugin = require('html-webpack-plugin');
var CleanWebpackPlugin = require('clean-webpack-plugin');
var ZipWebpackPlugin = require('zip-webpack-plugin');

var pathsToClean = ['dist'];

// 打包后文件名称
var fnv = require('fnv-plus');
var timer = new Date().getTime();
var hashStr = fnv.hash(timer, 64).str();

module.exports = merge(webpackBaseConfig, {
    output: {
        path: config.build.assetsRoot,
        filename: 'js/[name].js',
        //filename: utils.assetsPath('js/[name].js'),
        chunkFilename: 'js/[name].[chunkhash].min.js'
    },
    plugins: [
        new CleanWebpackPlugin(pathsToClean, {
            root: path.resolve(__dirname, '../')
        }),
        new webpack.DefinePlugin({
            'process.env': config.build.env
        }),
        new webpack.optimize.UglifyJsPlugin({
            sourceMap: false,
            compress: {
              warnings: false
            }
        }),
        new webpack.LoaderOptionsPlugin({
            minimize: true
        }),
        new webpack.optimize.CommonsChunkPlugin({
            name: 'vendor',
            minChunks: function (module, count) {
                // any required modules inside node_modules are extracted to vendor
                return (
                    module.resource &&
                    /\.js$/.test(module.resource) &&
                    module.resource.indexOf(
                        path.join(__dirname, '../node_modules')
                    ) === 0
                )
            }
        }),
        new webpack.optimize.CommonsChunkPlugin({
            name: 'manifest',
            chunks: ['vendor']
        }),
        new ZipWebpackPlugin({
            path: path.resolve(__dirname,'../dist'),
            filename: 'dist-' + hashStr + '.zip'
        })
    ]/*,
    devtool: '#source-map'*/
});
