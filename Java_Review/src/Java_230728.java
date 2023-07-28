
public class Java_230728 {
	public static void main(String[] args) {
		int kor = 90;
		int eng = 70;
		int mat = 45;
		
		int sum = kor + eng + mat;
		double avg = sum / 3.0;
		
		System.out.println("총점 : " + sum + "점");
		System.out.println("평균 : " + avg + "점");
		System.out.println("=====================================================");
		
		int num1 = -6;
		int num2 = 10;
		int num3 = 1;
		
		int max = num1;
		max = (max > num2) ? max : num2;
		max = (max > num3) ? max : num3;
		System.out.println(max);
		System.out.println("=====================================================");

		sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100의 합 : "+sum);
		System.out.println("=====================================================");
		
		sum = 0;
		for(int i = 1; i<=100; i++) {
			if((i%2)==0)
			sum += i;
		}
		System.out.println("1~100의 짝수의 합 : " + sum);
		System.out.println("=====================================================");
		
		int dan = 3;
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
		System.out.println("=====================================================");
		
		for(int i=1;i<=100;i++) {
			if((i%7)==0 && (i%11)==0)
			System.out.println("7의 배수이자 11의 배수인 숫자 : " + i);
		}
		System.out.println("=====================================================");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=====================================================");
		
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====================================================");
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				if(i>j) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====================================================");
		
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				if(i<j)
				System.out.print(" ");				
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====================================================");
		
	}
}

