package edu.global.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.global.ex.vo.EmpDeptVO;

@Mapper
public interface EmpMapper {
	
	public List<EmpDeptVO> getEmpDeptList();
	
}
