function reverse(){
    var str=prompt("Enter the String");
    var revstr="";
    var i;
    for(i=str.length-1; i>0; i--){
        revstr=revstr+str[i];
    }

    alert("the reversed string is: "+revstr);
}

function concat(){
    var str1=prompt("Enter string 1");
    var str2=prompt("Enter string 2");

    var str3=str1+str2;

    alert("The concatanated string is: "+str3);
}

function vowel(){
    var str=prompt("Enter String")
    var str2="aeiou"

    var i;
    var j;
    for(i=0;i<str.length;i++){
        for(j=0;j<str2.length;j++){
            if(str2[j]==str[i]){
                alert("The leftmost vowel is \""+str2[j]+"\" at position "+i);
                break;
            }
        }
        
    }
}

