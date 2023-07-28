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
   
}