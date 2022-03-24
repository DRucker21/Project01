<%@page import="com.Aviator.ERS.model.User"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.Aviator.ERS.dao.LoginDAOImpl"%>
<%@page import="com.Aviator.ERS.dao.LoginDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link type="text/css" rel="stylesheet" href="Style.css">
<title>User Search Result</title>
</head>
<h1>Here Is Your Search Results: </h1>
<% String username = (String)session.getAttribute("username"); %>
<% String searchname = request.getParameter("searchname"); %>

<h2>You Are logged in as <%= username %> and the message is : <%= session.getAttribute("message") %></h2>
<body>
<%
	LoginDAO login = new LoginDAOImpl();
	List<User> users = login.getUserByUserName(searchname);
	Iterator<User> iterate = users.iterator();
%>
<h1>List all Of Users</h1>
<table border="2" cellspacing="10" cellpadding="10" align="center"> 
<th>UserId</th>
<th>UserName</th>
<th>Password</th>
<th>Qualification</th>
<th>Gender</th>
<% while(iterate.hasNext()){
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
	<br>
	<a href="searchUser.jsp">Search Again</a>
	<a href="index.jsp">Logout</a>
</body>
</html>