<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
		<h1>Please fill in below form</h1>
		<hr>
		<%-- <form action="processForm" method="get" >
			FirstName : <input type="text" name="firstName" > 
			<br>
			LastName : <input type="text" name="lastName" >
			<br>
			<input type="submit" value="SUBMIT"> 
		</form>	 --%>
		
		<form:form action="processForm1" method="get" modelAttribute="student">
		
			First Name : <form:input path="firstName"></form:input>
			<br>
			Last Name : <form:input path="lastName"></form:input>
			<br>
			<input type="submit">
			
		</form:form>
	
</body>
</html>