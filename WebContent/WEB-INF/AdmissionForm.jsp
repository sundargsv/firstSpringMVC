<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Enrollment 2017</title>
</head>
<body>
	<a href="/fistSpringMVC/admission?siteLanguage=en">English</a> | <a href="/fistSpringMVC/admission?siteLanguage=fr">French</a>
	<h3><spring:message code="label.mainHeading"></spring:message></h3>
	<h4>${headerMsg}</h4>
	<small>${headerMsg2}</small>
	<br/>
		<form:errors path="student1.*" />
	<br/>
	<form action="/fistSpringMVC/submitAdmissionForm.html" method="post">
		<input type="text" placeholder="Name" name="studentName" /><br/>
		<input type="text" placeholder="Student ID" name="studentId" /><br/>
		<input type="text" placeholder="Hobby" name="studentHobby" /><br/>
		<input type="text" placeholder="(+91) Mobile" name="studentMobile" /><br/>
		<input type="text" placeholder="DOB" name="studentDOB" /><br/>
		<p>Select any two skill set from the dropdown</p>
		<select name="studentSkills">
			<option value="Java Core">Java Core</option>
			<option value="Spring MVC">Spring MVC</option>
			<option value="Spring Core">Spring Core</option>			
		</select>
		<select name="studentSkills">
			<option value="Java Core">Java Core</option>
			<option value="Spring MVC">Spring MVC</option>
			<option value="Spring Core">Spring Core</option>			
		</select>
		<br/>
		<p>Student Address</p><br/>
		<input type="text" placeholder="Street" name="studentAddress.street" /><br/>
		<input type="text" placeholder="City" name="studentAddress.city" /><br/>
		<input type="text" placeholder="Country" name="studentAddress.country" /><br/>
		<input type="text" placeholder="pincode" name="studentAddress.pincode" /><br/>
		
		<input type="submit" value="Submit the form"/>
			
	</form>
</body>
</html>