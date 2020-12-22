<%@page import="com.vwits.demo.models.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RESULT</title>
</head>
<body>
	<h2>RESULT PAGE</h2>
	<%
		Employee e = (Employee) request.getAttribute("data");
		if (e != null) {
			out.println(e);
		}
	%>
</body>
</html>