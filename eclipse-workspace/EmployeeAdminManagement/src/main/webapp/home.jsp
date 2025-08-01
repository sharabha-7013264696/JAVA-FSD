<%@ page import="java.util.*, com.flm.model.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hui <%=session.getAttribute("email") %></h1>
<table border="1">
<tr>
<th>EmployeeID </th>
<th>Name </th>
<th>Age </th>
<th>Email </th>
<th>PhoneNumber </th>
<th>Salary </th>
</tr>
<% List<Employee> l2= (List<Employee>)request.getAttribute("list"); 
   for(Employee e1:l2){
%>
  <tr>
  <td><%= e1.getId() %></td>
  <td><%= e1.getName() %></td>
  <td><%= e1.getAge() %></td>
  
  <td><%= e1.getPhoneNumber() %></td>
  <td><%= e1.getSalary() %></td>
  </tr>
<%} %>
</table>
</body>
</html>