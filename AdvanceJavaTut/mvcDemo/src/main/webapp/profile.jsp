<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		User user = (User) session.getAttribute("registeredUser");
	%>
	<h1>Welcome to your profile.</h1>
	<h3>Name: <%= user.getName() %></h3>
	<h3>Gender: <%= user.getGender() %></h3>
	<h3>City: <%= user.getCity() %></h3>
	<h3>Email: <%= user.getEmail() %></h3>
	
	<a href="edit.jsp">Edit Profile</a> <br>
	<a href="logout">Logout</a>
</body>
</html>