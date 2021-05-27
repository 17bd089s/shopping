<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/stylesheet.css" >

<!-- メニュー -->

<h1>管理者画面</h1>

<div class="category2">
<p>変更したい項目を選択してください</p>
<c:forEach items="${categories}" var="category">
<a href="/shopping/ShowItemServlet2?action=list2&code=${category.code}">${category.name}</a>　　
</c:forEach>


<a href="/shopping/ShowItemServlet2?action=new">新規商品追加</a>　　
<a href="/shopping/ShowItemServlet2?action=top">ログアウト</a>
</div>

