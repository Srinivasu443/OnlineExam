<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
form{
background-color:olive;
width:300px;
height:250px;
border:5px solid green;
border-radius:10px;
display:inline-block;
}

</style>
<title>Home Page</title>
</head>
<body align="center">

<br>
<form action="userlogin" method="post" >
<h1>User Login</h1>
<label>Enter Username</label><br>
<input type="text" name="userid" /><br><br>
<label>Enter Password</label><br>
<input type="password" name="password" /><br><br>
<input type="submit" name="submit" value="Log In" />
<input type="button" value="Register" onClick="goToRegister()" />
<input type="button" value="Forget Password" onClick="resetPassword()" />
</form>
<br>
<br>
<script type="text/javascript">
function goToRegister(){
	alert("Go to the registration page!");
	window.location.href="/register"
}

function resetPassword(){
	alert("Go to reset password page!");
	window.location.href="/resetPassword"
}
</script>
<h1>${message }</h1>
</body>
</html>