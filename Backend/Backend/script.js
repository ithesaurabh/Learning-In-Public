const express = require('express')
const app = express()



app.use((req, res, next)=>{
  next();
});
app.get('/', function (req, res) {
  res.send('Hello World')
})
app.get('/profile/:username', function (req, res) {
  
  
  res.send('9062660000' + req.params.username);


})


app.listen(3000);