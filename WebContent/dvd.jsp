<%@page import="bean.ItemBean"%>
<%@page import="dao.ItemDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome shopping!</title>
</head>
<body>
	<!-- メニュー -->
	<a href="/shopping/snapshot/top.html">ようこそ|</a>
	<a href="/shopping/snapshot/book.html">本|</a>
	<a href="/shopping/snapshot/dvd.html">DVD|</a>
	<a href="/shopping/snapshot/game.html">ゲーム|</a>
	<a href="/shopping/snapshot/cart.html">カートを見る</a>

	<h3>商品一覧</h3>
	<form action="/shopping/snapshot/cart.html">

	<%
		ItemDAO dao = new ItemDAO();
		ItemBean bean = new ItemBean();
	%>

		商品番号：4<br />
		商品名：なつかしのアニメシリーズ<br />
		価格（税込）：2000円<br />
		個数：
		<select name="quantity">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
		</select>個<br/>
		<input type="submit" value="カートに追加" />
	</form>
	<form action="/shopping/snapshot/cart.html">
		商品番号：5<br />
		商品名：The Racer<br />
		価格（税込）：1000円<br />
		個数：
		<select name="quantity">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
		</select>個<br/>
		<input type="submit" value="カートに追加" />
	</form>
	<form action="/shopping/snapshot/cart.html">
		商品番号：6<br />
		商品名：Space Wars 3<br />
		価格（税込）：1800円<br />
		個数：
		<select name="quantity">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
		</select>個<br/>
		<input type="submit" value="カートに追加" />
	</form>
</body>
</html>