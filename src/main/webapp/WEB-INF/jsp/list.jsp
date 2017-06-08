<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>

<link rel="stylesheet" href="css/adminmenu.css"></link>
</head>

<title>Member details</title>
<style>

</style>
</head>
<body>

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



<table>
		<tr> <td></td><td><h1><u>Member list</u></h1></td></tr>
		<tr>
		<td></td>
			<td> <form action="/search">
		<input type="text" name="search" value= "${searchkey }" required>
		<input type="submit"  value="search">
		</form> </td>

		<td></td>

		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
				<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
<td></td>
<td><h4 align="right"><a href="/add",method="post">NEW</a></h4></td></tr>
</table>
	<div align="center">


		<table border="1px solid black">
			<th>ID</th>
			<th>Name</th>
			<th>Fathername</th>
			<th>Contact no</th>

			<th>Date of Birth</th>
			<th>Email id</th>
			<th>Aadhar card no</th>
			<th>Address</th>
			<th>Action</th>


			<c:forEach var="list" items="${listname}">
				<tr>

					<td>${list.id}</td>
					<td>${list.name}</td>
					<td>${list.fathername}</td>
					<td>${list.contactno}</td>
					<td>${list.dob}</td>
					<td>${list.email}</td>
					<td>${list.aadharcardno}</td>
					<td>${list.address}</td>
					<td><a href="/edit?id=${list.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a href="delete/${list.id}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>

	</div>

</body>
</html>