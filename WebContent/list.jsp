<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome shopping!</title>
</head>
<body class="list-body">
	<!-- メニュー -->
	<jsp:include page="/menu.jsp" />

	<h3>商品一覧</h3>
	<c:forEach items="${items}" var="item">
	<form action="/shopping/CartServlet?action=add" method="post">
		商品番号：${item.code}<br />
		商品名：${item.name}<br />
		価格（税込）：${item.price}円<br />

		<!-- 詳細情報を入力するコードを追加 -->
		詳細情報：${item.info}<br />

		個数：
		<select name="quantity">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
		</select>個<br/>
		<input type="hidden" name="item_code" value="${item.code}" />
		<input type="submit" value="カートに追加" class="botan">
	</form><br>
	</c:forEach>
</body>
</html>