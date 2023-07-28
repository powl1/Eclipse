<%@page import="edu.global.ex.dto.DeptDto"%>
<%@page import="edu.global.ex.dao.DeptDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="today" value="<%=new java.util.Date() %>"/>
   <h1><fmt:formatDate value="${today}" /></h1><br>
   <h1><fmt:formatDate value="${today}" type="time" /></h1><br>
   
    <fmt:formatDate value="${today }" pattern="yyyy년 MM월 DD일 hh시 mm분 ss초"/><br />
    <fmt:formatDate value="${today }" pattern="yyyy년 MM월 DD일 EE요일 hh시 mm분 ss초"/><br />

	<c:set var="num1" value="123456789123" />
	<!-- 숫자에 3자리마다 [코멧]을 준다  라고 표현한다 -->
	<pre><fmt:formatNumber value="${num1}"/></pre><br>
   	<h1><fmt:formatNumber value="${num1}" type="currency"/></h1><br>
   	
	<fmt:setLocale value="en_us"/>
   	<h1><fmt:formatNumber value="${num1}" type="currency"/></h1><br>
   
   	<c:out value="${num1}"/><br>



	<!-- 
	// c: = prefix = uri 안에 내용을 사용하겠다
	set = String name = "홍길동" [변수 선연과 같다]
  -->
	<%-- <% 
  	String name = "홍길동";
  	%>
 	<%=name %>
 	${name} --%>
	<c:set var="name" value="홍길동" />
	이름 :
	<c:out value="${name}" />
	<br> 이름 :
	<c:out value="${'홍길동'}" />
	<br> 이름 :
	<c:out value="홍길동" />
	<br> ${pageScope.name}
	<br>

	<!-- 각 scope의 변수 삭제
	pageContext.removeAttrbute("변수명")
	request.removeAttribute("변수명")
	session.removeAttribute("변수명")
	application.removeAttribute("변수명") -->

	<c:remove var="name" />
	이름(삭제) :
	<c:out value="${name}" />
	<br>
	<!-- pageContextremoveAttribute("name") -->
	<hr />

	<!-- var error; -->
	<c:catch var="error">
		<%=2 / 0%>
	</c:catch>
	<br />
	<c:out value="${error}" />

	<hr />

	<c:if test="${10>20}" var="result1">
	10은 20보다 크다.<br>
	</c:if>
	result1 : ${result1}
	<br>
	<hr />

	<c:set var="userid" value="hello123" />
	<!-- chooese = [JAVA] switch, [JAVA] else if -->
	<c:choose>
		<!-- when = if -->
		<c:when test="${useid == 'admin'}">
			관리자 페이지
		</c:when>
		<!-- otherwise = else -->
		<c:otherwise>
			${userid}님 반갑습니다.
		</c:otherwise>
	</c:choose>
	<hr />

	<%
		pageContext.setAttribute("numList", new String[] { "1", "2", "3" });

		List<String> fruits = new ArrayList<>();

		fruits.add("apple");
		fruits.add("kiwi");
		fruits.add("melon");

		pageContext.setAttribute("fruitsList", fruits);

		DeptDao dao = new DeptDao();
		List<DeptDto> dtos = dao.getDepts();

		pageContext.setAttribute("depts", dtos);
	%>
	<!-- URL을 만들 때 사용한다. -->
	<c:url var="calcUrl" value="http://localhost:8080/calc">
       <c:param name="v1" value="10" />
       <c:param name="v2" value="20" />
       <c:param name="op" value="+" />
   </c:url>
   ${calcUrl}


	<hr>
	<table border="1">
		<tr>
			<td>부서번호</td>
			<td>부서이름</td>
			<td>부서위치</td>
		</tr>
		<c:forEach var="dept" items="${depts}">
			<tr>
				<td>${dept.detno}</td>
				<td>${dept.dname}</td>
				<td>${dept.loc}</td>
			</tr>
		</c:forEach>
	</table>

	<hr>

	<!-- forEach var="변수 선언" items="메모리로 얼린건 긁어온다!!!" -->
	<c:forEach var="num" items="${numList}">
		<h1>${num}</h1>
	</c:forEach>
	<hr>
	<c:forEach var="fruit" items="${fruitsList}">
		<h1>${fruit}</h1>
	</c:forEach>


</body>
</html>
