<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<%
		Cookie[] cookies = request.getCookies();
   
      	for(int i=0; i<cookies.length; i++) {
         	String id = cookies[i].getValue();
         	
         	if(id.equals("abcde"))
         		out.println(id + "님 안녕하세요." + "<br />");
      	}
   	%>
   
   	<a href="logout.jsp">로그아웃</a>
</body>
</html>