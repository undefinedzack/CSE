function submittt(){
    
    var email=document.formie.email.value; 
    var atpos=email.indexOf("@"); 
    var last=email.lastIndexOf(".");
    var pass=document.formie.pass.value;
    var rpass=document.formie.rpass.value;
    // var birth=document.formie.birth.value;
    if(email=="" || email=="NULL"){
        alert("This is invalid email BRUH!")
    }
    else{
        if(atpos<1 || last<atpos+2 || last+2>=email.length()){
            alert("Invalid E-mail");
        }
    } 
    

    //checking passwordzzzzzzzzzzzz
    
    if(pass!=rpass){
        alert("This is invalid passwoed BRUH!")
    }

    //checking birth date
    

}