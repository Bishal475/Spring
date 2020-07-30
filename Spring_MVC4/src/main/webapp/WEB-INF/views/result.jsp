<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Top Movies</title>
</head>
<body>
	<h2>Top Movies</h2>
	<ul>
		<c:forEach items="${listMovies}" var="mov">
			<li>${ mov }</li>
		</c:forEach>
	</ul>
</body>
</html>