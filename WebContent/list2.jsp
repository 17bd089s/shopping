<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome shopping!</title>
</head>
<body class="list2-body">
	<!-- メニュー -->
	<jsp:include page="/menu2.jsp" />

	<h3>商品一覧</h3>
	<c:forEach items="${items}" var="item">
	<form action="/shopping/check.jsp?action=productdel" method="post">
		商品番号：${item.code}
		<input type ="submit" value="商品を削除" class="botan">
		<input type="hidden" name="code" value="${item.code}" />
	</form>

	<form action="/shopping/InfoServlet?action=del" method="post">
		商品名：${item.name}<br />
		価格（税込）：${item.price}円<br />
		詳細情報：${item.info}
		<input type="hidden" name="code" value="${item.code}" />
		<input type ="submit" value="削除" class="botan">
	</form>

	<form action="/shopping/InfoServlet?action=edit" method="post">
		<input type ="text" name="info" value="${item.info}"/>
		<input type="hidden" name="code" value="${item.code}" />
		<input type ="submit"  value="編集" class="botan">
	</form><br>
	</c:forEach>

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