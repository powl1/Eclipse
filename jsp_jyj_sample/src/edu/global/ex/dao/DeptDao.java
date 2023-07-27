package edu.global.ex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import edu.global.ex.dto.DeptDto;

public class DeptDao {

	private String driver = "oracle.jdbc.driver.OracleDriver";
	// 오라클을 사용하므로 oracle드라이버를 넣어서 초기화
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uid = "scott";
	private String upw = "tiger";
	// DB에 접근하기 위해 id와 pw를 입력한다.

	public DeptDao() {
		try {
			// 객체를 동적으로 메모리에 올림(new 드라이버)
			// driver를 객체생성하여 메모리에 올린다 = 동적생성
			// 이때 driver는 클래스상단에 초기화한 값
			Class.forName(driver);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public List<DeptDto> getDepts() {
		// 테이블을 가져올때 Dto는 한 행을 객체로 보고 한 줄을 그대로 가져온다.
		// 메모리에 연속된방을 잡는 ArrayList을 리턴타입으로 설정해준다.
		ArrayList<DeptDto> dtos = new ArrayList<DeptDto>();

		// Connection, Statement, ResultSet 3종세트를 순서대로 객체생성한다.
		// 이때 import할시 java.sql에 있는 인터페이스를 가져와야한다!!(※주의)
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			String query = "select * from dept"; // (가지고 오고자하는 쿼리문을 넣어준다)
			// 내 어플리케이션과 오라클하고 접속(connetion)
			con = DriverManager.getConnection(url, uid, upw);

			// stmt = 빨대 = 커넥션객체 에서 빨대 가져옴
			stmt = con.prepareStatement(query);

			// stmt.executeQuery() = 채팅 처럼 sql 구문을 엔터쳐서 전달
			// 결과를 ResultSet으로 받아옴
			rs = stmt.executeQuery();

			// 반복문을 사용해서 ArrayList에 가져온 데이터를 집어넣는다.
			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");

				DeptDto dto = new DeptDto(deptno, dname, loc);

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

}