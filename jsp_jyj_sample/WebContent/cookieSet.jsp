<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie cookie = new Cookie("name", "kim");
		cookie.setMaxAge(60*60); // 쿠키 지속 가능 시간
		
		response.addCookie(cookie);
	%>
	
	<a href="cookieGet.jsp">cookie get</a>
</body>
</html>