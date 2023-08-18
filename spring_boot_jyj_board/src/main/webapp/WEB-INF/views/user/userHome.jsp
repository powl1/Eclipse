<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>유저 페이지입니다.</h1>
	<!-- UserDetails.의 적혀져있는 getUser()안에 있는 this.username 이다. -->
	<p>principal: <sec:authentication property="principal"/></p>
	<p><sec:authentication property="principal.username"/> 님 환영합니다.</p>
	
	<p><a href="<c:url value="/" />">홈</a></p>
</body>
</html>