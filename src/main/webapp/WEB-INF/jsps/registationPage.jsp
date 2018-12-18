<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registation Page</title>
</head>
<body>
      <h1>Registation Page</h1>
      <form action="registationPage" method="post">
    First Name<input type="text" name="fname"/>
	Middle Name<input type="text" name="mname"/>
	Last Name<input type="text" name="lname"/>
	Email ID<input type="text" name="email"/>
	Phone<input type="text" name="phone"/>
	DOB<input type="text" name="dob"/>
	PinCode<input type="text" name="pinCode"/>
	Password<input type="password" name="password"/>
	<input type="submit" value="Registesation">
      </form>
</body>
</html>