<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel = "stylesheet" type = "text/css" href = "normalize.css"/>
<link rel = "stylesheet" type = "text/css" href = "calendar.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${calendar.dayName}, ${calendar.month} ${calendar.dayNum}</title>
</head>
<body>
	<table id = "eventTable">
		<tr><th id = "head">${calendar.dayName}, ${calendar.month} ${calendar.dayNum}</th></tr>
		<c:forEach var="event" items="${calendar.event}">
			<tr>
				<td>
					<form action = "deleteEvent.do" method = "POST">
						<input class = "buttons" type = "submit" name = "sunday" value = "Delete Event"/>
						<input type = "hidden" name = "hidden" value = "${event}"/>
						<span id = "event">${event}</span>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
	<div id = "bottomForms">
	<form action = "createEvent.do" method = "POST">
		<input type = "text" name = "event" placeholder = "Name of Event"/>
		<select name = "time">
			<option value = "12:00 AM">12:00 AM</option>
			<option value = "1:00 AM">1:00 AM</option>
			<option value = "2:00 AM">2:00 AM</option>
			<option value = "3:00 AM">3:00 AM</option>
			<option value = "4:00 AM">4:00 AM</option>
			<option value = "5:00 AM">5:00 AM</option>
			<option value = "6:00 AM">6:00 AM</option>
			<option value = "7:00 AM">7:00 AM</option>
			<option value = "8:00 AM">8:00 AM</option>
			<option value = "9:00 AM">9:00 AM</option>
			<option value = "10:00 AM">10:00 AM</option>
			<option value = "11:00 AM">11:00 AM</option>
			<option value = "12:00 PM">12:00 PM</option>
			<option value = "1:00 PM">1:00 PM</option>
			<option value = "2:00 PM">2:00 PM</option>
			<option value = "3:00 PM">3:00 PM</option>
			<option value = "4:00 PM">4:00 PM</option>
			<option value = "5:00 PM">5:00 PM</option>
			<option value = "6:00 PM">6:00 PM</option>
			<option value = "7:00 PM">7:00 PM</option>
			<option value = "8:00 PM">8:00 PM</option>
			<option value = "9:00 PM">9:00 PM</option>
			<option value = "10:00 PM">10:00 PM</option>
			<option value = "11:00 PM">11:00 PM</option>
		</select>
		<input class = "buttons" type = "submit" name = "monday" value = "Add Event"/>
	</form>
	<form id = "homeButton" action = "index.html">
		<input class = "buttons" type = "submit" name = "home" value = "Home"/>
	</form>
	<form action = "date.do">
		<input class = "buttons" type = "submit" name = "calendar" value = "Back to ${calendar.month}"/>
		<input type = "hidden" name = "name" value = "${calendar.month}"/>
	</form>
	</div>
</body>
</html>