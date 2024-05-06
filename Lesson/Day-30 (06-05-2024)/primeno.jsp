<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	int from = Integer.parseInt(request.getParameter("from"));
	int to = Integer.parseInt(request.getParameter("to"));
	boolean yn = false;
	int count = 0;
	
	out.println("<body>");
	out.println("<table border='1' cellpadding='5'><tr>");
	for(int i=from; i<=to; i++) {
		yn = true;
		for(int j=2; j<i; j++) {
			if(i%j==0) {
				yn = false;
				break;
			}
		}
		if(yn) {
			out.println("<td>" + i + "</td>");
			count++;
			if(count>=15) {
				out.println("</tr><tr>");
				count = 0;
			}
		}
	}
	out.println("</tr></table>");
	out.println("</body>");
	%>
</body>
</html>