<%@page import="com.Aviator.ERS.dao.LoginDAOImpl"%>
<%@page import="com.Aviator.ERS.dao.LoginDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.Aviator.ERS.model.User"%>
<%@page import="java.util.List"%>
<%@page import="com.Aviator.ERS.dao.ELoginDAOImpl"%>
<%@page import="com.Aviator.ERS.dao.ELoginDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Successful Update</title>
</head>
<% String username = (String) session.getAttribute("username");%>
<body>
<%
LoginDAO login = new LoginDAOImpl();
 
%>
<h1><%=username%> New Info</h1>
<table align="center" border="2" cellspacing="10" cellpadding="10">
		<th>User Id</th>
		<th>User Name</th>
		<th>Password</th>
		<th>Qualification</th>
		<th>Gender</th>
	<tr>
	<%while(.hasNext()){
	User user = iterate.next(); %>
		<td><%=user.setUserId(userId)%></td>
		<td><%=user.setUsername(username)%></td>
		<td><%=user.setPassword(password)%></td>
		<td><%=user.setQualification(qualification)%></td>
		<td><%=user.setGender(gender)%></td>
	</tr>
	  <% } %> 
	</table>
</body>
</html>