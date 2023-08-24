package edu.global.ex.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 ORM : RDBMS <-> Class Mapping을 도와주는 프레임워크
 JPA : 일반 솔루션 회사
 MyBatis : SI 회사에서 많이 씀
 
 카디널리티 : 1 : N
 		 1 : 1
 		 M : N
*/

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DeptVO {
   private String deptno;			// 부서번호
   private String dname;			// 부서명
   private String loc;				// 지역
   
   // 1대 다수 처리
   List<EmpDeptVO> empList;
   
}




