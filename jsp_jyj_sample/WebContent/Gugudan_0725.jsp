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
    <h2 align="center">������</h2>
    <table align="center" border="1">
        <tr bgcolor="skyblue">
            <td></td>
            <!-- 2 ~ 9���� ��� ���ڵ� -->
            <% for (int i = 2; i < 10; i++) { %>
            <td align="center" width="80"><%=i + "��"%></td>
            <% } %>
            <% for (int i = 1; i < 10; i++) { %>
        <tr>
            <td align="center" width="50" bgcolor="skyblue"><%=i%></td>
            <!-- ���� 1~9 ������ ���ڵ� -->
            <% for (int j = 2; j < 10; j++) { %>
            <td align="center"><%=j%> X <%=i%>= <%=j * i%></td>
            <% } %>
        </tr>
        <% } %>
        </tr>
    </table>
    <table align="center" border="1">
	<%
		for(int i = 1; i < 10; i++) {
	%>
		<tr>
	<%
		for(int j = 2; j < 10; j++) {
	%>
		<td>
			<%= Integer.toString(j) 
			+ " X " + Integer.toString(i) 
			+ " = " + Integer.toString(j * i) 
			%>
		</td>
	<%
		}
	%>
		</tr>
	<%
		}
	%>
   	</table>
   	<br>
   	<table align="center" border="1">
	<%
      for(int i = 1; i < 10; i++) {
    	  
		out.println("<tr>");
    	  
		for(int j = 2; j < 10; j++) {
			out.println("<td>");
			out.println( j + " X " + i + " = " + (j * i));
			out.println("</td>");
   		}
		
		out.println("</tr>");
		
		}
   	%>
   	</table>
   	<hr>
   	<h1>�� ����</h1>
   	<%
   		Circle circle = new Circle(10);
		out.print("���� ���̴� " + circle.getArea());
   	%>
</body>
</html>