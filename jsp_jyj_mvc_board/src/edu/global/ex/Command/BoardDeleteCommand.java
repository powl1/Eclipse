package edu.global.ex.Command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.dao.BoardDao;
import edu.global.ex.dto.BoardDto;

public class BoardDeleteCommand implements BoardCommand {

	// 자손이 구현하므로 interface의 메소드를 override한다.
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		System.out.println("BDeleteCommand entry.."); // 디버깅을 위한 코드
		
		String bid = request.getParameter("bid");

		
		BoardDao boardDao = new BoardDao();
		
		boardDao.delete(bid); // insert 하는 과정
		
		
	}
   
   
}