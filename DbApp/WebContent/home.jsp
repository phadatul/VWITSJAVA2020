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
<h1>Choose Operation</h1>
<h3><a href="insert.jsp">Insert Employee</a></h3>
<h3><a href="getdata">Show data</a></h3>

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