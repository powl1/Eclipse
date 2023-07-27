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
	request.setCharacterEncoding("UTF-8");
	
	String str = request.getParameter("age");
	
	int age = Integer.valueOf(str);
	
	if(age>=20){
	   response.sendRedirect("pass.jsp?age=" + age);
	}else{
	   response.sendRedirect("ng.jsp?age=" + age);
	}
%>
</body>
</html>