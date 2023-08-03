package edu.global.ex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import edu.global.ex.dto.BoardDto;

public class BoardDao {
	private DataSource datasource = null;

	public BoardDao() {
		try {
			Context context = new InitialContext();
			datasource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/*
	 * 리턴타입이 BDto인 이유 : 글목록을 다 표시하려면 ArrayList를 써줘야하지만, 글하나의 내용만 표시하려면 테이블의 한 행만
	 * 가져오면 되므로 BDto로 타입을 지정하였다.
	 * 
	 * 파라미터가 String bid만 있는 이유 : list.jsp에서 contentView.do로 넘어갈때 참조태그에 ${dto.bid}가
	 * 넘어가므로 bid를 받아줘야한다.
	 */

	public BoardDto contentView(String bid) {

		BoardDto dto = null;

		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			// 쿼리문 작성시 찾으려는 글번호에 ?로 넘기고 아래서 preparedStatement로 set해준다.

			String query = "select * from mvc_board where bid = ?"; // (가지고 오고자하는 쿼리문을 넣어준다)

			con = datasource.getConnection();
			stmt = con.prepareStatement(query);

			// int형으로 setInt해야하는데, bid의 자료형은 String이므로 Integer로 바꿔준다.
			stmt.setInt(1, Integer.valueOf(bid));

			rs = stmt.executeQuery();

			// 한 행의 데이터만 가져오기 때문에 while 말고 if(rs.next())로 해도 가능하다.
			while (rs.next()) {

				int id = rs.getInt("bid");
				String bname = rs.getString("bname");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				Timestamp bdate = rs.getTimestamp("bdate");
				int bhit = rs.getInt("bhit");
				int bgroup = rs.getInt("bgroup");
				int bstep = rs.getInt("bstep");
				int bindent = rs.getInt("bindent");

				dto = new BoardDto(id, bname, btitle, bcontent, bdate, bhit, bgroup, bstep, bindent);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// ※제일 나중에 연거를 먼저 닫아줘야한다. Connection, Statement, ResultSet순서로
			// 열었으므로 거꾸로 닫아준다.
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return dto;

	}

	public List<BoardDto> list() {

		ArrayList<BoardDto> dtos = new ArrayList<BoardDto>();

		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			String query = "select * from mvc_board order by bgroup desc,bstep asc"; // (가지고 오고자하는 쿼리문을 넣어준다)

			con = datasource.getConnection();
			stmt = con.prepareStatement(query);
			rs = stmt.executeQuery();

			// 반복문을 사용해서 ArrayList에 가져온 데이터를 집어넣는다.
			while (rs.next()) {

				int bid = rs.getInt("bid");
				String bname = rs.getString("bname");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				Timestamp bdate = rs.getTimestamp("bdate");
				int bhit = rs.getInt("bhit");
				int bgroup = rs.getInt("bgroup");
				int bstep = rs.getInt("bstep");
				int bindent = rs.getInt("bindent");

				BoardDto dto = new BoardDto(bid, bname, btitle, bcontent, bdate, bhit, bgroup, bstep, bindent);

				dtos.add(dto);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// ※제일 나중에 연거를 먼저 닫아줘야한다. Connection, Statement, ResultSet순서로
			// 열었으므로 거꾸로 닫아준다.
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return dtos;

	}

	public void write(String bname, String btitle, String bcontent) {

		System.out.println("write()...");
		Connection con = null;
		PreparedStatement stmt = null;

		// 이때 ?,?,? 물음표는 아래에서 setString메소드로 넣어줄 값을 표현하는 것
		/*
		 * 파라미터로 받는 값이 bname, btitle, bcontent 3개므로 3개만 ?로 넣고 나머지는 0으로 설정했다. 글 작성시
		 * 조회수(bhit)는 0이고, 원본 글로 취급하므로 bstep, bindent는 지수를 넣어줄 필요가 없기 때문이다.
		 */

		try {
			String query = "insert into mvc_board " // write.jsp 를 inset해준다
					+ "(bid, bname, btitle, bcontent, bhit, bgroup, bstep, bindent)"
					+ "values (mvc_board_seq.nextval,?,?,?,0, mvc_board_seq.currval,0,0)"; // mvc_board.seq.nextval 먼저 실행이 되고 mvc_board_seq.currval이 실행이 된다

			con = datasource.getConnection();
			stmt = con.prepareStatement(query);

			stmt.setString(1, bname);
			stmt.setString(2, btitle);
			stmt.setString(3, bcontent);

			int rn = stmt.executeUpdate();

			System.out.println("write 한 갯수" + rn);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// ※제일 나중에 연거를 먼저 닫아줘야한다. Connection, Statement, ResultSet순서로
			// 열었으므로 거꾸로 닫아준다.
			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void modify(String bid, String bname, String btitle, String bcontent) {

		System.out.println("modify()...");
		Connection con = null;
		PreparedStatement stmt = null;

		// 이때 ?,?,? 물음표는 아래에서 setString메소드로 넣어줄 값을 표현하는 것
		/*
		 * 파라미터로 받는 값이 bname, btitle, bcontent 3개므로 3개만 ?로 넣고 나머지는 0으로 설정했다. 글 작성시
		 * 조회수(bhit)는 0이고, 원본 글로 취급하므로 bstep, bindent는 지수를 넣어줄 필요가 없기 때문이다.
		 */

		try {
			String query = "update mvc_board " // modify.jsp를 update... set ... 해준다
					+ " set bname=?, btitle=?, bcontent=? where bid=?";
			
			con = datasource.getConnection();
			stmt = con.prepareStatement(query);

			// 아래 순서는 위에 ? 순서대로 적어준다.
			stmt.setString(1, bname);
			stmt.setString(2, btitle);
			stmt.setString(3, bcontent);
			stmt.setInt(4, Integer.valueOf(bid));

			int rn = stmt.executeUpdate();

			System.out.println("write 한 갯수" + rn);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// ※제일 나중에 연거를 먼저 닫아줘야한다. Connection, Statement, ResultSet순서로
			// 열었으므로 거꾸로 닫아준다.
			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

	}
	
	public void delete(String bid) {

		System.out.println("write()...");
		Connection con = null;
		PreparedStatement stmt = null;

		// 이때 ?,?,? 물음표는 아래에서 setString메소드로 넣어줄 값을 표현하는 것
		/*
		 * 파라미터로 받는 값이 bname, btitle, bcontent 3개므로 3개만 ?로 넣고 나머지는 0으로 설정했다. 글 작성시
		 * 조회수(bhit)는 0이고, 원본 글로 취급하므로 bstep, bindent는 지수를 넣어줄 필요가 없기 때문이다.
		 */

		try {
			String query = "delete from mvc_board where bid = ?"; // mvc_board.seq.nextval 먼저 실행이 되고 mvc_board_seq.currval이 실행이 된다
			
			con = datasource.getConnection();
			stmt = con.prepareStatement(query);

			stmt.setInt(1, Integer.valueOf(bid));

			int rn = stmt.executeUpdate();

			System.out.println("write 한 갯수" + rn);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// ※제일 나중에 연거를 먼저 닫아줘야한다. Connection, Statement, ResultSet순서로
			// 열었으므로 거꾸로 닫아준다.
			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
}