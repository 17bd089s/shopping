<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
<meta charset="UTF-8">
<title>SelectProduct</title>
</head>
<body>
	<form action="/shopping/LoginServlet" method="post">
		ユーザ名：<input type="text" name="name"><br>
		パスワード：<input type="password" name="pw"><br>
		<input type="hidden" name="action" value="login">
		<input type="submit" value="ログイン">
	</form>


</body>
</html>