const express = require('express');
const shell = require('shelljs')
const bodyParser = require('body-parser');
const app = express();
const fs = require('fs');
app.use(express.static('editor'));

app.use(bodyParser.urlencoded({
    extended: true
}));
app.use(bodyParser.json({limit: '100mb'}));

app.listen(8080, function () {
  console.log('Example app listening on port 3000!')
})

app.get('/blah', function(req, res) {
  res.send('never do that again!');
});

app.post('/solve/:runType', function (req, res) {
  if(typeof req.body.value !== 'undefined'){
    var runType = typeof req.params.runType === 'undefined' ? "solve" : req.params.runType;
    var ip = req.ip.replace(/\W/g,'');
    var identifier = ip + '_' + Date.now();
    var pkg = 'K'+identifier;

    var dir = 'editor/data/' + ip
    var srcdir = 'editor/data/src/' + pkg
    if(!fs.existsSync(dir)){
      shell.mkdir('-p',dir)
    } else {
        let filePath = `${shell.pwd()}/${dir}/${pkg}.k`
        fs.writeFile('./'+dir+'/'+pkg+'.k', req.body.value, function(err){
            if(!err){
                var command = `bash k  --${runType} --package ${pkg} ${filePath}`;
                shell.exec(command, (code, stdout, stderr) => {
                  if (code) {
                      console.error(`exec errors: ${code}`);
                      console.log(stdout,stderr);
                      var errr= code + '\n' + stderr
                      res.json({errors: [stderr], output: stdout});
                  } else {
                      let outArr = stdout.split("**************");
                      if (outArr.length > 1) {
                          let jsonVal = outArr[1].replace(/^[^{]*/,'');
                          try {
                              let jj = JSON.parse(jsonVal);
                              res.json(jj);
                          } catch(err) {
                              res.json({errors: [err.toString(), stderr], output: stdout});
                          }
                      } else {
                          res.json({errors: [stderr], output: stdout});
                          // res.end();
                      }
                      console.log(stdout,stderr);
                  }
              });

          }

      });
    }

  }

})

 
