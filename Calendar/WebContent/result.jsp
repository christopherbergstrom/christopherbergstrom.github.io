<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Results</title>
</head>
<body>
	<table>
		<tr><th colspan = "7">${calendar.month}</th></tr>
		<tr>
			<td>${calendar.sun}</td>
			<td>${calendar.mon}</td>
			<td>${calendar.tues}</td>
			<td>${calendar.wed}</td>
			<td>${calendar.thurs}</td>
			<td>${calendar.fri}</td>
			<td>${calendar.sat}</td>
		</tr>
		<tr>
			<td><form action = "addEvent.do"><input name = "sunday" type = "submit" value = ""/></form></td>
			<td><form action = "addEvent.do"><input name = "monday" type = "submit" value = ""/></form></td>
			<td><form action = "addEvent.do"><input name = "tuesday" type = "submit" value = ""/></form></td>
			<td><form action = "addEvent.do"><input name = "wednesday" type = "submit" value = ""/></form></td>
			<td><form action = "addEvent.do"><input name = "thursday" type = "submit" value = ""/></form></td>
			<td><form action = "addEvent.do"><input name = "friday" type = "submit" value = "1"/></form></td>
			<td><form action = "addEvent.do"><input name = "saturday" type = "submit" value = "2"/></form></td>
		</tr>
		<tr>
			<td><form action = "addEvent.do"><input name = "sunday" type = "submit" value = "3"/></form></td>
			<td><form action = "addEvent.do"><input name = "monday" type = "submit" value = "4"/></form></td>
			<td><form action = "addEvent.do"><input name = "tuesday" type = "submit" value = "5"/></form></td>
			<td><form action = "addEvent.do"><input name = "wednesday" type = "submit" value = "6"/></form></td>
			<td><form action = "addEvent.do"><input name = "thursday" type = "submit" value = "7"/></form></td>
			<td><form action = "addEvent.do"><input name = "friday" type = "submit" value = "8"/></form></td>
			<td><form action = "addEvent.do"><input name = "saturday" type = "submit" value = "9"/></form></td>
		</tr>
		<tr>
			<td><form action = "addEvent.do"><input name = "sunday" type = "submit" value = "10"/></form></td>
			<td><form action = "addEvent.do"><input name = "monday" type = "submit" value = "11"/></form></td>
			<td><form action = "addEvent.do"><input name = "tuesday" type = "submit" value = "12"/></form></td>
			<td><form action = "addEvent.do"><input name = "wednesday" type = "submit" value = "13"/></form></td>
			<td><form action = "addEvent.do"><input name = "thursday" type = "submit" value = "14"/></form></td>
			<td><form action = "addEvent.do"><input name = "friday" type = "submit" value = "15"/></form></td>
			<td><form action = "addEvent.do"><input name = "saturday" type = "submit" value = "16"/></form></td>
		</tr>
		<tr>
			<td><form action = "addEvent.do"><input name = "sunday" type = "submit" value = "17"/></form></td>
			<td><form action = "addEvent.do"><input name = "monday" type = "submit" value = "18"/></form></td>
			<td><form action = "addEvent.do"><input name = "tuesday" type = "submit" value = "19"/></form></td>
			<td><form action = "addEvent.do"><input name = "wednesday" type = "submit" value = "20"/></form></td>
			<td><form action = "addEvent.do"><input name = "thursday" type = "submit" value = "21"/></form></td>
			<td><form action = "addEvent.do"><input name = "friday" type = "submit" value = "22"/></form></td>
			<td><form action = "addEvent.do"><input name = "saturday" type = "submit" value = "23"/></form></td>
		</tr>
		<tr>
			<td><form action = "addEvent.do"><input name = "sunday" type = "submit" value = "24"/></form></td>
			<td><form action = "addEvent.do"><input name = "monday" type = "submit" value = "25"/></form></td>
			<td><form action = "addEvent.do"><input name = "tuesday" type = "submit" value = "26"/></form></td>
			<td><form action = "addEvent.do"><input name = "wednesday" type = "submit" value = "27"/></form></td>
			<td><form action = "addEvent.do"><input name = "thursday" type = "submit" value = "28"/></form></td>
			<td><form action = "addEvent.do"><input name = "friday" type = "submit" value = "29"/></form></td>
			<td><form action = "addEvent.do"><input name = "saturday" type = "submit" value = "30"/></form></td>
		</tr>
		<tr>
			<td><form action = "addEvent.do"><input name = "sunday" type = "submit" value = "31"/></form></td>
			<td><form action = "addEvent.do"><input name = "monday" type = "submit" value = ""/></form></td>
			<td><form action = "addEvent.do"><input name = "tuesday" type = "submit" value = ""/></form></td>
			<td><form action = "addEvent.do"><input name = "wednesday" type = "submit" value = ""/></form></td>
			<td><form action = "addEvent.do"><input name = "thursday" type = "submit" value = ""/></form></td>
			<td><form action = "addEvent.do"><input name = "friday" type = "submit" value = ""/></form></td>
			<td><form action = "addEvent.do"><input name = "saturday" type = "submit" value = ""/></form></td>
		</tr>
	</table>
	<form action = "index.html">
	<input type = "submit" name = "home" value = "Home"/>
	</form>
</body>
</html>