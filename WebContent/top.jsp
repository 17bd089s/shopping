<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/stylesheet.css" >

<meta charset="UTF-8" />
<title>Welcom shopping!</title>
</head>
<body class="top-body">
	<!-- メニュー -->
	<jsp:include page="/menu.jsp" />

	<h1 class="top-main" style="color:naby;">ようこそ！サンプルショッピングサイトへ</h1>
	<p><img src="<%=request.getContextPath() %>/media-675645602.jpg" alt="" class="img1"></p>
	<%--
	<p>このサイトは教材用として作成されています。</p>
	<p>デザインなどは各自工夫してみましょう。</p>
	--%>
</body>
</html>