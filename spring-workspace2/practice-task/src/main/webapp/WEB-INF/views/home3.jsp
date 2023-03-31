<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show ticket page</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
</head>
<body>
		<h1>: Show Ticket :</h1>
		<br>
		<form action="checkAvailablity">
			Mobile Number : <input type="tel" pattern="[0-9]{10}" name="mobileNo"
				placeholder="9876543210" required><br>
			<br>Movie Name : <select name="mname" required><option
					value="Screen-1 RRR">Screen-1 RRR</option>
				<option value="Screen-2 Bahubali">Screen-2 Bahubali</option>
				<option value="Screen-3 ThankGod">Screen-3 ThankGod</option>
				<option value="Screen-4 Welcome">Screen-4 Welcome</option></select><br>
			<br>Show Date : <input type="date" name="sdate" id="showdate"
				required><br>
			<br>Show Time :<select name="sname" required><option
					value="Morning 10:00 AM">Morning 10:00 AM</option>
				<option value="Noon 14:30 PM">Noon 14:30 PM</option>
				<option value="Evening 18:00 PM">Evening 18:00 PM</option>
				<option value="Night 22:00 PM">Night 22:00 PM</option></select><br>
			<br>Ticket Type : <br>
			<input type="radio" name="tType" value="Economic - Rs.150" required>Economic
			- Rs.150 <input type="radio" name="tType" value="Platinum - Rs.250"
				required>Platinum - Rs.250 <br>
			<br>${message}:Number of Tickets : <input type="number" name="nticket"
				min="1" max="400" placeholder="400" required><br>
			<br>
			<button type="submit">Check Availablity</button>
		</form>
		<br>
		<br>
		<form action="payment">
			Payment Type : <select name="tType" required disabled><option
					value="CASH">CASH</option>
				<option value="CARD">CARD</option>
				<option value="UPI">UPI</option></select><br>
			<br>Transaction Number : <input type="text" name="tid" required
				disabled><br>
			<br>
			<button type="submit" disabled>Book now</button>
		</form>
	
	<script>if(${msg!=""})
    {
    alert('${msg}');
    }
var today = new Date();
var dd = String(today.getDate()).padStart(2, '0');
var dd5 = String(today.getDate()+4).padStart(2, '0');
var mm = String(today.getMonth() + 1).padStart(2, '0');
var yyyy = today.getFullYear();
today = yyyy + '-' + mm + '-' + dd;
today5 = yyyy + '-' + mm + '-' + dd5;
$('#showdate').attr('min',today);
$('#showdate').attr('max',today5);
</script>
</body>
</html>