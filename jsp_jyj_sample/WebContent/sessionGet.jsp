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
<%
   	// session.setAttribute("id", "abc");
	// session.setAttribute("tel", 1234);
	
	String id = (String)session.getAttribute("id");
	//session.getAttribute : return 타입을 변경해줘야 오류 발생 X
	int num = (Integer)session.getAttribute("tel");
	// 오토언박싱 
%>
	<%=id %><br>
	<%=num %><br>
	<a href="sessionSet.jsp">섹션 확인</a>

</body>
</html>