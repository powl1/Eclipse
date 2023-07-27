<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--
JSP 파일이 되려면 무조건 위에 코드가 있어야한다.
없으면 그냥 HTML

글자는 UTF-8 로 통일
 -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int i = 0;
	// System.out.println("아 죽겠당!!!" + i); // 콘솔에서 출력되는 구문
	// out.print(i + "<br>"); // 웹 서버에 출력되는 구문
	
	while(true) {
		i++;
		out.println("2 * " + i + " = " + (2*i) + "<br>");
		
		if(i>=9) {
			break;
		}
	}
%>
<script type = "text/javascript">
	document.write("1234"); // 자바스크리트 문법으로 스크립트 연동 코드가 있어야 작동이 된다.
</script>
</body>
</html>