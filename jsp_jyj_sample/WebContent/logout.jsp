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
      
      if(cookies != null) {
         for(int i=0; i<cookies.length; i++) {
            if(cookies[i].getValue().equals("abcde")){ // "ID": 쿠키명을 찾아서
               cookies[i].setMaxAge(0); // <- 여기서 삭제를 시킨다.
               response.addCookie(cookies[i]);
            }
         }
      }
      
      response.sendRedirect("login.html"); // 로그아웃은 하면 로그인 화면으로 다시 돌아간다.
      //response.sendRedirect("cookietest.jsp");
   %>
</body>
</html>