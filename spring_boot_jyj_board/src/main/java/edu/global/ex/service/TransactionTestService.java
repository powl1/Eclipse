package edu.global.ex.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.global.ex.mapper.BoardMapper;
import edu.global.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TransactionTestService {

  @Autowired
  private BoardMapper boardMapper;

   @Transactional
   public void transactionTest1() {

      log.info("transionTest1()테스트 ");
      BoardVO boardVO = new BoardVO();
      boardVO.setBcontent("트랜잭션1");
      
      boardVO.setBname("트랜잭션1");
      boardVO.setBtitle("트랜잭션1");

      boardMapper.insert(boardVO);

      boardVO.setBcontent("트랜잭션2");
      boardVO.setBname("트랜잭션2");
      boardVO.setBtitle("트랜잭션2");

      boardMapper.insert(boardVO);
   }

   // 롤백이 제대로 되고 있음
   @Transactional
   public void transactionTest2() {

      log.info("transionTest2()테스트 ");
      BoardVO boardVO = new BoardVO();
      boardVO.setBcontent("트랜잭션1");
      boardVO.setBname("트랜잭션1");
      boardVO.setBtitle("트랜잭션1");

      boardMapper.insert(boardVO);

      boardVO.setBcontent("트랜잭션2");
      boardVO.setBname("트랜잭션2");
      boardVO.setBtitle("트랜잭션2");

      // 일부러 트랜잭션을 위한 것
      boardVO = null;
      boardMapper.insert(boardVO);
   }

   public void transactionTest3() {

      log.info("transionTest3()테스트 ");
      BoardVO boardVO = new BoardVO();

      boardVO.setBcontent("트랜잭션1");
      boardVO.setBname("트랜잭션1");
      boardVO.setBtitle("트랜잭션1");

      boardMapper.insert(boardVO);

      boardVO.setBcontent("트랜잭션2");
      boardVO.setBname("트랜잭션2");
      boardVO.setBtitle("트랜잭션2");

      // 일부러 에러를 내게 함 //트랜잭션을 위한 것
      boardVO = null;
      boardMapper.insert(boardVO);
   }

   //uncheckedExeption(롤백 함)
   @Transactional
   public void transactionTest4() {
      BoardVO boardVO = new BoardVO();
      boardVO.setBcontent("트랜잭션4");
      boardVO.setBname("트랜잭션4");
      boardVO.setBtitle("트랜잭션4");

      boardMapper.insert(boardVO);

      throw new RuntimeException("RuntimeException for rollback");
   }

   //CheckedExeption 테스트(롤백 안함)
   @Transactional
   public void transactionTest5() throws SQLException {
      BoardVO boardVO = new BoardVO();
      boardVO.setBcontent("트랜잭션5");
      boardVO.setBname("트랜잭션5");
      boardVO.setBtitle("트랜잭션5");

      boardMapper.insert(boardVO);
      
      throw new SQLException("SQLException for rollback");
   }
   
   // @Transactional의 rollbackFor 옵션을 이용하면 Rollback이 되는 클래스를 지정가능함.
   // Exception예외로 롤백을 하려면 다음과 같이 지정하면됩니다. @Transactional(rollbackFor = Exception.class) 
   // 여러개의 예외를 지정할 수도 있습니다. @Transactional(rollbackFro = {RuntimeException.class, Exception.class})
   @Transactional(rollbackFor = Exception.class) 
   public void transactionTest6() throws SQLException {
      BoardVO boardVO = new BoardVO();
      boardVO.setBcontent("트랜잭션6");
      boardVO.setBname("트랜잭션6");
      boardVO.setBtitle("트랜잭션6");

      boardMapper.insert(boardVO);

      throw new SQLException("SQLException for rollback");
   }
   
   @Transactional(rollbackFor = SQLException.class) 
   public void transactionTest7() throws SQLException {
      BoardVO boardVO = new BoardVO();
      boardVO.setBcontent("트랜잭션7");
      boardVO.setBname("트랜잭션7");
      boardVO.setBtitle("트랜잭션7");

      boardMapper.insert(boardVO);

      throw new SQLException("SQLException for rollback");
   }
}