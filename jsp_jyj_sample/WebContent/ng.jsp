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
String str = request.getParameter("age");
int age = Integer.valueOf(str);
%>
<h1>나이 : <%=age%>세 미성년입니다. 주류판매가 불가합니다. </h1>
<a href="requestex.html">처음으로 이동</a>
<br />
</body>
</html>