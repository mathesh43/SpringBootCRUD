<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" href="css/adminmenu.css"></link>
</head>

<title>Employee Management Screen</title>
</head>
<body>

<ul>
  <li ><a class="stable"  >Library Management System</a></li>
  <li><a class="active" href="#">Home</a></li>
  <li><a class="active" href="#">Books</a></li>
  <li><a class="active" href="#">Category</a></li>
  <li><a class="active" href="#">Rack</a></li>
  <li><a class="active" href="#">Member</a></li>
     <li><a class="active" href="/logout">Logout</a></li>
</ul>
	<div align="center">
		<h1>Name List</h1>

		<table border="1">
			<th>id</th>
			<th>firstname</th>
			<th>lastname</th>
			<th>Action</th>


			<c:forEach var="list" items="${listname}">
				<tr>

					<td>${list.id}</td>
					<td>${list.firstname}</td>
					<td>${list.lastname}</td>
					<td><a href="/edit?id=${list.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a href="delete/${list.id}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			New name Register <a href="/welcome">here</a>
		</h4>
	</div>
</body>
</html>