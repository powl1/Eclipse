<%@page import="edu.global.ex.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Circle</title>
</head>
<body>
	<h1>circle.jsp 입니다</h1>
	<!-- Student student2 = new Student() 와 동일하다 -->
	<!-- <-- : 아래의 new 와 같은 의미이다. -->
	<jsp:useBean id="circle" class="edu.global.ex.Circle2" />
	<!-- student2.setName("---") : setter 함수 역할 -->
	<!-- property= set+Radius 의 radius 의 대문자를 소문자를 변경해서 가져와야 한다.  -->
	<jsp:setProperty name="circle" property="radius" value= "5" />
	
	<!-- student2.getName() : getter 함수 역할 -->
	원의 반지름이 5인 원의 면적은  <jsp:getProperty name="circle" property="area" /> 입니다<br/>
	
	<hr>
</body>
</html>