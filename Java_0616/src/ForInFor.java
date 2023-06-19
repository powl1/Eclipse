
public class ForInFor {

	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {  // 2단부터 9단까지 진행 위한 바깥쪽 for문
			for(int j = 1; j < 10; j++) {  // 1부터 9까지의 곱을 위한 안쪽 for문
				System.out.println(i + " x " + j + " = " + (i*j));
			}
		}
		
		
		for(int i = 1; i < 10; i++) {  // 2단부터 9단까지 진행 위한 바깥쪽 for문
			for(int j = 1; j < 10; j++) {  // 1부터 9까지의 곱을 위한 안쪽 for문
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println(); // 입력값이 없으면 개행만 한다.
		}
		
		/**
		 * for문의 출력
		 * 
		 * for(int i = 2; i < 10; i++) {                              //  int i = 2; i < 10; --> true 면 아래도 내려간다.
			for(int j = 1; j < 10; j++) {                             //  int j = 1; j < 10; --> true 면 아래도 내려간다.
				System.out.println(i + " x " + j + " = " + (i*j));    //  i - 1, j - 1 --> 1 x 1 = 1
			}                                                         // 값을 출력 했으면 다시 위로 올라가 i++ 을 하여 1-->2로 가며, 위에 내용을 i < 10 까지 반복하여 값을 출력한다.
			System.out.println(); // 입력값이 없으면 개행만 한다.
		}
		
		 */
		
		
		/*------------------------------------------------------------------*/
		// 구구단 짝수 단을 출력하라
		for(int i = 1; i < 10; i++) {  // 2단부터 9단까지 진행 위한 바깥쪽 for문
			for(int j = 1; j < 10; j++) {  // 1부터 9까지의 곱을 위한 안쪽 for문
				if((i % 2) ==0) {
					System.out.println(i + " x " + j + " = " + (i*j));
				}
			}
			System.out.println(); // 입력값이 없으면 개행만 한다.
		}
		
		
		/*------------------------------------------------------------------*/
		// 강사님의 BEST 깔끔한 답
		
		for(int i = 1; i < 10; i++) {  // 2단부터 9단까지 진행 위한 바깥쪽 for문
			if((i % 2) ==0)
				continue;
			// continue에서 걸리면 제일 처음 위로 가고, for 조건의 i++ 로 간다.
			
			for(int j = 1; j < 10; j++) {  // 1부터 9까지의 곱을 위한 안쪽 for문
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println(); // 입력값이 없으면 개행만 한다.
		}
		
		/*------------------------------------------------------------------*/
		// 구구단 결과 같이 홀수인 것만 출력
		
		for(int i = 1; i < 10; i++) {  // 2단부터 9단까지 진행 위한 바깥쪽 for문
			for(int j = 1; j < 10; j++) {  // 1부터 9까지의 곱을 위한 안쪽 for문
				if(((i*j) % 2) == 1)
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println(); // 입력값이 없으면 개행만 한다.
		}
		
		
	}

}
