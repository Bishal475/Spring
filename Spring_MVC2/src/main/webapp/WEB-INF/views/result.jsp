<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Top Movies</title>
</head>
<body>
	<h2>Top Movies</h2>
	<ul>
		<% List<String> lst = (List<String>)request.getAttribute("listMovies");
			for(String s : lst){%>
				<li><% out.println(s); %></li>
		<%} %>
	</ul>
</body>
</html>