<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Events</title>
</head>
<body>
	<h3>${calendar.dayName}, ${calendar.month} ${calendar.dayNum}</h3>
	<p>Event</p>
	<form action = "addEvent.do" method = "POST">
		<input type = "text" name = "name" placeholder = "Name of Event"/>
		<select>
			<option>12:00 AM</option>
			<option>1:00 AM</option>
			<option>2:00 AM</option>
			<option>3:00 AM</option>
			<option>4:00 AM</option>
			<option>5:00 AM</option>
			<option>6:00 AM</option>
			<option>7:00 AM</option>
			<option>8:00 AM</option>
			<option>9:00 AM</option>
			<option>10:00 AM</option>
			<option>11:00 AM</option>
			<option>12:00 PM</option>
			<option>1:00 PM</option>
			<option>2:00 PM</option>
			<option>3:00 PM</option>
			<option>4:00 PM</option>
			<option>5:00 PM</option>
			<option>6:00 PM</option>
			<option>7:00 PM</option>
			<option>8:00 PM</option>
			<option>9:00 PM</option>
			<option>10:00 PM</option>
			<option>11:00 PM</option>
		</select>
		<input type = "submit" value = "Add Event"/>
	</form>
</body>
</html>