<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- メニュー -->
<h1 text-align:center;><a href="/shopping/ShowItemServlet?action=top">ホームへ</a></h1>

<ul>
<c:forEach items="${categories}" var="category">
<li><a href="/shopping/ShowItemServlet?action=list&code=${category.code}">${category.name}</a></li><br>
</c:forEach>


<li><a href="/shopping/CartServlet?action=show">カートを見る</a></li><br>
<li><a href="/shopping/login.jsp">管理者画面へ</a></li>
</ul>
