<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student registration form</title>
</head>
<body>
	<form:form action="process-form" modelAttribute="student">
		<fieldset>
			<label>First name</label>
			<form:input path="firstName" /> 
		</fieldset>
		<fieldset>
			<label>Last name</label>
			<form:input path="lastName" /> 
		</fieldset>
		<fieldset>
			<form:select path="country">
				<form:options items="${countryOptions}" />				
			</form:select>
		</fieldset>
		<fieldset>
			<label>Favorite language</label>
			<form:radiobuttons path="favoriteLanguage" items="${languagesOptions}"  /> 
		</fieldset>
		
		<fieldset>
			<label>Operate System</label>
			<form:checkboxes path="operatingSystem" items="${systemsOptions}"  /> 
		</fieldset>
		
		<fieldset>
			<button type="submit">Save</button>
		</fieldset>
	</form:form>
</body>
</html>