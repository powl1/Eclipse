package edu.global.ex.vo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoardVOTest {

	
	@Test
	void testBoardVO() {
		BoardVO board = new BoardVO();
		
		assertNotNull(board); // board가 NotNull 인가를 체크해주는 assert 시리즈
		
		board.setBid(10);
		board.setBcontent("하하하");
		
		assertEquals("하하하", board.getBcontent());
		assertEquals(10, board.getBid());
		
		System.out.println(board.getBid());
		System.out.println(board);
	}

}
