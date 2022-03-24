<%@page import="java.util.Iterator"%>
<%@page import="com.Aviator.ERS.model.User"%>
<%@page import="java.util.List"%>
<%@page import="com.Aviator.ERS.dao.ReimbursementDAOImpl"%>
<%@page import="com.Aviator.ERS.dao.ReimbursementDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Employees Information</title>
</head>
<body>
<%
	ReimbursementDAO reimburse = new ReimbursementDAOImpl();
	List<User> ruser = reimburse.getAllEmployees();
	Iterator<User> iterate = ruser.iterator();
%>
<h1 align="center">All Employees In System</h1>
	<table align="center" border="2" cellspacing="10" cellpadding="10">
		<th>User Id</th>
		<th>User Name</th>
		<th>Password</th>
		<th>Qualification</th>
		<th>Gender</th>
		<th>Level</th>
	<%while(iterate.hasNext()){
		User user = iterate.next();
%>
	<tr>
		<td><%=user.getUserId()%></td>
		<td><%=user.getUsername()%></td>
		<td><%=user.getPassword()%></td>
		<td><%=user.getQualification()%></td>
		<td><%=user.getGender()%></td>
	</tr>
	<% } %>
	</table>
	<br>
	<br>
	<br>
	<a href="index.jsp">Logout</a>
	<a href=""></a>
</body>
</html>