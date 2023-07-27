package edu.global.ex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import edu.global.ex.dto.DeptDTO;

public class DeptDAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	// 오라클을 사용하므로 oracle드라이버를 넣어서 초기화
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uid = "scott";
	private String upw = "tiger";
	// DB에 접근하기 위해 id와 pw를 입력한다.

	public DeptDAO() {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<DeptDTO> getDeptList(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<DeptDTO> deptList = new ArrayList<>();
		String sql = "select * from dept";
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				DeptDTO dept = new DeptDTO();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
				deptList.add(dept);
			}
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			}catch (Exception e) {
			}
		}
		
		
		
		return deptList;
	}
}
