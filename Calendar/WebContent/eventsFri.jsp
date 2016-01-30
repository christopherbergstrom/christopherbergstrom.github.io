<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Events</title>
</head>
<body>
	<h3>${calendar.dayName}, ${calendar.month} ${calendar.dayNum}</h3>
	<h4>Events</h4>
	<p>events.jsp</p>
	<%-- <p>${calendar.eventTime} ${calendar.eventName}</p> --%>
	<table id = "eventNames">
		<c:forEach var="eventName" items="${calendar.eventName}">
			<tr>
				<td>${eventName}</td>
			</tr>
		</c:forEach>
	</table>
	<table id = "eventTimes">
		<c:forEach var="eventTime" items="${calendar.eventTime}">
			<tr>
				<td>${eventTime}</td>
			</tr>
		</c:forEach>
	</table>
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
		<input type = "submit" name = "friday" value = "Add Event"/>
	</form>
	<form action = "deleteEvent.do" method = "POST">
		<input type = "submit" name = "friday" value = "Delete Event"/>
	</form>
	<form action = "index.html">
		<input type = "submit" name = "home" value = "Home"/>
	</form>
</body>
</html>