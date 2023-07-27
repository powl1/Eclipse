<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>메인페이지 입니다.</h1>
	<%
		request.setAttribute("id", "1234");
	%>
	<jsp:forward page="sub.jsp">
		<jsp:param name="id" value="abcd"/>
		<jsp:param name="pw" value="1234"/>
	</jsp:forward>
	
</body>
</html>