<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome shopping!</title>
</head>
<body class="product-body">
	<!-- メニュー -->
	<jsp:include page="/menu2.jsp" />


	<form action="/shopping/NewProductServlet?action=del" method="post">
		<br>
		商品名：<input type ="text" name="name" /><br />
		カテゴリーコード：<select name="category_code">
			<option value="1">1：本</option>
			<option value="2">2：DVD</option>
			<option value="3">3：ゲーム</option>
		</select><br />
		価格（税込）：<input type ="text" name="price" /><br />
		詳細情報：	<input type ="text" name="info" /><br />
		<input type ="submit" value="新規登録" class="botan">
	</form>

	<%--
	<c:forEach items="${items}" var="item">
	<form action="/shopping/InfoServlet?action=edit" method="post">
		商品番号：${item.code}<br />
		商品名：${item.name}<br />
		価格（税込）：${item.price}円<br />
		詳細情報：${item.info}<br />
		<input type ="text" name="info" />
		<input type="hidden" name="code" value="${item.code}" />
		<input type ="submit" value="編集" />
	</form>

	<form action="/shopping/InfoServlet?action=del" method="post">
		<input type="hidden" name="code" value="${item.code}" />
		<input type ="submit"  value="削除" />
	</form><input type ="text" name="info" />
		<input type="hidden" name="code" value="${item.code}" />
		<input type ="submit" value="編集" />
	</c:forEach>
	--%>
</body>
</html>