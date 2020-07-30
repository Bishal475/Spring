<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Marks Calculator</title>
<style>
	table,td,tr{
		padding: 5px;
		border: 0px;
		align-items: center;
	}
</style>
</head>
<body>
	<h2>Marks</h2>
	<table>
		<tr>
			<td>Science Marks : </td>
			<td><%out.println(request.getParameter("science")); %></td>
		</tr>
		<tr>
			<td>Maths Marks : </td>
			<td><%out.println(request.getParameter("maths")); %></td>
		</tr>
		<tr>
			<td>English Marks : </td>
			<td><%out.println(request.getParameter("eng")); %></td>
		</tr>
		<tr>
			<td colspan="2">Total Marks : ${ marks }</td>
		</tr>
	</table>
</body>
</html>