<%@page import="edu.global.ex.Grade"%>
<%@page import="java.util.Arrays"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   request.setCharacterEncoding("UTF-8");
   
   String kor = request.getParameter("kor");
   String eng = request.getParameter("eng");
   String math = request.getParameter("math");
   
   Grade grade = new Grade("홍길동", Integer.valueOf(kor), Integer.valueOf(eng), Integer.valueOf(math));
   
%>
총점:<%=grade.getTotal()%><br />
평균:<%=grade.getAvg()%><br />
평균:<%=grade.showInfo()%><br />

</body>
</html>