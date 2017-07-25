const express = require('express')
const app = express()
const bodyParser = require('body-parser');
const { exec } = require('child_process');


app.use(express.static('editor'))

app.use(bodyParser.urlencoded({
    extended: true
}));
app.use(bodyParser.json());

app.listen(3000, function () {
  console.log('Example app listening on port 3000!')
})

app.post('/solve', function (req, res) {
  if(typeof req.body.value !== 'undefined'){
    exec('k "' + req.body.value + '"', (error, stdout, stderr) => {
    if (error) {
      console.error(`exec error: ${error}`);
      res.send('error');
    } else {
      res.send(`Result: ${stdout}`);
      console.log(stdout,stderr);
    }
  });
  }

})

 
