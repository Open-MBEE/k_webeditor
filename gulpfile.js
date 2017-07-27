var gulp = require('gulp');
var named = require('vinyl-named');
var webpack = require('webpack-stream');
var antlr4 = require('gulp-antlr4');
var replace = require("gulp-replace");


const parserDir = './build/parser/';

gulp.task('translateGrammar', () => {
return gulp.src('./parser/Model.g4') // Relies on .g4 extension!
    .pipe(antlr4(parserDir));// Where to put the generated Parser files
});

gulp.task('antlr', function () {
    return gulp.src('./node_modules/antlr4/index.js')
        .pipe(named())
        .pipe(webpack({
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
        })).pipe(gulp.dest('./editor/build/antlr4/'))
});

gulp.task('main', function () {
    return gulp.src('./editor/index.js')
        .pipe(named())
        .pipe(webpack()).pipe(gulp.dest('./editor/build/main/'))
});

gulp.task('parser', function () {
    return gulp.src('./parser/index.js')
        .pipe(named())
        .pipe(webpack({
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
        })).pipe(gulp.dest('./editor/build/parser/'))
});

gulp.task('default', ['antlr','parser', 'main']);