<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet" href="css/adminmenu.css"></link>
<title>Employee Management Screen</title>
</head>
<ul>
  <li ><a class="stable"  >Library Management System</a></li>
  <li><a class="active" href="#">Home</a></li>
  <li><a class="active" href="#">Books</a></li>
  <li><a class="active" href="#">Category</a></li>
  <li><a class="active" href="#">Rack</a></li>
  <li><a class="active" href="#">Member</a></li>
   <li><a class="active" href="/logout">Logout</a></li>
</ul>
<body>
	<div align="center">
		<h1>Edit the list</h1>

		<form action="/update" method="get">
			ID:<br> <input type="text" name="id" value="${crudop.id}"
				readonly> <br> First name:<br> <input type="text"
				name="firstname" value="${crudop.firstname}" required> <br>
			Last name:<br> <input type="text" name="lastname"
				value="${crudop.lastname}" required> <br>
			<br> <input type="submit" value="Submit">
		</form>


		<h4>
			Go to all list<a href="/list">here</a>
		</h4>
	</div>
</body>
</html>