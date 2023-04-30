<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student | Info</title>
</head>
<body>
	<h2>student information</h2>
	<form action="saveStudentInfo" method="post">
		<pre>
			Id<input type="text" name="id"/>
			First Name<input type="text" name="firstName"/>
			Last Name<input type="text" name="lastName"/>
			Course<input type="text" name="course"/>
			Country<input type="text" name="country"/>
			<input type="submit" value="save">
		</pre> 
	</form>
	${msg}
</body>
</html>