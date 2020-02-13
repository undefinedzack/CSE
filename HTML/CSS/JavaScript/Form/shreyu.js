function validateForm() {
  var x = document.myform.mail.value;
  var p=document.myform.pass.value;
  var rp=document.myform.rpass.value;
  //var atpos=x.indexof("@");
  //var last=x.lastindexof(".");
  var y=document.myform.name.value;
  if(y==""){
    document.getElementById('namee').innerText="*Invalid name";
    //alert("Name must be filled out");
   //return false;
  }
  if (x == "") {
    document.getElementById('maill').innerText="*Invalid email";
    //alert("Mail must be filled out");
    //return false;
  }
  var l=p.length;
  if(l<5){
    document.getElementById('passs').innerText="*Passwordsize should be greater than 5";
    //alert("Passwordsize should be greater than 5");
  }
  
  var patt=/[A-Z]/g;
  if(patt.test(p)==false){
    document.getElementById('passs').innerText="*There should be atleast one capital letter";
    //alert("There should be atleast one capital letter");
  }
  var patt2=/[a-z]/g;
  if(patt2.test(p)==false){
    document.getElementById('passs').innerText="*There should be atleast one small letter";
    //alert("There should be atleast one small letter");
  }
  var patt3=/[0-9]/g;
  if(patt3.test(p)==false){
    document.getElementById('passs').innerText="*There should be atleast one digit";
    //alert("There should be atleast one digit");
  }
  
  
  if(p!=rp){
    document.getElementById('rpasss').innerText="*Password does not match";
    //alert("Enter valid password");
  }
}
function resetform(){
  var x = document.myform.mail.value;
  var p=document.myform.pass.value;
  var rp=document.myform.rpass.value;
  var y=document.myform.name.value;
  var c=document.myform.name.comment;
  x="";
  p=null;
  rp=null;
  y="";
  c="";
}