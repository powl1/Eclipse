package edu.global.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import edu.global.ex.vo.DeptVO;
import edu.global.ex.vo.EmpDeptVO;

@Mapper
public interface DeptMapper {
	
	// @Select("select * from emp, dept where emp.deptno = dept.deptno")
	public List<DeptVO> getDeptEmpList();
	
}
