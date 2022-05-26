<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
	<style>
		.error {color:red}
	</style>
</head>
<body>
		<h1>Please fill in below form</h1>
		<h4>* fields are mandatory</h4>
		<hr>
		<%-- <form action="processForm" method="get" >
			FirstName : <input type="text" name="firstName" > 
			<br>
			LastName : <input type="text" name="lastName" >
			<br>
			<input type="submit" value="SUBMIT"> 
		</form>	 --%>
		
		<form:form action="processForm1" method="get" modelAttribute="student">
		
			First Name(*) : <form:input path="firstName"></form:input>
						 <form:errors path="firstName" cssClass="error"></form:errors>
			<br>
			<br>
			Last Name : <form:input path="lastName"></form:input>
			<br>
			Age : <form:input path="age"/>
				  <form:errors path="age" cssClass="error"></form:errors>
			<br>
			Country : <form:select path="country">
						<%-- <form:option value="India" label="IND"/>
						<form:option value="United States Of America" label="USA"/>
						<form:option value="Canada" label="CAN"/>
						<form:option value="Italy" label="ITL"/> --%>
						<form:options items="${student.countryOptions}"/>
					</form:select>
			<br>
			<br>
			Favorite Language : 
			Java <form:radiobutton path="favoriteLang" value="Java"/> 
			Python <form:radiobutton path="favoriteLang" value="Python"/>
			C++ <form:radiobutton path="favoriteLang" value="C++"/>
			<!-- Assignment -->
			<%-- <form:radiobuttons items="${student.countryOptions}"> --%>
			<br>
			<br>
			
			Operating System known : 
			<form:checkbox path="knownOS" value="Windows" label="Windows"/>
			<form:checkbox path="knownOS" value="Linux" label="Linux"/>
			<form:checkbox path="knownOS" value="Ubuntu" label="Ubuntu"/>
			<form:checkbox path="knownOS" value="MacOS" label="MacOs"/>
			<!-- Assignment -->
			<%-- <form:checkboxes items="" path=""/> --%>
			
			<br>
				AreaCode(*) : <form:input path="areaCode"/>
				<form:errors path="areaCode" cssClass="error"></form:errors>
			<br><br>
			
			
			<input type="submit" value="Submit">
			
		</form:form>
	
</body>
</html>