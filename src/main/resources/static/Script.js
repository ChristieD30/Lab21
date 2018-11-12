/**
 * 
 */


function validateInfo(){
	//1. get the text box value
	var first = document.getElementById("firstname").value;
	var last = document.getElementById("lastname").value;
	var email = document.getElementById("email").value;
	
	if (first.length <= 2){
		alert("Please enter a longer first name!");
		document.getElementById("firstname").focus();
		
		return false;
	} else if (last.length <= 2){
		alert("Please enter a longer last name!");
		document.getElementById("lastname").focus();
		return false;
	} 
	
	
	
	
}
