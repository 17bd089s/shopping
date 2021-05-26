<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome shopping!</title>
</head>
<body>
	<!-- メニュー -->
	<jsp:include page="/menu2.jsp" />

	<h3>商品一覧</h3>
	<c:forEach items="${items}" var="item">
	<form action="/shopping/InfoServlet?action=add" method="post">
		商品番号：${item.code}<br />
		商品名：${item.name}<br />
		価格（税込）：${item.price}円<br />
		詳細情報：${item.info}<br />
		<input type ="text" name="info" />
		<input type="hidden" name="code" value="${item.code}" />
		<input type ="submit" value="編集" />

	</form>
	</c:forEach>
</body>
</html>