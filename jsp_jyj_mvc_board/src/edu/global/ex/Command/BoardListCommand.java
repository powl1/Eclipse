package edu.global.ex.Command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.dao.BoardDao;
import edu.global.ex.dto.BoardDto;

public class BoardListCommand implements BoardCommand {

	// 자손이 구현하므로 interface의 메소드를 override한다.
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		BoardDao boardDao = new BoardDao();
		
		// "select * from mvc_board order by bgroup desc, bstep asc";
		// 테이블에 있는 모든 데이터를 끌고 온다는 뜻
		List<BoardDto> dtos = boardDao.list();
		
		request.setAttribute("list", dtos);
	}
   
   
}