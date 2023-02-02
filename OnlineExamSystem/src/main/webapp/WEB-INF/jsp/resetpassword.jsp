<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reset Password</title>
</head>
<body>
<form action="resetPasswordForUser" method="post">
<h1>Reset Password</h1>
<label>Enter Username</label><br>
<input type="text" name="userid" /><br><br>
<label>Enter Password</label><br>
<input type="text" name="password" /><br><br>
<input type="submit" name="submit" value="Reset Password" />
</form>
</body>
</html>