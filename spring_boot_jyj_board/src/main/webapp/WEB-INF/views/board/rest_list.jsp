<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- C태그 쓰기 위해 넣은 taglib므로 반드시 확인 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>rest_list</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	function getList(){
		$.ajax({ // ajax() 함수 안에 객체{} 들어가야한다.
			type:"GET",
			url:"/boards/list", // board 리스트가 아니라 json 인 boards 리스트로 작성해야 값 제대로 넘어온다.
			success:function(result){ // result하면 json을 다 받아온다.
				console.log(result);
			
			  	var htmls="";
                  
				$("#list-table").html("");   

				$("<tr>" , {
				   html : "<td>" + "번호" + "</td>"+  // 컬럼명들
				         "<td>" + "이름" + "</td>"+
				         "<td>" + "제목" + "</td>"+
				         "<td>" + "날짜" + "</td>"+            
				         "<td>" + "히트" + "</td>"+
				         "<td>" + "삭제" + "</td>"
				}).appendTo("#list-table") // 이것을 테이블에붙임

                if(result.length < 1){
                   htmls.push("등록된 댓글이 없습니다.");
                } else {
					$(result).each(function(){                                                          
					    htmls += '<tr>';
					    htmls += '<td>'+ this.bid + '</td>';
					    htmls += '<td>'+ this.bname + '</td>';
					    htmls += '<td>'
					  	for(var i=0; i < this.bindent; i++) { //for 문은 시작하는 숫자와 종료되는 숫자를 적고 증가되는 값을 적어요. i++ 은 1씩 증가 i+2 는 2씩 증가^^
				     		htmls += '-'   
						}
					    htmls += '<a href="${pageContext.request.contextPath}/content_view?bid=' + this.bid + '">' + this.btitle + '</a></td>';
				     	htmls += '<td>'+ this.bdate + '</td>'; 
					    htmls += '<td>'+ this.bhit + '</td>';   
					    htmls+='<td>'+ "<input type='button' class='del-button' id=" + this.bid + ' value="삭제" />' +  '</td>';      
					    htmls += '</tr>';                                                      
					});   //each end

					htmls+='<tr>';
					htmls+='<td colspan="5"><a href="${pageContext.request.contextPath}/write_view">글작성</a></td>';                         
					htmls+='</tr>';
                }

                $("#list-table").append(htmls);
			},
			error:function(e){
				console.log(e);
			}
			
		});
	}
</script>
<script>
	$(document).ready(function(){
		getList();
	});
</script>
<script>
   //삭제
   $(document).on("click",".del-button",function(){
      console.log(this);
      let obj = $(this); // .parent().parent().remove();
      // 외부 변수 살아 있는거 : 클로저
      // 클로저가 살이 있기 때문에 외부변수가 작동 O
      
      $.ajax({
		type:"DELETE", // ajax는 6개 타입을 모두 지원
   	  	url:"/boards/" + $(this).attr("id"),
   	  	success:function(result){ // result하면 json을 다 받아온다.
  	  		$(obj).parent().parent().remove();
   	  		// $(this).parent().parent().remove(); <-- 여기에 넣게 되면 삭제 X
   	  		// 위에 this는 .ajax이기 때문에 
   	  		console.log(result);
		},
		error:function(e){
			console.log(e);
		}
      });
   });
</script>
</head>
<body>
	<table id="list-table" width="500" cellpadding="0" cellspacing="0"
		border="1">

	</table>
</body>
</html>