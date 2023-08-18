<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>메인 페이지 입니다.</h1>
	
	<p>principal: <sec:authentication property="principal"/></p>
	<sec:authentication property="principal.username"/> 님 환영합니다
	
	<p><a href="<c:url value="/" />">홈</a></p>
	
</body>
</html>