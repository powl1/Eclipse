<%@page import="edu.global.ex.Circle"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
    <h2 align="center">구구단</h2>
    <table align="center" border="1">
    <% for(int i = 1; i <= 9; i++) { %>
    	<tr>
    	<% for(int j = 2; j <= 9; j++) { %>
    		<td><%= Integer.toString(j) + " X " + Integer.toString(i) + " = " + Integer.toString(j * i) %></td>
    <% } %>
		</tr>
	<% } %>
   	</table>
</body>
</html>