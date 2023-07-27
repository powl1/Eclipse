<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<%!
		String id, pw;
   	%>
   	<%
      	id = request.getParameter("id");
      	pw = request.getParameter("pw");
      
      	if(id.equals("abcde") && pw.equals("12345")) { // 아이디와 패스워드를
         	Cookie cookie = new Cookie("id", id); // <- 이쪽에 심는다.
         	cookie.setMaxAge(60); // 쿠기를 60 시간 설명을 해놓은다
         	response.addCookie(cookie);
         	response.sendRedirect("welcome.jsp"); // Redirect 를 하면 
      	} else {
         	response.sendRedirect("login.html"); // login.html 로 계속 보여지게 Redirect 시킨다.
      	}
   	%>
</body>
</html>