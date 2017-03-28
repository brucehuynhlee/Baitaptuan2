<%@page import="com.baitaptuan.servlet.javabeans.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Thông tin người dùng</title>
<link href="resource/bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript"
	src="resource/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resource/js/jquery-3.1.1.min.js"></script>
</head>
<body>
	<%
		User user = (User) request.getAttribute("user");
	%>
	<div class="container">
	<jsp:include page="page/header.jsp"></jsp:include>
	    <h1>Thông tin người dùng</h1>
		<h5>
			<a href="UpdateUser">Update</a><label>|</label><a href="DeleteUser">Delete</a>
		</h5>
		<table class="table table-border table-hover">
			<thead>
				<tr>
					<td>Thông tin</td>
					<td>Dữ liệu</td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>User Name</td>
					<td><%=user.getUserName()%></td>
				</tr>
				<tr>
					<td>First Name</td>
					<td><%=user.getFirstName() %></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><%=user.getLastName() %></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><%=user.getAge() %></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><%=user.getAddress() %></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><%=user.getEmail() %></td>
				</tr>
				<tr>
					<td>School</td>
					<td><%=user.getSchool() %></td>
				</tr>
				<tr>
					<td>Class</td>
					<td><%=user.getClassSchool() %></td>
				</tr>
				<tr>
					<td>Favourite</td>
					<td><%=user.getFavourite() %></td>
				</tr>
				<tr>
					<td>Archievement</td>
					<td><%=user.getArchivement() %></td>
				</tr>
				<tr>
					<td>Research</td>
					<td><%=user.getResearch() %></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>