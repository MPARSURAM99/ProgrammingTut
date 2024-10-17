<%@page import="in.cutm.model.Location"%>
<%@page import="java.util.List"%>
<%@page import="in.cutm.dbConnection.ConnectDB"%>
<%@page import="in.cutm.dao.LocationDao"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="component/jstlTag.jsp"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Add New Room</title>
<%@ include file="component/bootStrapLink.jsp"%>
<%@ include file="component/fontAwesome.jsp"%>
<style>
body {
	font-family: 'Arial', sans-serif;
	background-color: #f0f0f0;
}

.form-container {
	max-width: 600px;
	margin: 50px auto;
	padding: 20px;
	background-color: #fff;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	border-radius: 10px;
}

.container {
	margin-top: 170px;
}

.container h3 {
	color: #0d6efd;
}
</style>
</head>

<body>
	<%@ include file="component/commonNavBar.jsp"%>
	<%@ include file="component/adminTab.jsp"%>

	<div class="container">
		<div class="form-container">
			<h3 class="text-center mb-4">Add New Room</h3>
			<c:if test="${not empty adRoomSucMsg }">
				<p class="text-center text-success">${adRoomSucMsg}</p>
				<c:remove var="adRoomSucMsg" />
			</c:if>

			<c:if test="${not empty addRoomFailMsg }">
				<p class="text-center text-danger">${addRoomFailMsg}</p>
				<c:remove var="addRoomFailMsg" />
			</c:if>
			<form action="addRoom" method="post">
				<div class="form-group mb-3">
					<label for="location">Location</label> <select class="form-select"
						aria-label="Default select example" id="location" name="addRoomLocation"
						required>
						<option value="" selected disabled>Please select a
							location</option>
						<%
						LocationDao daoLoc = new LocationDao(ConnectDB.dbconnect());
						List<Location> list = daoLoc.displayLocation();

						for (Location l1 : list) {
						%>
						<option value="<%=l1.getBranchName()%>"><%=l1.getBranchName()%></option>
						<%
						}
						%>
					</select>
				</div>

				<div class="form-group mb-3">
					<label for="roomNumber">Room Id</label> <input type="number"
						class="form-control" id="roomNumber"
						placeholder="Enter room number" name="roomNumber" required>
				</div>

				<div class="form-group mb-3">
					<label for="roomType">Category</label> <select class="form-select"
						aria-label="Default select example" id="roomType" name="roomType"
						required>
						<option value="" disabled selected>Select room type</option>
						<option value="Deluxe">Deluxe</option>
						<option value="Double">Double</option>
						<option value="Suite">Suite</option>
						<option value="Normal">Normal</option>
					</select>
				</div>

				<div class="form-group mb-3">
					<label for="capacity">Capacity</label> <input type="number"
						class="form-control" id="capacity"
						placeholder="Enter room capacity" name="capacity" required>
				</div>

				<div class="form-group mb-3">
					<label for="pricePerNight">Price Per Night</label> <input
						type="number" step="0.01" class="form-control" id="pricePerNight"
						placeholder="Enter price per night" name="pricePerNight" required>
				</div>

				<div class="form-group mb-3">
					<label for="AC">AC</label> <select class="form-select"
						aria-label="Default select example" id="AC" name="ac">
						<option value="" disabled selected>Select AC option</option>
						<option value="Available">Available</option>
						<option value="Not Available">Not Available</option>
					</select>
				</div>

				<div class="form-group mb-3">
					<label for="Meal">Meal</label> <select class="form-select"
						aria-label="Default select example" id="Meal" name="meal">
						<option value="" disabled selected>Select Meal option</option>
						<option value="Included">Included</option>
						<option value="Not Included">Not Included</option>
					</select>
				</div>

				<div class="form-group mb-3">
					<label for="Wifi">Wifi</label> <select class="form-select"
						aria-label="Default select example" id="Wifi" name="wifi">
						<option value="" disabled selected>Select Wifi option</option>
						<option value="Available">Available</option>
						<option value="Not Available">Not Available</option>
					</select>
				</div>

				<div class="form-group mb-3">
					<label for="Couple">Couple</label> <select class="form-select"
						aria-label="Default select example" id="Couple" name="couple">
						<option value="" disabled selected>Select Couple option</option>
						<option value="Allowed">Allowed</option>
						<option value="Not Allowed">Not Allowed</option>
					</select>
				</div>

				<div class="form-group mb-3">
					<label for="Parking">Parking</label> <select class="form-select"
						aria-label="Default select example" id="Parking" name="parking">
						<option value="" disabled selected>Select Parking option</option>
						<option value="Available">Available</option>
						<option value="Not Available">Not Available</option>
					</select>
				</div>

				<div class="form-group mb-3">
					<label for="roomImage">Room Image</label> <input type="file"
						class="form-control" id="roomImage" name="roomImage" required>
				</div>

				<div class="form-group mb-3">
					<label for="status">Status</label> <input type="text"
						class="form-control" id="status" value="Available" name="status"
						required>
				</div>

				<div class="text-center">
					<input type="submit" value="Add Room">
				</div>
			</form>
		</div>
	</div>

	<script>
		document.querySelector('form').onsubmit = function() {
			var roomNumber = document.getElementById('roomNumber').value;
			console.log('Room Number before submit:', roomNumber);
		};
	</script>
</body>
</html>
