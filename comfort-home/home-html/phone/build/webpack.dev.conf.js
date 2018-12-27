var path = require('path');
var webpack = require('webpack');
var merge = require('webpack-merge');
var config = require('../config');
var webpackBaseConfig = require('./webpack.base.conf');
var HtmlWebpackPlugin = require('html-webpack-plugin');

module.exports = merge(webpackBaseConfig, {
    plugins: [
        new webpack.DefinePlugin({
            'process.env': config.dev.env
        })
    ],
    devServer: {
        //port: 3000,
        historyApiFallback: true,
        noInfo: true,
        overlay: true,
        open: true,
        host: '0.0.0.0',
        useLocalIp: true
    },
    devtool: '#eval-source-map'
});