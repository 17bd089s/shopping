<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/stylesheet.css" >
<!-- メニュー -->
<h3><a href="/shopping/ShowItemServlet?action=top" class="home">ホーム</a></h3>

<div class="category">
<c:forEach items="${categories}" var="category">
<a  href="/shopping/ShowItemServlet?action=list&code=${category.code}">${category.name}　　</a>
</c:forEach>


<a  href="/shopping/CartServlet?action=show">カートを見る　　</a>
<a  href="/shopping/login.jsp">管理者画面へ</a>
</div>

