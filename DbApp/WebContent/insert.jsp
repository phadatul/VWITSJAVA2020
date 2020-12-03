<%@page import="com.vwits.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="insertdata" method="post">
		<input type="number" name="txtEmpid" placeholder="Enter ID here"
			required="required"> <br> <input type="text"
			name="txtEmpname" placeholder="Enter Name here" required="required">
		<br> <input type="number" name="txtSalary"
			placeholder="Enter Salary here" required="required"><br>
		<input type="submit" />
	</form>
	<table align="center" border="1">
		<%
			List<Employee> list = (List<Employee>) request.getAttribute("data");
			if (list != null) {
				for (Employee e : list) {
					;
					out.println("<tr> <td>" + e.getEmpid() + "</td> <td>" + e.getEname() + "</td> <td>" + e.getSalary()
							+ "</td>    </tr>");
				}
			}
		%>
	</table>
</body>
</html>