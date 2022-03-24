<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submitting Reimbursement Form</title>
</head>
<body>
<h1 align="center">Enter Reimbursement Information</h1>
<form action="SubmitReimbursement.jsp">
	Enter Your User Id:<input type="text" name="userid"><br>
	Enter Amount To Reimbursement:<input type="number" name =amount><br>
	Enter Purpose For Reimbursement:<input type="text" name = purpose><br>
	<input type="submit" value="submit">
</form>
</body>
</html>