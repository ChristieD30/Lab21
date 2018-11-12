<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register - Christie's Coffee</title>
<link rel = "stylesheet" href = "main.css">
</head>
<body>
${register}

<h1>Please fill out the form to register!</h1>
<div class = "form">
<form action="/formresults" onSubmit = "return validateInfo();">
		First Name: <input id ="firstname" type="text" name="firstname"> <br>
		Last Name: <input id ="lastname" type="text" name="lastname"> <br> 
		Email: <input id ="email" type="email" name="email"> <br>
		Phone Number: <input id ="phonenumber" type="text" name="phone"> <br>
		Password: <input id ="password" type="password"  name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required> <br>
		Birthday: <input id = "bday" type = "date" name ="bday"><br>
		
  		<input type="radio" name="gender" value="male" checked> Male<br>
 		<input type="radio" name="gender" value="female"> Female<br>
 		<input type="radio" name="gender" value="else"> Non-binary <br>

		<input type="submit" value="Register" id ="register">
		

	</form> 
	
	</div>
	
	
	<script type="text/javascript" src="Script.js"></script>
</body>
</html>