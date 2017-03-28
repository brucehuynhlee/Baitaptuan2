<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Đăng kí tài khoản</title>
<link href="resource/bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript"
	src="resource/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resource/js/jquery-3.1.1.min.js"></script>
</head>
<body>
    <%
       if(session != null && session.getAttribute("id") != null) response.sendRedirect("ShowUser");
    %>
	<h3 class="text-center">Please fill full information on form below to register new
		account!</h3>
	<div class="container">
		<form method="post" action="forward_register.jsp">
		    <div class="form-group hidden">
		        <input type="text" name="id" value="0">
		    </div>
			<div class="form-group">
				<label class="label-control" for="userName">Username: </label> <input
					class="form-control" type="text" name="userName" />
			</div>
			<div class="form-group">
				<label class="label-control" for="firstName">First Name: </label> <input
					class="form-control" type="text" name="firstName" />
			</div>
			<div class="form-group">
				<label class="label-control" for="lastname">Last Name: </label> <input
					class="form-control" type="text" name="lastName" />
			</div>
			<div class="form-group">
				<label class="label-control" for="age">Age: </label> <input
					class="form-control" type="text" name="age" />
			</div>
			<div class="form-group">
				<label class="label-control" for="email">Email: </label> <input
					class="form-control" type="text" name="email" />
			</div>
			<div class="form-group">
				<label class="label-control" for="address">Address: </label> <input
					class="form-control" type="text" name="address" />
			</div>
			<div class="form-group">
				<label class="label-control" for="password">Password: </label> <input
					class="form-control" type="password" name="passWord" />
			</div>
			<div class="form-group">
				<label class="label-control" for="school">School: </label> <input
					class="form-control" type="text" name="school" />
			</div>
			<div class="form-group">
				<label class="label-control" for="class">Class: </label> <input
					class="form-control" type="text" name="classSchool" />
			</div>
			<div class="form-group">
				<label class="label-control" for="favourite">Favourite: </label>
				<textarea class="form-control" rows="5" name="favourite"></textarea>
			</div>
			<div class="form-group">
				<label class="label-control" for="archivement">Academic
					Achievement: </label>
				<textarea class="form-control" rows="5" name="archivement"></textarea>
			</div>
			<div class="form-group">
				<label class="label-control" for="research">Research: </label>
				<textarea class="form-control" rows="5" name="research"></textarea>
			</div>

			<div class="form-group">
				<button class="btn btn-primary" type="submit">Đăng kí</button>
			</div>
		</form>
		<label>If you have a account, please visit <a href="Login">login</a>
			to login your account.
		</label>
	</div>

</body>
</html>