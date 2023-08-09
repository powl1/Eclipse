<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	confirm.jsp 파일 입니다.<br /><br />
	
	ID : ${id}<br />
	<!--
	form 의 기본값 GET 방식이므로 값을 입력해 줘야하는데
	주소창에 마지막에 겟방식 입력으로 값을 임의로 넣어준다.
	?id=abcd <-- 이렇게 넣어주면
	Id : abcd 로 출력이 된다.
	 -->
	PW : ${pw}<br /><br />
	<!-- 
	패스워드도 넣어주려면
	&pw=1234
	PW : 1234 로 출력
	 -->
</body>
</html>