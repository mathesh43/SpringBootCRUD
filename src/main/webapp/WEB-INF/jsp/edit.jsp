<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>Employee Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Edit the list</h1>
		<h2>${id}</h2>

		<table border="1">
			<th>id</th>
			<th>firstname</th>
			<th>lastname</th>
				
				<c:forEach var="list" items="${edit}">
				<tr>

					<td>${list.id}</td>
					<td>${list.firstname}</td>
					<td>${list.lastname}</td>
					<td><a href="edit/${list.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="delete/${list.id}">Delete</a></td>

				</tr>
			</c:forEach>
			
		</table>
		<h4>
			Go to all list<a href="/list">here</a>
		</h4>
	</div>
</body>
</html>