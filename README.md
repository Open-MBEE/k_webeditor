# k_webeditor

This runs a web-based IDE for the K language.  It assumes that you have kservices
installed in the same subdirectory.

## How to run

### If you've got everything installed and built, to simply run locally, at the command line enter

    npm start

Then, you should be able to see the editor on http://localhost:8080 .

### Alternatively, you can use the forever command to start and always keep node up and running:
    forever app.js

If you make a change to app.js, you can restart with

    forever restartall

## How to set up

### If you already have the basic tools, then at the command line in the k_webeditor dir, enter
    npm install
    npm install semantic-ui --save
    cd semantic/
    gulp build
    cd ..
    gulp main

### If you are on Mac OS, follow these to get set up with all of the tools, install, and run k_webeditor:

1. Install XCode Command Line Tools -- do a web search for instructions
2. Get homebrew.  Instructions: https://brew.sh/
3. Install NodeJS.  At the command line,

    ```
    brew install node
    ```

4. Install gulp:

    ```
    npm install -g gulp
    ```

5. Install semantic-ui:

    ```
    npm install semantic-ui --save
    cd semantic/
    gulp build
    cd ..
    ```

6. Now build all:

    ```
    gulp build
    ```

You should now be able to run with

    ```
    npm start
    ```

7. Optionally install forever:

    ```
    npm install forever -g
    ```

You should now be able to run with

    ```
    forever app.js
    ```
