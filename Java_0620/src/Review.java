
public class Review {
	
	public static char gradChar(double num1) {
		if(num1 >= 90) {
			return '수';
		} else if(num1 >= 80) {
			return '우';
		} else if(num1 >= 70) {
			return '미';
		} else if(num1 >= 60) {
			return '양';
		} else {
			return '가';
		}
	}
	
	public static void showStar(int num) {
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num;j++) {
				if(i<j) {
					System.out.print("");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

	public static double getCircleAre( int radius) { // 원 지름 구하
		
		final double PI = 3.14;
		
		return radius * radius * PI;
		
	}
	
	public static double getReectangleAre(double width, double height) {
		
		return width * height;
		
	}
	
	public static double getTriangleAre(double row, double col) {
		return (row * col) / 2.0;
	}
	
	public static int getAscAre(char ch) { // 문자 입력시 아스키코드 출력 [형변환]
		return (int)ch;
		// char ch 에 A 가 들어가면 
		// return (int)ch; 문자 65의 A 가 아닌 (int)ch 로 문자를 숫자로 인식해야한다 의미
	}
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<i;j++) {
				if(i<j) {
					System.out.print("");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		System.out.println();
		System.out.println("===================================================");
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>0;j--) {
				if(i>j) {
					System.out.print("");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		System.out.println();
		System.out.println("===================================================");
		System.out.println();
		
		for(int i=1;i<=5;i++){
			for(int j=5;j>0;j--){
				if(i<j){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		System.out.println();
		System.out.println("===================================================");
		System.out.println();
		
		for(int i = 1; i <= 5; i++) {

		    // 공백 j for문
		    for(int j = 1; j < i; j++) {
		        System.out.print(" ");
		    }
		    
		    // 별 j for문
		    for(int k = 5; k >= i; k--) {
		        System.out.print("*");
		    }
		    
		    System.out.println("");
		}
		
		System.out.println();
		System.out.println("===================================================");
		System.out.println();
		
		showStar(1);
		System.out.println();
		showStar(2);
		System.out.println();
		showStar(3);
		
		System.out.println();
		System.out.println("===================================================");
		System.out.println();
		
		System.out.println(gradChar(90.8)); //수
		System.out.println(gradChar(80.0)); //우
		System.out.println(gradChar(50.0)); //가"
		
		System.out.println();
		System.out.println("===================================================");
		System.out.println();
		
		double area = getCircleAre(10);
		System.out.println(area); // 314.0
		
		System.out.println();
		System.out.println("===================================================");
		System.out.println();
		
		area = getReectangleAre(10,20);
		System.out.println(area); // 200.0
		
		System.out.println();
		System.out.println("===================================================");
		System.out.println();
		
		area = getTriangleAre(10,20);
		System.out.println(area); // 100.0
		
		System.out.println();
		System.out.println("===================================================");
		System.out.println();
		
		int code = getAscAre('A');
		System.out.println(code); // 65
		
		
		
		
	}

}
