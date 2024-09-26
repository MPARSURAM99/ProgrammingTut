<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to registration</h1>
	<form action="registrationForm" method="post">
		<input type="text" name="userName" placeholder="Enter your name." required="required"> <br>
		<label>Male</label> <input type="radio" name="userGender" value="Male" required="required" > <label>Female</label> <input type="radio" name="userGender" value="Female" required="required"> <br>
		<select name="userCity" required="required">
			<option>Cuttack<option/>
			<option>Bhubaneswar<option/>
			<option>Sambalpur<option/>
			<option>Anugul<option/>
			<option>Balasore<option/>
			<option>Puri<option/>
		</select> <br>
		<input type="email" name="userEmail" placeholder="Enter your email Id" required="required"> <br>
		<input type="password" name="userPassword" placeholder="Enter your password." required="required"> <br>
		<input type="submit" value="Register">
	</form>
</body>
</html>