const express = require('express')
const app = express()
const bodyParser = require('body-parser');
const { exec } = require('child_process');


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
    var identifier = req.ip + Date.now();
var command = `bash k  --package K${identifier.replace(/\W/g,'')} '${req.body.value}'`;
    //var command = `bash k --${runType}  --package K${identifier.replace(/\W/g,'')} '${req.body.value}'`;
    console.log(command);
    exec(command, (error, stdout, stderr) => {
    if (error) {
      console.error(`exec error: ${error}`);
      console.log(stdout,stderr);
      var errr=error + '\n' + stderr
      res.send((errr.length > 3 ? `Error: ${error}\n${stderr}` : '') + `\nResult:\n${stdout}`);
      } else {
      res.send(`Result:\n${stdout}`);
      console.log(stdout,stderr);
    }
  });
  }

})

 
