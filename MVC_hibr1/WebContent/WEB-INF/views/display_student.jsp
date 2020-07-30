<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	<div align="center">
		<h2>Student Details</h2>
		<table border="1" cellpadding="5">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Address</th>
			</tr>
			<c:forEach items="${listStudent}" var="stud">
				<tr>
					<td>${stud.id}</td>
					<td>${stud.name}</td>
					<td>${stud.email}</td>
					<td>${stud.address}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>