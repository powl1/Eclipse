
public class EX01 {

	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
		System.out.println("===================================================");
		
		
		int num = 1;
		boolean search = false;
	
		
		while(num < 100) {
			if(((num % 7) == 0) && ((num % 11) == 0)) {
				search = true;
				break; // while 문 탈출
			}
			num++;
		}
		System.out.println("7의 배수이자 11의 배수인 수는 : " + num);
		
		System.out.println("===================================================");
		
		int dan = 3;
		for(int i=1; i<10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}

		System.out.println("===================================================");
		
		for(int i=0; i<=100; i++) {
			if((i % 2) == 0) {
				System.out.println(i);
			}
			int sum = 0;
			sum += i;
			System.out.println(sum);
		}
		
		System.out.println("===================================================");
		
//		num=0;
//		while (num<=100) {
//			int sum;
//			sum += num;
//			System.out.println(sum);
//			num++;
//		}
		
		System.out.println("===================================================");
		
		int month = 3;
		switch(3) {
			case 12:
			case 1:
			case 2:
			case 3:
				System.out.println(month + "월은 겨울입니다.");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println(month + "월은 봄입니다.");
				break;
			case 7:
			case 8:
				System.out.println(month + "월은 여름입니다.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month + "월은 가을입니다.");
				break;
					
		};
		
		
		System.out.println("===================================================");
		
		int num1 = -6;
		int num2 = 10;
		int num3 = 1;
		
		if(num1 < num2) {
			System.out.println(num2);
		}
		if(num1 > num3) {
			System.out.println(num1);
		}
		
		System.out.println("===================================================");
		
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				if ((i % 2) == 0) {
					System.out.println(i + " * " + j + " = " + (i*j));
				}
			}
		}
		
		
}
}
