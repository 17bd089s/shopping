<%@page import="bean.ItemBean2"%>
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
	ItemBean2  bean7 = new ItemBean2();
	ItemBean2  bean8 = new ItemBean2();
	ItemBean2  bean9 = new ItemBean2();
	%>
		商品番号：7<br />
		商品名：パズルゲーム<br />
		価格（税込）：780円<br />
		詳細情報：<%= bean7.getInfo1() %>
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
		商品番号：8<br />
		商品名：Invader Fighter<br />
		価格（税込）：3400円<br />
		詳細情報：<%= bean8.getInfo1() %>
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
		商品番号：9<br />
		商品名：Play the BascketBall<br />
		価格（税込）：2200円<br />
		詳細情報：<%= bean9.getInfo1() %>
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