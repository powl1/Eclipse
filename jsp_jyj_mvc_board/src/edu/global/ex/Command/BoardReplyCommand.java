package edu.global.ex.Command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.dao.BoardDao;
import edu.global.ex.dto.BoardDto;

public class BoardReplyCommand implements BoardCommand {

	// 자손이 구현하므로 interface의 메소드를 override한다.
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		System.out.println("BReplayCommand entry.."); // 디버깅을 위한 코드=

		String bname = request.getParameter("bname");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");

		String bid = request.getParameter("bid");
		String bgroup = request.getParameter("bgroup");
		String bstep = request.getParameter("bstep");
		String bindent = request.getParameter("bindent");

		BoardDao boardDao = new BoardDao();

		boardDao.reply(bid, bname, btitle, bcontent, bgroup, bstep, bindent);
	}

}