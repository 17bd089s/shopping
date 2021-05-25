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
	ItemBean2  bean1 = new ItemBean2();
	ItemBean2  bean2 = new ItemBean2();
	ItemBean2  bean3 = new ItemBean2();
	%>


<%--
	daoからデータをとってくる
	daoのfbカテゴリーみたいなメソッドを使う
	menue.jspを参照
	forEachを使う
	list2.jspに1つにまとめることができる
 --%>

		商品番号：1<br />
		商品名：javaの基礎<br />
		価格（税込）：2500円<br />

		<%--商品情報の追加 --%>
		著者：<%= bean1.getInfo1() %>

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
		商品番号：2<br />
		商品名：MLB Funs<br />
		価格（税込）：980円<br />
		著者：<%= bean2.getInfo1() %>

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
		商品番号：3<br />
		商品名：料理BOOK!<br />
		価格（税込）：1200円<br />
		著者：<%= bean3.getInfo1() %>

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