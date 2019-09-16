<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>From Demo Page</title>
</head>
<body>
	<h2>This is Form Demo</h2>
	<a href="app">click here..</a>
	<br> Loaded from Model Interface :: ${message}
	<br>
	<h2>Method 1 : Using HttpServletRequest</h2>
	<br>
	<form action="formtest">
		UserName : <input type="text" name="username" /> <br> <br>
		Password : <input type="text" name="password" /> <br> <br>
		<input type="submit" name="submit">
	</form><br>
	<h2>Method 2 : Using @RequestParam</h2>
	<br>
	<form action="formreq">
		UserName : <input type="text" name="username" /> <br> <br>
		Password : <input type="text" name="password" /> <br> <br>
		<input type="submit" name="submit">
	</form><br>
	
</body>
<br>

</html>