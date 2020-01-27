function equals()
{
	let a=document.getElementById("displaybox").value;
	let b=eval(a);
	document.getElementById("displaybox").value=b;

}
function display(x)
{
	document.getElementById("displaybox").value+=x;
}

function clear()
{
	document.getElementById("displaybox").value=" ";

}