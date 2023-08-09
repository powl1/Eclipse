package edu.global.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import edu.global.ex.vo.EmpVO;

@Mapper
public interface EmpMapper {
	
	@Select("select * from emp")
	public List<EmpVO> getList();
}