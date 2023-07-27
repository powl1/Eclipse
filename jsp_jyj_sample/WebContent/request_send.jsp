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
   request.setCharacterEncoding("UTF-8");
   
   String str = request.getParameter("age");
   int age = Integer.valueOf(str); // String 으로 받아온 age 를 Int형으로 변형 해주는 작업
   
   // response 사용법
   // 
   if(age>=20){
	// Redirect :
	// 클라이언트로 하여금 다시 요청한 페이지로 접속하게금 하는 것
	   response.sendRedirect("pass.jsp?age=" + age);
   }else{
	   // 
	   response.sendRedirect("ng.jsp?age=" + age);
   }
   
%>
나이:<%=age%><br />
</body>
</html>


<!--
면접시 자주 묻는 질문 중 한가지들.
답을 할 줄 알아야한다.
1. get 방식과 post 방식의 차이

2. forward 와 redirect 차이

3. 쿠키와 세션의 차이

4. 4가지 scope(영역) 메모리 관련


-->