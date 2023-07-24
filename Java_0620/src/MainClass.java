// Object Oriented Programing(객체지향언어) [OOP] = 자바

class Student {
	int age;
	char gender;
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		// this.age = age;
		// this 는 클래스 안에 
		this.age = age;
	}
}

class Circle {
	   double radius;

	   public double getRadius() {
	      return radius;
	   }

	   public void setRadius(double radius) {
	      this.radius = radius;
	   }

	   public double getArea() {
	      return radius * radius * Math.PI;
	   }
	}


class Rectangle2 {
	double width, height;
	
	void setWidthHeight (double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return width * height;
	}
}

/** 클래스명을 이용하여 별찍기 */
class StarPrint {
	/**별찍기*/
	void printTriangle (int num) {
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**역방향 별찍기*/
	void printReverseTriangle (int num) {
		for(int i=1; i<=num; i++) {
			for(int j=i; j<=num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
// 전체 파일에서 특정 문자 찾기 
// ctrl + shift + alt + l : 키서치

/**Num값의 합 구하기*/
class GetSum {
	int num;
	
	void setNum(int num1) {
		num = num1;
	}
	
	int sum() {
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}
}

/**구구단 구하기*/
class Gugudan {
	void printGugu(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <=9; j++) {
				System.out.println(i + " * " + j + " = " +  (i*j));
			}
		}
		System.out.println(" ");
	}
}

/**과목의 총점, 평균, 등급 구하는 함수*/
class Grade {
	int kor, eng, math;
	
	/**국어, 영어, 수학 값 입력 함수*/
	void setGrade(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	/**국영수의 평균값 구하는 함수*/
	double getAvg1() {
		return (kor + eng + math) / 3.0;
	}
	
	/**국영수의 평균값에 따른 등급 함수*/
	char getGrade1() {
		
		char ch = '가';
		double avg = getAvg1(); // 자기 자신 내부에서는 언제든 사용 가능
		
		if(avg >= 90) { 
			ch = '수';
		} else if (avg >= 80) { 
			ch = '우';
		} else if (avg >= 70) { 
			ch = '미';
		} else if (avg >= 60) { 
			ch = '양';
		} else { 
			ch = '가';
		}
	}
	

}


// 클래스와 객체 = 인스턴스의 차이
public class MainClass {

	public static void main(String[] args) {
		
		//////////////////////////////////////////
		
		Rectangle2 rec = new Rectangle2(); 
		// Rectangle 변수 선언 rec(레퍼런스)
		rec.setWidthHeight(10, 5);
		
		System.out.println(rec.getArea());
		
		Rectangle2 rec2 = new Rectangle2(); 
		// Rectangle 변수 선언 rec(레퍼런스)
		rec.setWidthHeight(10, 10);
		
		System.out.println(rec2.getArea());
		
		System.out.println("/////////////////////////////////////////");
		
		Student kim = new Student(); // 객체(인스턴스)
		Student 백지효 = new Student();
		Student 김민성 = new Student();
		
		백지효.setAge(30);
		백지효.age = 15;
		백지효.setGender('M');
		// 김민성.age = 15;
		// 객체가 기본적으로 가지고 있는 값은 0
		
		char gender = 백지효.getGender();
		System.out.println(gender);

		Rectangle rce = new Rectangle();
		
		rec.width = 3;
		rec.height = 5;
		
		System.out.println(rec.width);
		System.out.println(rec.height);
		
		System.out.println(백지효.age);
		System.out.println(김민성.age);
		
		System.out.println("/////////////////////////////////////////");
		
		StarPrint strPrint = new StarPrint();
		 
		strPrint.printTriangle(3);
		System.out.println();
		strPrint.printReverseTriangle(3);
		
		System.out.println("/////////////////////////////////////////");
		
		GetSum getsum = new GetSum();
		int num; // 2)num 변수 선언
		
		num = 50;
		
		getsum.setNum(num); // 3)getsum 객체의 setNum함수 호출, num값 50저장
		
		num = getsum.sum(); // 4)getsum객체의 sum함수 호출, 1-50까지 합 구함
	    System.out.println(num);
	    
	    System.out.println("/////////////////////////////////////////");
	    
	    Gugudan gugudan = new Gugudan();
	    gugudan.printGugu(10); //1단부터 10단까지 출력
	    gugudan.printGugu(20); //1단부터 20단까지 출력
	    
	    Grade kim1 = new Grade(); // kim 의 grade New[함수를 사용하게 메모리에 올려라]
	    kim1.setGrade(70, 100, 45); // kim 의 성적값 입력
	    System.out.println(kim1.getAvg1()); // kim 의 평균값 출력
	    System.out.println(kim1.getGrade1()); // kim 의 등급 출력

	}

}
