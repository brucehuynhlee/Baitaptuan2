<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<jsp:useBean id="user" class="com.baitaptuan.servlet.javabeans.User"
		scope="request">
		<jsp:setProperty name="user" property="*" />
	</jsp:useBean>
	<ul>
		<li>User Name: <jsp:getProperty name="user"
				property="archivement" />
		</li>
	</ul>
	
	<%
		RequestDispatcher rd = request.getRequestDispatcher("/UpdateUser");
		rd.forward(request, response);
	%>
</body>
</html>