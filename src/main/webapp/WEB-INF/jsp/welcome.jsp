<html>
<head>
<link rel="stylesheet" href="css/adminmenu.css"></link>
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
<h1>To add user </h1>
<form action="/add" method="post">
	First name:<br> <input type="text" name="firstname" value="Mickey" required> <br> 
	Last name:<br> <input type="text" name="lastname" value="Mouse" required> <br>
	<br> <input type="submit" value="Submit">
</form>
</html>