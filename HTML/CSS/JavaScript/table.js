function  maketable(){
    var rows=prompt("Enter no. of rows")
    var cols=prompt("Enter no. of columns")
    
    
    var output="<table border='1' padding='10'>"
    var i,j=1
    for(i=1;i<=rows;i=i+1){
        
        output=output+"<tr>"
        while(j<=cols){
            output=output+"<td>"+i*j+"</td>"
            j=j+1
        }
        output=output+"</tr>"
        j=1
    }
    output=output+"</table>"
    document.write(output)
}