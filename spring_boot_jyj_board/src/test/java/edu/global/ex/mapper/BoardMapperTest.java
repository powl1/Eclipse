package edu.global.ex.mapper;



import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.global.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class BoardMapperTest {

   @Autowired
   private BoardMapper boardMapper;
   
   @Test
   void testGetList() {
	  assertNotNull(boardMapper);
	  
	  System.out.println(boardMapper.getList().size());
      
	  for(BoardVO vo : boardMapper.getList()) {
		  log.info("보드" + vo);
	  }
   }
   
   @Test
   void testGetRead() {
	   assertNotNull(boardMapper);
	   log.info("보드" + boardMapper.read(66));
	
   }

}