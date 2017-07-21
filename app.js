const express = require('express')
const app = express()

const { exec } = require('child_process');

app.use(express.static('editor'))

app.listen(3000, function () {
  console.log('Example app listening on port 3000!')
})

app.post('/solve', function (req, res) {
    req.body
  exec('k "' + req.body + '"', (error, stdout, stderr) => {
      if (error) {
              console.error(`exec error: ${error}`);
                  return;
                    }
       res.send(`stdout: ${stdout}`);
  });

})

