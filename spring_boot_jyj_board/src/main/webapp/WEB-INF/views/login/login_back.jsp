<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>로그인 페이지</title>
</head>
<body onload="document.f.id.focus();">
	<h3>아이디와 비밀번호를 입력해주세요.</h3>
	<c:url value="/login" var="loginUrl" />
	<p>${loginUrl}</p>
	<form:form name="f" action="${loginUrl}" method="POST"> <!-- 앞에 form 의미는 taglib prefix="form"으로 다른거로 바꿔도 가능하지만 값을 동일하게 해야한다. -->
		<c:if test="${param.error != null}"><p>아이디와 비밀번호가 잘못되었습니다.</p></c:if>
		<c:if test="${param.logout != null}"><p>로그아웃 하였습니다.</p></c:if>
		
		<!-- 주의사항 1 -->
		<!-- 아이디, 비밀번호 id와 name은 동일하게 해야한다. -->
		<p><label for="username">아이디</label> <input type="text" id="username" name="username" /></p>
		<p><label for="password">비밀번호</label> <input type="password" id="password" name="password" /></p>
		<%-- <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" /> --%>
		<button type="submit" class="btn">로그인</button>
	</form:form>

</body>
</html>