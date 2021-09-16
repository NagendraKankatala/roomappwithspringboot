<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h3>Add Room</h3>
<form action="/add" method="post">
	<table border="1px" cellspacing="5px" cellpadding="5px">
		<tr>
			<td><label>Room Name:</label></td>
			<td><input type="text" name="roomName"></td>
		</tr>
		<tr>
			<td><label>Room Number:</label></td>
			<td><input type="number" name="roomNumber"></td>
		</tr>
		<tr>
			<td><label>Floor:</label></td>
			<td><input type="text" name="floor"></td>
		</tr>
		<tr>
			<td><label>Select Building:</label></td>
			<td><select name="building">
					<option value="BuildingA">BuildingA</option>
					<option value="BuildingB">BuildingB</option>
					<option value="BuildingC">BuildingC</option>
			</select></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Add Room"></td>
		</tr>
	</table>
</form>
<hr>
<h3>List Of Rooms</h3>
<br>
<table  border="1px" cellspacing="5px" cellpadding="5px">
	<thead>
		<tr>
			<th><b>SL NO</b></th>
			<th><b>Room Name</b></th>
			<th><b>Room Number</b></th>
			<th><b>Building</b></th>
			<th><b>Floor</b></th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${rooms}" var="room">
			<tr>
				<td><c:out value="${room.serialNumber}"></c:out></td>
				<td><c:out value="${room.roomName}"></c:out></td>
				<td><c:out value="${room.roomNumber}"></c:out></td>
				<td><c:out value="${room.building}"></c:out></td>
				<td><c:out value="${room.floor}"></c:out></td>
				<td><a href='/${room.roomNumber}/edit'>Edit</a> <a
					href='/${room.roomNumber}/delete'>Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>