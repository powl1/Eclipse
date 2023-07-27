<%@page import="edu.global.ex.Circle"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>b.jsp입니다.</h1>
	<%
   		Circle circle =(Circle) session.getAttribute("circle");
		out.print("넓이는 " + circle.getArea());
	   
	%>
	
	<a href="sessionGet.jsp">섹션 확인</a>

</body>
</html>