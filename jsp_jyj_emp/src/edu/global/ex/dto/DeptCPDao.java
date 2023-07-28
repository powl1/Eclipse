package edu.global.ex.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import edu.global.ex.dto.DeptDto;

public class DeptCPDao {

   //커넥션풀을 사용하기 위한 소스코드 (DataSource를 import할 시 java.sql로 해야한다.
   private DataSource datasource;

   public DeptCPDao() {
      //기존에driver를 설정하고 Class.forName(driver)를 넣는 방식과는 달리 context.xml에 
        //리소스를 설정해주었다. context.xml에 있는 소스를 읽기 위해 context객체 생성한다.
      
      //jdbc/oracle : context.xml에 들어간 Resource에서 name에 해당하는 부분 
        //위의 식은 context.xml에서 name을 lookup 찾으라는 뜻이다. 
      
      try {
         Context context = new InitialContext();
         datasource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");

      } catch (Exception e) {
         // TODO: handle exception
         e.printStackTrace();
      }
   }

   public int deleteDept(int deptno) {

      Connection con = null;
      PreparedStatement stmt = null;
      String query = "delete from dept where deptno = ? ";
      int result = 0;

      try {

         con = datasource.getConnection();
         stmt = con.prepareStatement(query);

         stmt.setInt(1, deptno);
         result = stmt.executeUpdate();

      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {

            if (stmt != null)
               stmt.close();
            if (con != null)
               con.close();

         } catch (Exception e2) {
            e2.printStackTrace();
         }
      }

      return result;

   }

   public int insertDept(int deptno, String dname, String loc) {

      Connection con = null;
      PreparedStatement stmt = null;
      String query = "insert into dept(deptno,dname,loc) values(?,?,?)";
      int result = 0;

      try {
              
         con = datasource.getConnection();
         
         stmt = con.prepareStatement(query);

         stmt.setInt(1, deptno);
         stmt.setString(2, dname);
         stmt.setString(3, loc);

         result = stmt.executeUpdate();

      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {

            if (stmt != null)
               stmt.close();
            if (con != null)
               con.close();

         } catch (Exception e2) {
            e2.printStackTrace();
         }
      }

      return result;

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
         con = datasource.getConnection();

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