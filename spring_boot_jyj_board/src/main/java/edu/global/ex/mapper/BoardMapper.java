package edu.global.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.global.ex.page.Criteria;
import edu.global.ex.vo.BoardVO;

@Mapper
public interface BoardMapper {
	
	public List<BoardVO> getList();
	BoardVO read(int bid); // 파라미터는 url 로 넘어논 bid값을 의미
	int update(BoardVO board); // 글 수정
	int delete(BoardVO board); // 글삭제
	public void insert(BoardVO board); // 글작성
	
	public void updateShape(BoardVO board);
	public void insertReply(BoardVO board);
	
	// paging 관련
	int getTotalCount();
	public List<BoardVO> getListWithPaging(Criteria cri);
	
}
