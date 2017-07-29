const express = require('express');
const shell = require('shelljs')
const bodyParser = require('body-parser');
const app = express();
const fs = require('fs');
app.use(express.static('editor'))

app.use(bodyParser.urlencoded({
    extended: true
}));
app.use(bodyParser.json());

app.listen(8080, function () {
  console.log('Example app listening on port 3000!')
})

app.post('/solve/:runType', function (req, res) {
  if(typeof req.body.value !== 'undefined'){
    var runType = typeof req.params.runType === 'undefined' ? "solve" : req.params.runType;
    var ip = req.ip.replace(/\W/g,'');
    var identifier = ip + '_' + Date.now();
    var pkg = 'K'+identifier;


    if(!fs.existsSync(ip)){
      shell.mkdir('-p',ip)
    } else {
        let filePath = `${shell.pwd()}/${ip}/${pkg}.k`
        fs.writeFile('./'+ip+'/'+identifier+'.k', req.body.value, function(err){
            if(!err){
                var command = `bash k --${runType}  --package ${pkg} ${filePath}`;
                shell.exec(command, (code, stdout, stderr) => {
                  if (code) {
                      console.error(`exec error: ${code}`);
                      console.log(stdout,stderr);
                      var errr=error + '\n' + stderr
                      res.json({error: stderr});
                  } else {
                      let outArr = stdout.split("**************");
                      if (outArr.length > 1) {
                          let jsonVal = outArr[1];
                          res.json(JSON.parse(jsonVal));
                      } else {
                          res.end();
                      }
                      console.log(stdout,stderr);
                  }
              });

          }

      });
    }

  }

})

 
