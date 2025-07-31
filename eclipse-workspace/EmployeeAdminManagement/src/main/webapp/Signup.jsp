<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
  <h1>SignUp</h1>
  <form action="SignUpServlet" method="post">
  <label for="email">Email</label>
  <input type="text" name="email" placeholder="Enter email"></input><br>
  <label for="password">Password</label>
  <input type="password" name="password" placeholder="Enter password"></input><br>
    <label for="confirmpassword">Confirm Password</label>
  <input type="password" name="confirmpassword" placeholder="Enter Confirm password"></input><br>
  <input type="submit" value="SignUp"></input>
  </form>
  <p>Are you new user?<a href="index.html">Login</a></p>
</body>
</html>