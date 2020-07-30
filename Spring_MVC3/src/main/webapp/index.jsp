<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<form action="add" method="GET">
	<table>
		<tr>
			<td>Science Marks : </td>
			<td><input type="number" name="science"/></td>
		</tr>
		<tr>
			<td>Maths Marks : </td>
			<td><input type="number" name="maths"/></td>
		</tr>
		<tr>
			<td>English Marks : </td>
			<td><input type="number" name="eng"/></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Total Marks"/></td>
		</tr>
	</table>
	</form>
</body>
</html>