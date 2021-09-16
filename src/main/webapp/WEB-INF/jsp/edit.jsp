<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h3>Edit Room</h3>
<form action='/update' method='post'>
    <table border="1px" cellspacing="5px" cellpadding="5px">
        <tr>
            <td><b>Room Name</b></td>
            <td><input type='text' name='roomName'  value="${room.roomName}" /></td>
        </tr>
        <tr>
            <td><b>Room Number</b></td>
            <td><input type='number' name='roomNumber'  value="${room.roomNumber}" readonly/></td>
        </tr>
   		<tr>
            <td><b>Floor</b></td>
            <td><input type='text' name='floor'  value="${room.floor}" /></td>
       </tr>
        <tr>
            <td><b>Building</b></td>
            <td><input type='text' name='building'  value="${room.building}" /></td>
       </tr>
        <tr>
            <td></td>
            <td>
                <button type="submit">Update Room</button>
            </td>
        </tr>
    </table>
</form>

