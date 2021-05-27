<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/stylesheet.css" >

<html>
<head>
<meta charset="UTF-8">
<title>SelectProduct</title>
</head>
<body class="login-body">
	<h3>ログインしてください</h3>

	<form action="/shopping/LoginServlet" method="post">
		ユーザ名<br>
		<input type="text" name="name"><br>
		パスワード<br>
		<input type="password" name="pw"><br>
		<input type="hidden" name="action" value="login">
		<input type="submit" value="ログイン">
	</form>


</body>
</html>