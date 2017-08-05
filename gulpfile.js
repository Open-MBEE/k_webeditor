var gulp = require('gulp');
var named = require('vinyl-named');
var webpack = require('webpack');
var webpackStream = require('webpack-stream');
var replace = require("gulp-replace");
const UglifyJSPlugin = require('uglifyjs-webpack-plugin');


const parserDir = './build/parser/';

gulp.task('translateGrammar', () => {
return gulp.src('./parser/Model.g4') // Relies on .g4 extension!
    .pipe(antlr4(parserDir));// Where to put the generated Parser files
});

gulp.task('antlr', function () {
    return gulp.src('./node_modules/antlr4/index.js')
        .pipe(named())
        .pipe(webpackStream({
            output:{
                filename: '[name].js',
                libraryTarget: 'umd',
                library: 'antlr4'
            },
            node: {
                module: "empty",
                net: "empty",
                fs: "empty"
            },
            module: {
                loaders: [
                    {
                        test: /\.jsx?$|\.js?$/,
                        exclude: /node_modules/,
                        loader: 'babel-loader',
                        query:
                            {
                                presets:[,'es2015']
                            }
                    }
                ]
            },
            plugins: [new webpack.DefinePlugin({
                'process.env': {
                    NODE_ENV: JSON.stringify('production')
                }
            }),
                new UglifyJSPlugin()]
        })).pipe(gulp.dest('./editor/build/antlr4/'))
});

gulp.task('main', function () {
    return gulp.src('./editor/index.js')
        .pipe(named())
        .pipe(webpackStream({
            devtool: 'cheap-module-source-map',
            module: {
                loaders: [
                    {
                        test: /\.jsx?$|\.js?$/,
                        exclude: /node_modules/,
                        loader: 'babel-loader',
                        query:
                            {
                                presets:['react','es2015']
                            }
                    }
                ]
            },
            plugins: [new webpack.DefinePlugin({
                'process.env': {
                    NODE_ENV: JSON.stringify('production')
                }
            }),
                new UglifyJSPlugin({ sourceMap: true })]
        }, webpack))
        .pipe(gulp.dest('./editor/build/main/'))
});

gulp.task('parser', function () {
    return gulp.src('./parser/index.js')
        .pipe(named())
        .pipe(webpackStream({
            output:{
                filename: '[name].js',
                libraryTarget: 'umd',
                library: '[name]'
            },
            node: {
                module: "empty",
                net: "empty",
                fs: "empty"
            },
            module: {
                loaders: [
                    {
                        test: /\.jsx?$|\.js?$/,
                        exclude: /node_modules/,
                        loader: 'babel-loader',
                        query:
                            {
                                presets:['es2015']
                            }
                    }
                ]
            },
            plugins: [new webpack.DefinePlugin({
                'process.env': {
                    NODE_ENV: JSON.stringify('production')
                }
            }),
                new UglifyJSPlugin()]
        })).pipe(gulp.dest('./editor/build/parser/'))
});
gulp.task('watch',function(){
    gulp.watch('./editor/editor.js', ['main']);
    gulp.watch('./editor/ui.js', ['main']);
    gulp.watch('./editor/index.js', ['main']);
});

gulp.task('build', ['antlr','parser', 'main']);
gulp.task('default', ['watch']);


