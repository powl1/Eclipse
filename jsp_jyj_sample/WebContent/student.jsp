<%@page import="edu.global.ex.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h1>student.jsp 입니다</h1>
	<!-- Student student2 = new Student() 와 동일하다 -->
	<!-- <-- : 아래의 new 와 같은 의미이다. -->
	<jsp:useBean id="student2" class="edu.global.ex.Student" />
	<!-- student2.setName("홍길순") : setter 함수 역할 -->
	<jsp:setProperty name="student2" property="name" value= "홍길순" />
	<jsp:setProperty name="student2" property="age" value= "9" />
	<jsp:setProperty name="student2" property="grade" value= "5" />
	
	<!-- student2.getName() : getter 함수 역할 -->
	이름 <jsp:getProperty property="name" name="student2"/><br/>
	나이 <jsp:getProperty property="age" name="student2"/><br>
	학년 <jsp:getProperty property="grade" name="student2"/><br>
	
	<hr>
	
	<%
		Student student = new Student("홍길동", 10, 6);
	%>
	이름 <%=student.getName() %><br/><jsp:getProperty property="name" name="student2"/>
	나이 <%=student.getAge() %><br>
	학년 <%=student.getGrade() %><br>
</body>
</html>