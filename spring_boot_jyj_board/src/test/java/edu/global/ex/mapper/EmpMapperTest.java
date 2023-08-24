package edu.global.ex.mapper;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.global.ex.mapper.EmpMapper;
import edu.global.ex.vo.EmpDeptVO;

@SpringBootTest
class EmpMapperTest {

	@Autowired
	private EmpMapper empMapper;
	
	@Test
	void testGetEmpDeptList() {
		assertNotNull(empMapper);
		
		System.out.println(empMapper.getEmpDeptList());
		
		for (EmpDeptVO vo : empMapper.getEmpDeptList()) {
			System.out.println(vo);
		}
	}

}
