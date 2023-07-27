<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>인크루드를 시킵니다.</h1>
	<%-- <%@ include file="include01.jsp" %> --%>
	<jsp:include page="include01.jsp" />
	<h1>인크루드가 되었습니다.</h1>
	<hr>
	<hr>
	
	<%
	// 내장 객체
	// out, request, respnse, session, ...exception ...
	
	out.print("서버 이름 : " + request.getServerName() + "  ");
	out.print("포토번호 : " + request.getServerPort() + "  ");
	out.print("겟방식 포스트 방식 : " + request.getMethod() + "<br><br>");
	
	// 아래 3개자는 자주 쓰이는 것들
	out.print("컨텍스트 패스 : " + request.getContextPath() + "<br>");
	out.print("URL 패스 : " + request.getRequestURL() + "<br>"); // 해당 페이지의 전체 주소
	// http://localhost:8282/jsp_jyj_sample/include.jsp -> 전체주소
	out.print("URI 패스  : " + request.getRequestURI() + "<br>"); // 절대경로 빼고
	// jsp_jyj_sample/include.jsp -> 뒤에 주소만.
	%>
</body>
</html>