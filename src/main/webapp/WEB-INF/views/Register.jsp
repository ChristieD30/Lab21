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
<div>
<form action="/formresults" onSubmit = "return validateInfo();">
		First Name: <input id ="firstname" type="text" name="firstname"> <br>
		Last Name: <input id ="lastname" type="text" name="lastname"> <br> 
		Email: <input id ="email" type="text" name="email"> <br>
		Phone Number: <input id ="phonenumber" type="text" name="phone"> <br>
		Password: <input id ="password" type="password" name="password"> <br>
		<input type="submit" value="Register">

	</form> 
	</div>
</body>
</html>