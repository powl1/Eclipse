<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	grade.jsp 를 통해서 총점 평균 성적를 구합니다. <br><br>
	
	총점 : ${gradeVO.sum()}점 <br>
	평균 : ${gradeVO.avg()}점 <br>
	성적 : ${gradeVO.getGrade()}
	
	<hr>
</body>
</html>