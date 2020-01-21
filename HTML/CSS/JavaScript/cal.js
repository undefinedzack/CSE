makebuttons()
function equals(){
    let a=document.getElementById("result").value
    
    let b=eval(a)

    document.getElementById("result").value=b
}

function makebuttons(){

    var output="<table border='1'>"
    output+="<tr><td colspan=\"3\"><input type=\"text\" id=\"result\"></td></tr>"
    var i,j=1,k=1
    for(i=1;i<=3;i=i+1){
        
        output=output+"<tr>"
        while(j<=3){
            output=output+"<td>"+"<input type=\"button\" value=\""+k+"\" onclick=\"dis('"+k+"')\"></input>"+"</td>"
            j++
            k++
        }
        output=output+"</tr>"
        j=1
    }
    output=output+"<tr>   <td><input type=\"button\" value=\"+\" onclick=\"dis('+')\"></input></td>   <td><input type=\"button\" value=\"-\" onclick=\"dis('-')\"></input></td>   <td><input type=\"button\" value=\"*\" onclick=\"dis('*')\"></input></td>   <tr><td><input type=\"button\" value=\"/\" onclick=\"dis('/')\"></input></td>   <td><input type=\"button\" value=\"Clear\" onclick=\"clr()\"></input></td></tr>"
    output=output+"</table>"
    document.write(output)
}

function dis(val){
    document.getElementById("result").value+=val;
}

function clr(){
    document.getElementById("result").value=""
}