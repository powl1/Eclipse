<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 익스프레션(%=)으로 함수 선언의 의미를 포함하고 있다. -->
<%= i %><br>
<%= str %><br>
<%= sum(1, 5) %><br>
<%!
	int i = 10;
	String str = "ABCD";
	public int sum(int a, int b) {
		return a+b;
	}
	
%>

<%-- 함수 생성시에는 시작부분에 (<%!) 느낌표가 꼭 있어야한다.
변수 선언시 따로 작성하여 구별 지어주는 느낌으로도 사용된다. --%>

<%-- <%
	out.println("i = " + i + "<br>");
	out.println("str = " + str + "<br>");
	out.println("sum = " + sum(1, 5) + "<br>");
%> --%>
</body>
</html>