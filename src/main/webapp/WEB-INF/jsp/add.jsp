<html>
<head>
<link rel="stylesheet" href="css/adminmenu.css"></link>
    <script src="js/emailvalidation.js"></script>
</head>



<div class="tab">
<ul>
<li><a class="mainmenu">Library Management System</a></li>
</ul>
</div>
<ul>
	
	<li><a class="active" href="/home">Home</a></li>
	<li><a class="active" href="/books">Books</a></li>
	<li><a class="active" href="/category">Category</a></li>
	<li><a class="active" href="/rack">Rack</a></li>
	<li><a class="activebar" href="/list">Member</a></li>
	<li><a class="mainmenu1" href="/logout">Logout</a></li>
</ul>
<div align="center">
	<h1>Add Member</h1>
	<form action="/save" method="post" name="myForm"
		onsubmit="return validateForm();">
		<table  >
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" value="" required></td>
			</tr>
			
			<tr>
				<td>Fathername:</td>
				<td><input type="text" name="fathername" value="" required></td>
			</tr>
			<tr>
				<td>Contact No:</td>
				<td><input type="number" name="contactno" min="1"
					max="9999999999" required></td>
			</tr>
			<tr>
				<td>Date of Birth:</td>
				<td><input type="date" name="dob"></td>
			</tr>
			<tr>
				<td>Email ID:</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Aadhar Card No:</td>
				<td><input type="number" name="aadharcardno" min="1"
					max="9999999999999" required></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><input type="text" name="address" value="" required></td>
			</tr>



			<tr><td></td>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
	<a href="/list">To see all </a>
</div>
</html>