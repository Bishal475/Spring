<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>
	<div align="center">
		<h2>Add Student</h2>
		<form:form action="save" method="post" modelAttribute="student">
			<table border="0" cellpadding="5">
				<tr>
					<td>Name : </td>
					<td><form:input path="name"/></td>
				</tr>
				<tr>
					<td>Email : </td>
					<td><form:input path="email"/></td>
				</tr>
				<tr>
					<td>Address : </td>
					<td><form:input path="address"/></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Save" /></td>
				</tr>
			</table>
		</form:form>
		<h4><a href="view">View Student Details</a></h4>
	</div>
</body>
</html>