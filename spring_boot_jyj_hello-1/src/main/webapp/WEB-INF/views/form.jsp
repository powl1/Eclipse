<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/board/confirm" method="GET">
		id : <input type="text" name="id">
		pw : <input type="text" name="pw">
		
		<input type="submit" value="전송">
	</form>
</body>
</html>