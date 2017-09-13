# k_webeditor

This runs a web-based IDE for the K language.  It assumes that you have kservices
installed in the same subdirectory.

## How to run

### If you've got everything installed and built, to simply run locally, at the command line enter
```bash
npm start
```
Then, you should be able to see the editor on http://localhost:8080 .

### Alternatively, you can use the forever command to start and always keep node up and running:
```bash
forever app.js
```

If you make a change to app.js, you can restart with

```bash
forever restartall
```

## How to set up

### Simple setup

If you've got NodeJS and have cloned k_webeditor, then at the command line in the k_webeditor dir, enter
```bash
npm install
npm install --save gulp-install
npm install semantic-ui --save
cd semantic/
gulp build
cd ..
gulp main
```
### Complete setup for Mac OS

If you are on Mac OS, follow these to get all of the tools and install k_webeditor:

1. If installing Install XCode Command Line Tools -- do a web search for instructions
2. Clone this k_webeditor repository.
2. Get homebrew.  Instructions: https://brew.sh/
3. Install NodeJS.  At the command line,

```bash
brew install node
```

4. Install gulp:

```bash
npm install -g gulp
```

5. Change to the k_webeditor directory wherever that is.  For example,

```bash
cd ${HOME}/git/k_webeditor
```

6. Install and build semantic-ui:

```bash
npm install semantic-ui --save
cd semantic/
gulp build
cd ..
```

7. Now install and build the rest of the javascript libraries and k_webeditor:

```bash
gulp build
```

You should now be able to run with

```bash
npm start
```

Optionally install forever:

```bash
npm install forever -g
```

You should now be able to run with

```bash
forever app.js
```
