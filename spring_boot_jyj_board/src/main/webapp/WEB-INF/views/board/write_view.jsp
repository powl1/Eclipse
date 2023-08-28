<%@ page language="java" contentType="text/html;charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<title>write_view</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>

	$(document).ready(function(){
		$("#updateForm").submit(function(event){ // form 태그 안에 submit 버튼 누르면 발생하는 이벤트
			// preventDefault()는 href로 연결해 주지 않고
			// 단순히 click에 대한 처리를 하도록 해준다.
			event.preventDefault();
			
			var bname = $("#input_bname").val(); // input받는 bname의 [val()]값을 var bname 이란 변수에 넣어준다.
			var btitle = $("#input_btitle").val();
			var bcontent = $("#input_bcontent").val();
			
			let form = {
				bname : bname,
                btitle : btitle,
                bcontent : bcontent
			}
			
			console.log(JSON.stringify(form)); // form 이라는 자바스크립트 객체를 JSON.String[제이슨의 스트링] 객체로 만들어준다.
			
			// 내용을 ajax로 보낸다.
			
			/*
	         $.ajax({
	              type : `http method type`,
	              url : `url`,
	              data : `서버에 전송할 데이터`,
	              contentType : "전송할 데이터 타입",
	              //기본 값 : "application / x-www-form-urlencoded; charset = UTF-8"  
	              dataType : '서버로 부터 수신할 데이터 타입',
	              //아무것도 지정하지 않으면 jQuery는 응답의 MIME 유형을 기반으로 해석을 시도
	              error : `에러 발생시 수행할 함수`,
	              success : `성공시 수행할 함수`
	            });
	         */
         
			$.ajax({
	             type : "POST", // type : "http "
	             url : "/boards/", // url : "url"
	             cashe:false, // cashe : ""
	             contentType:'application/json; charset=utf-8', // contentType : "전송할 데이터 타입"
	             data: JSON.stringify(form), // date : "서버에 전송할 데이터"
	             success: function (result) { // success : "성공시 수행할 함수"  
                    console.log(result);
	                    
	             	// location.href = "/list2";
                    // $(location).attr('href', '/rest_board.html');
                    $(location).attr('href', '/board/list2');              
	             },
	             error: function (e) { // error : "에러 발생시 수행할 함수"
	                 console.log(e);
	             }
	         });
		
		});
		
		
		
	});
	
</script>
</head>
<body>
		<form id="updateForm" action="write" method="post">
	<table width="500" cellpadding="0" cellspacing="0" border="1">
			<tr>
				<td>이름</td>
				<td><input id="input_bname" type="text" name="bname" size="50">
				</td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input id="input_btitle" type="text" name="btitle"
					size="50"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea id="input_bcontent" name="bcontent" rows="10"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="입력">
					&nbsp;&nbsp; <a href="list">목록보기</a></td>
			</tr>
	</table>
		</form>
</body>
</html>