
public class ForBasic {

	public static void main(String[] args) {
		/*for (;;) {
			System.out.println("무한루프");
		}*/
		
		for (int i=0; i < 5; i++) {
			System.out.println("무한루프");
		}
		
		int sum = 0;
		for (int i=1; i<=10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		// fot ( 1; 2; 4;) {
		//		3;
		// }
		
		// 1 - 반복의 횟수를 세기 위한 변수
		// 2 - 반복의 조전
		// 3 - 반복의 조건을 무너뜨리기 위한 연산
		
		/*-------------------------------------------------------*/

		// 1 ~ 100 까지의 수 중 짝수의 값을 구하시오.
		sum = 0;
		for (int i=1; i<=100; i++) {
			if(i % 2 == 0) {
			  System.out.println(i);
			}
			i++;
			sum = sum + i;
		}
		System.out.println(sum);
		
		// 강사님의 답
		sum = 0;
		for (int i=1; i<=100; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		
		/*-------------------------------------------------------*/

		// 1 ~ 100 까지의 수 중 홀수의 값을 구하시오.
		sum = 0;
		for (int i=1; i<=100; i++) {
			if(i % 2 == 1) { // i % 2 != 0
				sum = sum + i;
			}
		}
		System.out.println(sum);
		
		/*-------------------------------------------------------*/
		
		// 3단 값을 구하시오.
		for(int i=1;i<10;i++){
			System.out.println("3*"+i+" = " +3*i);
		}
		
		// 강사님 답
		int dan = 3;
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
		
		/*-------------------------------------------------------*/
		
		// 7단 값을 구하시오.
		dan = 7;
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
		
		// 11의 배수이자 7의 배수인 첫번째 숫자.
		for(int i = 1; i <= 100; i++) {
			if((i % 11) == 0 && (i % 7) == 0) {
				System.out.println(i);
				break;
				// for문과 switch 에서 빠져나오는 아이다.
			}
			
			
		}
		
		
		
		
		
		
	}

}
