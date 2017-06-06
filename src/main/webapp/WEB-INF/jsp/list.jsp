<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
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
<div>

		<h1>Member list</h1>
		<h4 align="right"><a href="/add",method="post">To enter New book click here</a></h4>
		</div>
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