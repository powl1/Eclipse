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
		Cookie[] cookies = request.getCookies(); // 쿠키 생성
	
		for(int i=0; i<cookies.length; i++) { // 확인을 하고
	    	String str = cookies[i].getName();
	      	if(str.equals("name")) {
	         	out.println("name : " + cookies[i].getName() + "<br />");
	        	cookies[i].setMaxAge(0); // 유효시간을 0으로 만들어줘, 삭제하기
	         	response.addCookie(cookies[i]);
	      	}
	   	}
	%>
	
	<a href="cookieSet.jsp">cookie Set</a><br>
	<a href="cookieGet.jsp">cookie Get</a>
</body>
</html>