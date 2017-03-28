<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello men</title>
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
	<div class="container" style="text-align: center">
		<h3>Please enter your username and password to login, or visit <a href="Register">here</a> to register </h3>
		<br> <br>
		<form method="post" action="Login">
			<div class="form-group col-md-12">
				<label class="col-md-offset-3 col-md-2">Username: </label>
				<div class="col-md-3">
					<input class="form-control" type="text" name="Username" />
				</div>
			</div>
			<div class="form-group col-md-12">
				<label class="col-md-offset-3 col-md-2">Password: </label>
				<div class="col-md-3">
					<input class="form-control" type="password" name="Password" />
				</div>
			</div>
			<div class="form-group col-md-12">
				<div class="col-md-offset-5 col-md-3">
					<button class="btn btn-info" type="submit">Đăng nhập</button>
				</div>
			</div>
		</form>
	</div>
	<ul class="col-md-offset-4">
		<c:forEach items="${errorMessages}" var="errorMsg">
			<li><h4><label class="label label-danger">${errorMsg}</label></h4></li>
		</c:forEach>
	</ul>

</body>
</html>
