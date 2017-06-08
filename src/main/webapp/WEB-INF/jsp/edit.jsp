<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet" href="css/adminmenu.css"></link>
<script src="js/emailvalidation.js"></script>
<title>Employee Management Screen</title>
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
<body>
  <div align="center">
    <h1>Edit the list</h1>

    <form action="/update" method="post" name="myForm"
    onsubmit="return validateForm();">
    <table  >
    <tr>
        <td>ID:</td>
        <td><input type="text" name="id" value="${member.id}" required readonly></td>
      </tr>
      <tr>
        <td>Name:</td>
        <td><input type="text" name="name" value="${member.name}" required></td>
      </tr>

      <tr>
        <td>Fathername:</td>
        <td><input type="text" name="fathername" value="${member.fathername}" required></td>
      </tr>
      <tr>
        <td>Contact No:</td>
        <td><input type="number" name="contactno" min="1"
          max="9999999999" value="${member.contactno}" required></td>
      </tr>

      <tr>
        <td>Date of Birth:</td>
        <td><input type="date" name="dob" value="${member.dob}"></td>
      </tr>
      <tr>
        <td>Email ID:</td>
        <td><input type="text" name="email" value="${member.email}"></td>
      </tr>
      <tr>
        <td>Aadhar Card No:</td>
        <td><input type="number" name="aadharcardno" min="1"
          max="9999999999999" value="${member.aadharcardno}" required></td>
      </tr>
      <tr>
        <td>Address:</td>
        <td><input type="text" name="address" value="${member.address}" required></td>
      </tr>



      <tr><td></td>
        <td><input background-color= "#032B60" type="submit" value="Submit"></td>
      </tr>
    </table>
  </form>




    <h4>
      Go to all list<a href="/list">here</a>
    </h4>
  </div>
</body>
</html>