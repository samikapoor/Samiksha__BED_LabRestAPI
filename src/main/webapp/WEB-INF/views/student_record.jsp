<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Student</title>
</head>
<body>
	<h2>List of students</h2>
	<table>
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Course</th>
			<th>Country</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
	<c:forEach items="${student}" var="student">
		<tr>
			<td>${student.id}</td>
			<td>${student.firstName}</td>
			<td>${student.lastName}</td>
			<td>${student.course}</td>
			<td>${student.country}</td>
			<td><a href="delete?id=${student.id}">delete</a></td>
			<td><a href="update?id=${student.id})">update</a></td>
		</tr>
		
	</c:forEach>
	</table>
	

</body>
</html>