<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer registration form</title>
</head>
<body>
	<form:form action="process-form" modelAttribute="customer">
		<fieldset>
			<label>First name</label>
			<form:input path="firstName" />			
		</fieldset>
		<fieldset>
			<label>Last name</label>
			<form:input path="lastName" />
			<form:errors path="lastName" cssClass="error" />
		</fieldset>
		<fieldset>
			<label>Age</label>
			<form:input path="age" />
			<form:errors path="age" cssClass="error" />
		</fieldset>		
		<fieldset>
			<label>Postal Code</label>
			<form:input path="postalCode" />
			<form:errors path="postalCode" cssClass="error" />
		</fieldset>
		<fieldset>
			<label>Course Code</label>
			<form:input path="courseCode" />
			<form:errors path="courseCode" cssClass="error" />
		</fieldset>		
		<fieldset>
			<button type="submit">Save</button>
		</fieldset>
	</form:form>
</body>
</html>