<%@page import="java.util.Iterator"%>
<%@page import="com.Aviator.ERS.model.ReimbursementUser"%>
<%@page import="java.util.List"%>
<%@page import="com.Aviator.ERS.dao.ReimbursementDAOImpl"%>
<%@page import="com.Aviator.ERS.dao.ReimbursementDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>(M)All Approved Reimbursements</title>
</head>
<% String username = (String) session.getAttribute("username"); %>
<h2>You Are logged in as <%=username%></h2>
<body>
<%
	ReimbursementDAO reimburse = new ReimbursementDAOImpl();
	List<ReimbursementUser> ruser = reimburse.getAprovedReimbursements();
	Iterator<ReimbursementUser> iterate = ruser.iterator();
%>
<h1 align="center">All Approved Reimbursement Forms</h1>
	<table align="center" border="2" cellspacing="10" cellpadding="10">
		<th>User Id</th>
		<th>Amount</th>
		<th>Purpose</th>
		<th>Status</th>
	<%while(iterate.hasNext()){
	ReimbursementUser user = iterate.next();
%>
	<tr>
		<td><%=user.getUserId()%></td>
		<td><%=user.getAmount()%></td>
		<td><%=user.getPurpose()%></td>
		<td><%=user.getStatus()%></td>
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