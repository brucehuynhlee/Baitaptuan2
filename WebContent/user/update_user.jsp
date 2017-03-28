<%@page import="com.baitaptuan.servlet.javabeans.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cập nhật thông tin người dùng</title>
<link href="resource/bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript"
	src="resource/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resource/js/jquery-3.1.1.min.js"></script>
</head>
<body>
    <% User user = (User)request.getAttribute("user"); %>
    <div class="container">
    <jsp:include page="page/header.jsp"></jsp:include>
		<form method="post" action="user/forward_update.jsp">
		    <div class="form-group hidden">
		        <input type="text" name="id" value="0">
		    </div>
			<div class="form-group">
				<label class="label-control" for="userName">Username: </label> <input
					class="form-control" type="text" name="userName" value="${user.getUserName() }"/>
			</div>
			<div class="form-group">
				<label class="label-control" for="firstName">First Name: </label> <input
					class="form-control" type="text" name="firstName" value="${user.getFirstName() }"/>
			</div>
			<div class="form-group">
				<label class="label-control" for="lastname">Last Name: </label> <input
					class="form-control" type="text" name="lastName" value="${user.getLastName() }" />
			</div>
			<div class="form-group">
				<label class="label-control" for="age">Age: </label> <input
					class="form-control" type="text" name="age" value=${user.getAge() } />
			</div>
			<div class="form-group">
				<label class="label-control" for="email">Email: </label> <input
					class="form-control" type="text" name="email" value="${user.getEmail() }" />
			</div>
			<div class="form-group">
				<label class="label-control" for="address">Address: </label> <input
					class="form-control" type="text" name="address" value="${user.getAddress() }" />
			</div>
			<div class="form-group">
				<label class="label-control" for="password">Password: </label> <input
					class="form-control" type="password" name="passWord" value="${user.getPassWord() }"/>
			</div>
			<div class="form-group">
				<label class="label-control" for="school">School: </label> <input
					class="form-control" type="text" name="school" value="${user.getSchool() }" />
			</div>
			<div class="form-group">
				<label class="label-control" for="class">Class: </label> <input
					class="form-control" type="text" name="classSchool" value="${user.getClassSchool() }" />
			</div>
			<div class="form-group">
				<label class="label-control" for="favourite">Favourite: </label>
				<textarea class="form-control" rows="5" name="favourite">${user.getFavourite() }</textarea>
			</div>
			<div class="form-group">
				<label class="label-control" for="archivement">Academic
					Achievement: </label>
				<textarea class="form-control" rows="5" name="archivement">${user.getArchivement() }</textarea>
			</div>
			<div class="form-group">
				<label class="label-control" for="research">Research: </label>
				<textarea class="form-control" rows="5" name="research">${user.getResearch() }</textarea>
			</div>

			<div class="form-group">
				<button class="btn btn-info" type="submit">Update</button>
				<a class="btn btn-primary" href="/Baitaptuan2/Login">Cancel</a>
			</div>
		</form>
	</div>
</body>
</html>