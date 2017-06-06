<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
 <link rel="stylesheet" href="css/login.css"></link>
</head>
<body>

<ul>
  <li><a class="active" >LIBRARY MANAGEMENT SYSTEM</a></li>
</ul>

<div class="form_center">
    <h2>Login Form</h2>

<form action="login" , method="post">
  <div class="container">
   <input type="text" placeholder="Enter Username" name="username" required>
    <input type="password" placeholder="Enter Password" name="password" required>
     <button type="button" class="button">Cancel</button>  
    <button type="submit" class="button">Login</button><br>
  </div>    
  </div>
</form>
</div>
</body>
</html>
