<%@page import="edu.global.ex.dto.DeptDTO"%>
<%@page import="java.util.List"%>
<%@page import="edu.global.ex.dao.DeptDAO"%>
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
	DeptDAO dao = new DeptDAO();

	List<DeptDTO> deptList = dao.getDeptList();

	for(DeptDTO dept: deptList){
		out.print(dept + "<br/>");
	}
%>
</body>
</html>