<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String code = request.getParameter("code"); %>
<% int itemcode = Integer.parseInt(code); %>
<% request.setAttribute("itemcode", itemcode); %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/stylesheet.css" >

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>削除確認</title>
</head>
<body class="ckeck-body">

	<!-- メニュー -->
	<jsp:include page="/menu2.jsp" />

	<h3>本当に消去してもよろしいですか</h3>
	<form action="/shopping/InfoServlet?action=productdel" method="post">
		<input type ="submit" value="はい" />
		<input type="hidden" name="code" value="${itemcode}" />
	</form>
	<form action="/shopping/list2.jsp?action=return" method="post">
		<input type ="submit" value="いいえ" />
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