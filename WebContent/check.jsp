<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String code = request.getParameter("code"); %>
<% int itemcode = Integer.parseInt(code); %>
<% request.setAttribute("itemcode", itemcode); %>


<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/stylesheet.css" >
<meta charset="UTF-8">
<title>削除確認</title>
</head>
<body class="check-body">

	<!-- メニュー -->
	<jsp:include page="/menu2.jsp" />

	<h3>本当に消去してもよろしいですか</h3>
	<form action="/shopping/InfoServlet?action=productdel" method="post">
		<input type ="submit" value="はい" />
		<input type="hidden" name="code" value="${itemcode}" />
	</form><br>
	<form action="/shopping/list2.jsp?action=return" method="post">
		<input type ="submit" value="いいえ" />
	</form>

	<%--
	<c:forEach items="${items}" var="item">
	<form action="/shopping/InfoServlet?action=edit" method="post">
		商品番号：${item.code}<br />
		商品名：${item.name} --%>
</body></html>