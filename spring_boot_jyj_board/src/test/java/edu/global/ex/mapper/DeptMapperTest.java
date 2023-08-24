package edu.global.ex.mapper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.global.ex.vo.DeptVO;
import edu.global.ex.vo.EmpDeptVO;

@SpringBootTest
class DeptMapperTest {

	@Autowired
	private DeptMapper deptMapper;
	
	@Test
	void test() {
		
		assertNotNull(deptMapper); // 잘 돌아가는지 테스트하는 

		System.out.println(deptMapper.getDeptEmpList());
		
		// 아래 for-each문을 왜 돌리는가 이해할 수 있어야한다.
		// 
		for(DeptVO dept : deptMapper.getDeptEmpList()) {
	         
	         for(EmpDeptVO emp : dept.getEmpList()) {
	            System.out.println(emp);
	         }
	         
	      }

		
	}

}
