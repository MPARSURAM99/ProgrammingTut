<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to login page</h1>
	<form action="loginForm" method="post">
		<input type="email" name="userEmail" placeholder="Enter your email Id." required="required"> <br>
		<input type="password" name="userPassword" placeholder="Enter your password." required="required"> <br>
		<input type="submit" value="login">
	</form>
</body>
</html>