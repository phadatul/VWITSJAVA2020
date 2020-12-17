
<%
	out.println("Welcome JSP page...");
	String s = (String) request.getAttribute("data");
	if (s != null) {
		out.println(s);
	}
%>
