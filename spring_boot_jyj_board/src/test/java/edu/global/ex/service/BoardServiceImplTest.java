package edu.global.ex.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.global.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class BoardServiceImplTest {

	@Autowired
	private BoardService boardService;
	
	@Test
	void testGetList() {
		assertNotNull(boardService);
		
		System.out.println(boardService.getList().size());
		
		for (BoardVO board : boardService.getList()) {
			log.info(board.toString()); // log.infor 에는 스트링밖에 못 들어간다.
			
		}
		
	}

}

// 단위테스트 -> 함수테스트
// 객체지향 ~> 클래스 객체 테스트

// 통합테스트 -> 컨트롤러 테스트

// 구글링 : V모델 [사진] 저장해놔라.
// 
