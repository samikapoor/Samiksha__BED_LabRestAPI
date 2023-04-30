<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Record</title>
</head>
<body>
	<h2>Update | Update record</h2>
	<form action="updateData" method="post">
		<pre>
			Id<input type="text" name="id" value="${student.id}"/>
			First Name<input type="text" name="name" value="${student.firstName}"/>
			Last Name<input type="text" name="name" value="${student.lastName}"/>
			Course<input type="text" name="codes" value="${student.course}"/>
			Country<input type="text" name="name" value="${student.country}"/>
			<input type="submit" value="update">
		</pre>
	</form>
	${msg}

</body>
</html>