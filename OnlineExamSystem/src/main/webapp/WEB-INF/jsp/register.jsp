<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Page</title>

</head>
<body align="center">
<h1>Registration Page</h1>
<form action="setUser" method="post" >
<label>Enter Name</label><br>
<input type="text" name="name" /><br><br>
<label>Enter Email</label><br>
<input type="email" name="email" /><br><br>
<label>Enter Password</label><br>
<input type="password" name="password" /><br><br>
<label>Enter state</label><br>
<input type="text" name="state" /><br><br>
<label>Enter City</label><br>
<input type="text" name="city" /><br><br>
<label>Enter DOB</label><br>
<input type="date" name="dob" /><br><br>
<label>Enter Mob no</label><br>
<input type="number" name="mobno" /><br><br>
<label>Enter passing year</label><br>
<input type="number" name="passyr" /><br><br>
<input type="submit" name="submit" value="Register" />

</form>
<h1>${message }</h1>
</body>
</html>