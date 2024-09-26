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
		String aboutName = (String) session.getAttribute("nameKey");
	%>
	<h1>Welcome to about : <%= aboutName %></h1>
</body>
</html>