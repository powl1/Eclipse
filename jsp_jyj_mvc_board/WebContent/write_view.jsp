<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>
   <table width="500" cellpadding="0" cellspacing="0" border="1">
      <h2> form action : form태그에서 submit시 write.do로 이동하도록 설정하는부분 </h2>
      <form action="write.do" method="post"><!-- post 방식으로 write.do 로 보낸다 -->
         <tr>
            <td>이름</td>
            <td><input type="text" name="bname" size="50"></td>
         </tr>
         <tr>
            <td>제목</td>
            <td><input type="text" name="btitle" size="50"></td>
         </tr>
         <tr>
            <td>내용</td>
            <td><textarea name="bcontent" rows="10"></textarea></td>
         </tr>                  
         <tr>
            <td colspan="2"> <input type="submit" value="입력">
            &nbsp;&nbsp;<a href="list.do">목록보기</a></td>
         </tr>      
      </form>
   </table>
</body>
</html>