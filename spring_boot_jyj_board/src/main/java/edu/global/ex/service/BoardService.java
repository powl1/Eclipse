package edu.global.ex.service;

import java.util.List;

import edu.global.ex.page.Criteria;
import edu.global.ex.vo.BoardVO;

public interface BoardService {
	
	List<BoardVO> getList(); // 리스트 메소드
	BoardVO read(int bid); // 글보기 메소드
	int modify(BoardVO board); // 글수정
	int remove(BoardVO boardVO); // 글삭제
	
	void register(BoardVO boardVO); // 글작성
	void registerReply(BoardVO boardVO); // 글답변
	
	// paging 관련
	int getTotal();
	public List<BoardVO> getListWithPaging(Criteria cri);
}
