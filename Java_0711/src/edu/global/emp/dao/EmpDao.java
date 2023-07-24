package edu.global.emp.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import edu.global.emp.dto.EmpDto;

public class EmpDao {
   private String driver = "oracle.jdbc.driver.OracleDriver";
   private String url =  "jdbc:oracle:thin:@localhost:1521:xe";
   private String user = "scott";
   private String pwd =  "tiger";
   
   public EmpDao() {
      try {
         Class.forName(driver);
         System.out.println("드라이버 검색 성공");
      }catch(Exception e) {
         e.printStackTrace();
      }
      
      
   }
   
   public List<EmpDto> getEmps(){
      List<EmpDto> emps = new ArrayList<>();
      //데이터 베이스 접속을 위한 암기필수3종세트
      Connection connection = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      
      String sql = "select * from emp";
      
      try {
         // Class.forName(driver);
         connection = DriverManager.getConnection(url, user, pwd);//DB연결
         pstmt = connection.prepareStatement(sql);
         
         rs=pstmt.executeQuery();
         
         while(rs.next()) {
            EmpDto emp = new EmpDto();
            
            emp.setEmpno(rs.getInt("empno"));
            emp.setEname(rs.getString("ename"));
            emp.setJob(rs.getString("job"));
            emp.setMgr(rs.getInt("mgr"));
            emp.setHiredate(rs.getTimestamp("hiredate"));
            
            emps.add(emp) ;
            }
      
      } catch(Exception e) {
         
      }
      
      return emps;
   }
}
