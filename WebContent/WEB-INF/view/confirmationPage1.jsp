<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	
	<h1>Congratulations your registration is confirmed !!!!!!!!!!!!!!</h2>
	<h2>First Name :${student.firstName}</h2>
	<h2>Last Name :${student.lastName}</h2> 
	<h2>Student Age :${student.age}</h2>
	<h2>Country : ${student.country}</h2>		 
	<h2>Favorite Language : ${student.favoriteLang}</h2>
	<h2>Operating Systems : </h2>
	
	<ul>
		<jstl:forEach var="temp" items="${student.knownOS}">
			<li><h4>${temp}</h4></li>
		</jstl:forEach>
	</ul>
	
</body>
</html>