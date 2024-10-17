<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Management System</title>
<%@ include file="component/bootStrapLink.jsp" %>
</head>
<body class="bg-light">
	<%@ include file="component/navBar.jsp" %>
	
	
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="card">
					<div class="card-body">
						<table class="table">
							  <thead>
							    <tr>
							      <th scope="col">Full Name</th>
							      <th scope="col">DOB</th>
							      <th scope="col">Address</th>
							      <th scope="col">Qualification</th>
							      <th scope="col">Email</th>
							      <th scope="col">Action</th>
							    </tr>
							  </thead>
							  <tbody>
							    <tr>
							      <th scope="row">1</th>
							      <td>Mark</td>
							      <td>Otto</td>
							      <td>@mdo</td>
							      <td>@mdo</td>
							      <td>
							      	<a href="editStudent.jsp" class="btn btn-sm btn-primary">Edit</a>
							      	<a href="#" class="btn btn-sm btn-danger">Delete</a>
							      <td/>
							    </tr>
							    <tr>
							      <th scope="row">2</th>
							      <td>Jacob</td>
							      <td>Thornton</td>
							      <td>@fat</td>
							      <td>@mdo</td>
							    </tr>
							    <tr>
							      <th scope="row">3</th>
							      <td>Larry the Bird</td>
							      <td>@twitter</td>
							      <td>@mdo</td>
							      <td>@mdo</td>
							    </tr>
							  </tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>