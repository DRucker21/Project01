<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link type="text/css" rel="stylesheet" href="style.css">
<title>Demo</title>
</head>
<body>
	<h1>Hello and Welcome to JSP</h1>
	<%! String guestName = "Richard"; %>
	<% guestName = request.getParameter("gname"); %>
	<% for (int i = 0; i < 5; i++) { %>
	<h1><%= guestName %></h1>
	<% } %>
	<% out.println("Welcome: " + guestName); %><br>
	<%= "Welcome " + guestName %>
</body>
</html>