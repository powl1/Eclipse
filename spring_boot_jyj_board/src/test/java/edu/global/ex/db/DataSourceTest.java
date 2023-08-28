package edu.global.ex.db;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DataSourceTest {

   @Autowired
   private DataSource datasoure; // 커넥션 풀
   
   @Test
   void testDataSource(){
      assertNotNull(datasoure);
      
      System.out.println("DS=" + datasoure);
      
      try(Connection conn = datasoure.getConnection()){
         
         System.out.println("Cooooooooonn=" + conn);
         assertTrue(conn instanceof Connection);
         
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("seledt 100 from dual");
         if (rs.next()) {
			assertEquals(100, rs.getLong(1));
		}
      }catch (Exception e) {
		// TODO: handle exception
	}
      
      
   }

}