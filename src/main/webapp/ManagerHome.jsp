<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manager Home Page</title>
</head>
<body>
<% String username = (String)session.getAttribute("username"); %>
<h2 align="center"> You Are Logged In As: <%= username %></h2>
<h1><a href="DisplayAllPendingReimbursemnent.jsp">All Pending Reimbursement Forms</a></h1>
<h1><a href ="DisplayAllApprovedReimbursement.jsp">All Approved Reimbursement Forms</a></h1>
<h1><a href="DisplayAllEmployee.jsp">All Employees In System</a></h1>
<h1><a href ="DisplaySpecificReimbursement.jsp">Search Reimbursement By UserId</a></h1>
<br>
<br>
<br>
<a href="index.jsp">Logout</a>
</body>
</html>