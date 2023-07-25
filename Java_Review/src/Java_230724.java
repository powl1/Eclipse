import java.util.Scanner;
import java.util.Random;

public class Java_230724 {

	public static void main(String[] args) {
		
		System.out.println("==================================================");
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		
		System.out.println("==================================================");
		Random lotto = new Random();//랜덤 객체 생성
		System.out.print("로또번호는 : ");
		for(int i=0;i<6;i++) {
			System.out.print("[" + (lotto.nextInt(45)+1) +"]"); //로또번호 출력
		}
		System.out.println();
		
		System.out.println("==================================================");
		for(;;) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		System.out.print("국어 : ");
		int kor = Integer.valueOf(scanner.nextLine());
		System.out.print("영어 : ");
		int eng = Integer.valueOf(scanner.nextLine());
		System.out.print("수학 : ");
		int math = Integer.valueOf(scanner.nextLine());
		Grade2 grade = new Grade2(name, kor, eng, math);
		System.out.println(name + "님의 평균은 " + grade.avg() + "점이고 성적은 " + grade.getGrade() + "입니다");
		String cmd; // cmd 받기
		System.out.print("계속하시겠습니까? "); // 계속 진행하냐 묻기
		cmd = scanner.nextLine(); // cmd를 입력받기
		if(cmd.equals("no") || cmd.contentEquals("No")) break; // cmd의 글자가 no 라면 브레이크를 통해 for문 나가기
		} 
		System.out.println("종료되었습니다.");
		
		
	}

}

class TV2 {
	private int size; // pricate 이라 상속받아 접근X

	public TV2(int size) { // 부모생성사를 이용해서 접근 가능
		this.size = size;
	}

	public int getSize() {
		return size;
	}
}

class ColorTV extends TV2 {
	// int size;
	int color;
	
	public ColorTV(int size, int color) {
		super(size); // 부모 생성자를 실행
		this.color = color;
	}
	
	public void printProperty() { // 매소드면 괄호(()) 넣어줘야한다.
		System.out.println(super.getSize() +"인치 " + color + "컬러");
	}

//	@Override
//	public int getSize() { // 오버라이딩 : 타입, 이름, 매개변수가 가타야한다.
//		return size;
//	}
	
}

class Grade2 {
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	
	public Grade2() { // 오버로딩
		
	}
	
	public Grade2(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public double avg() {
		sum = kor + eng + math;
		return avg = sum / 3.0;
	}
	public double avg(int sum) {
		return sum/3.0;
	}
	
	public char getGrade() {
		if(avg >= 90) {
			return '수';
		} else if (avg >= 80) {
			return '우';
		} else if (avg >= 70) {
			return '미';
		} else if (avg >= 60) {
			return '양';
		} else {
			return '가';
		}
	}
}

