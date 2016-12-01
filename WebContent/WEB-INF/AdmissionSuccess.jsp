<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admission Successful</title>
</head>
<body>
	<h2>${msg}</h2>
	<h4>${headerMsg}</h4>
	<small>${headerMsg2}</small>
	<h2>Personal Details</h2>
	<h3>Name :  ${student1.studentName}</h3>
	<h3>ID : ${student1.studentId}</h3>
	<h3>Hobby :  ${student1.studentHobby}</h3>
	<h3>Mobile :  ${student1.studentMobile}</h3>
	<h3>DOB :  ${student1.studentDOB}</h3>
	<h3>Skill :  ${student1.studentSkills}</h3>
	
	<h2>Address</h2>
	<h3>Country : ${student1.studentAddress.country}</h3>
	<h3>City : ${student1.studentAddress.city}</h3>
	<h3>Street : ${student1.studentAddress.street}</h3>
	<h3>Pincode : ${student1.studentAddress.pincode}</h3>
	
	<!-- <table>
		<tr>
			<td></td>
		</tr>
	</table> -->
	
	
</body>
</html>