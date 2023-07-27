<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dept" class="edu.global.ex.dto.DeptDto"/>
<jsp:setProperty name="dept" property="deptno" value="88" />
<jsp:setProperty name="dept" property="loc" value="대구" />
<jsp:setProperty name="dept" property="dname" value="세일즈" />

<hr>
${dept.deptno}<br>
${dept.loc}<br>
${dept.dname}<br>
<hr>
${dept.getDeptno()}<br>
${dept.getLoc()}<br>
${dept.getDname()}<br>
<hr>
<jsp:getProperty name="dept" property="dname" />
<jsp:getProperty name="dept" property="loc" />
<jsp:getProperty name="dept" property="dname" />

<%--    <H1>${10}</H1></br>
   <H1>${99.99}</H1></br>
   <H1>${"abC"}</H1></br>
   <H1>${true}</H1></br>
   <hr>
   <H1>${1+2}</H1></br>
   <H1>${1-2}</H1></br>
   <H1>${1/2}</H1></br>
   <H1>${1<2}</H1></br>
   ${ (1>2) ? 1 : 2 } <br />
   ${ (1>2) || (1<2) } <br />    
   
    <H1><%=10 %></H1></br>
     --%>
</body>
</html>