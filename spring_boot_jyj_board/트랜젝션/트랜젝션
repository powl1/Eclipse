insert into mvc_board (bId, bName, bTitle, bContent, bHit, bGroup, bStep, bIndent) values (mvc_board_seq.nextval, '홍길동', '테스트용', '자바용 테스트다', 0, mvc_board_seq.currval, 0, 0 );

delete from mvc_board where bid=8703
select * from mvc_board;
commit;

1.트랜잭션의 의미 : 어떤 일련의 작업의 의미임(한번에 이루어져야 하는 작업 단위)
2.모두 에러 없이 끝나야 하며, 만약 중간에 에러가 발생 한다면, 에러 발생 이전 시점까지 작업되었던 내용은 
모두 원상복구(rollback) 되어야 함.
3.트랜잭션은 500 및 404등의 에러처리가 아니면, 에러 발생시 DB로 하여금 원상복구하도록 DB에 요청하는것임

가장 대표적인 예는 계좌이체 (입금 + 출금) 오류없이 완벽하게 이루어 져야 함.
중간에 정전이 일어 난다면?

https://interconnection.tistory.com/122

 

Commit(커밋) : 해당 Connection의 요청을 완료하고 특별한 에러가 없다면 결과를 DB에 반영한다. 
RollBack(롤백) : 해당 Connection 수행 중 예기치 않은 에러가 발생하였다면 모든 과정을 취소하고 
DB를 Connection이 수행되기 이전상태로 변경한다.

대상 SQL 명령은 INSERT, UPDATE, DELETE가 해당된다.
반드시 commit을 해줘야함. 

Spring ​Framework 에서 제공하는 Transaction 을 사용하는 방법은 크게 다음과 같다.

1) Spring context 설정파일에서 Transaction 선언
2) Spring Transaction Annotation 을 사용한 Transaction 선언
3) Spring API 를 사용하여 프로그램 소스 상에 Transaction 구현

위의 3가지 방법 중 1) 과 2)는 Spring AOP 를 사용하는 것이고, 3)은 AOP 가 아닌 순수 Spring API 를 사용하는 방법이다.

선언적 트랜잭션에서는 런타임 예외가 발생하면 롤백한다. 반면에 예외가 전혀 발생하지 않거나 체크 예외가 발생하면 커밋한다.


트랜잭션 우선순위는 메소드 > 클래스 >인터페이스 메소드 > 인터페이스순

트랜잭션 처리는 DB에서도 지원함.

어쩔수없이 프로그램에 의한 트랜잭션을 사용해야할 경우를 제외하고, 
최대한 선언적인 트랜잭션 방식으로 프로그램을 설계해야 한다. 

설명한 3가지 방식 모두 설정해서 사용해도 된다.
하지만 무조건 통일적인 방식으로 할것 

다음과 같이 빈의 클래스에 직접 @Transactional 을 적용할 수도 있다.

http://blog.naver.com/tkstone/50193141378

select * from mvc_board order by bid desc;

delete from mvc_board where bid BETWEEN 6704 and 100000;

commit;