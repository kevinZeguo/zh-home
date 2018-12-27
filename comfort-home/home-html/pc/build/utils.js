var path = require('path');
var config = require('../config');
var ExtractTextPlugin = require('extract-text-webpack-plugin');

exports.assetsPath = function(_path) {
    var assetsSubDirectory = process.env.NODE_ENV === 'production' ? config.build.assetsSubDirectory : config.dev.assetsSubDirectory
    return path.posix.join(assetsSubDirectory, _path);
}

exports.cssLoaders = function (isBuild) {
    // css
    var cssDev = ['vue-style-loader', 'css-loader'];
    var cssProd = ExtractTextPlugin.extract({
        fallback: 'vue-style-loader',
        use: ['css-loader'],
        publicPath: '../'
    });
    var cssConfig = isBuild ? cssProd : cssDev;

    // scss
    var scssDev = ['vue-style-loader', 'css-loader', 'sass-loader'];
    var scssProd = ExtractTextPlugin.extract({
        fallback: 'vue-style-loader',
        use: ['css-loader', 'sass-loader'],
        publicPath: '../'
    });
    var scssConfig = isBuild ? scssProd : scssDev;

    // sass
    var sassDev = ['vue-style-loader', 'css-loader', 'sass-loader?indentedSyntax'];
    var sassProd = ExtractTextPlugin.extract({
        fallback: 'vue-style-loader',
        use: ['css-loader', 'sass-loader?indentedSyntax'],
        publicPath: '../'
    });
    var sassConfig = isBuild ? sassProd : sassDev;

    return  {
        css: cssConfig,
        scss: scssConfig,
        sass: sassConfig
    };
};



