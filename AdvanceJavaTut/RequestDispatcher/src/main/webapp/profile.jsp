<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Getting attribute from variable nameKay & Storing it by tc -->
	<%
		String yourName = (String) session.getAttribute("nameKey");
	%>
	<h1>Welcome to profile : <%= yourName %></h1> 
	
	<a href="./home.jsp">Home</a>
	<a href="about.jsp">About</a>
	<a href="logout">Logout</a>
</body>
</html>