
public class Java_230720 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1부터 100까지의 합 : " + sum);
		System.out.println("==================================================");
		
		sum = 0;
		for(int j = 1; j <= 100; j++) {
			if((j%2)==0) {
				sum += j;
			}
		}
		System.out.println("1부터 100까지의 짝수의 합 : " + sum);
		System.out.println("==================================================");

		int dan = 3;
		for(int num = 1; num <= 9; num++) {
			System.out.println(dan + " * " + num + " = " + (dan*num));
		}

		System.out.println("==================================================");
		for(int e = 1; e <= 100; e++) {
			if((e%7) == 0 && (e%11) == 0) {
				System.out.println("11의 배수 이자 7의 배수인 첫번째 숫자는?" + e);
			}
		}
		
		System.out.println("==================================================");
		dan = 0;
		for(dan = 2; dan <= 9; dan++) {
			for(int num = 1; num <= 9; num++) {
				System.out.println(dan + " * " + num + " = " + (dan*num));
			}
			System.out.println();
		}
		
		System.out.println("==================================================");
		dan = 0;
		for(dan = 2; dan <= 9; dan++) {
			if((dan%2)==0)
			for(int num = 1; num <= 9; num++) {
				System.out.println(dan + " * " + num + " = " + (dan*num));
			}
			System.out.println();
		}
		
		System.out.println("=====================클래스=========================");
		GetSum getsum = new GetSum(); // 1)객체 생성
        int num; // 2)num 변수 선언

        num = 100;

        getsum.setNum(num); // 3)getsum 객체의 setNum함수 호출, num값 100 저장

        num = getsum.sum(); // 4)getsum객체의 sum함수 호출, 1-100까지 합 구함
        System.out.println(num);

        getsum.setNum(1000);
        num = getsum.sum(); // 4)getsum객체의 sum함수 호출, 1-1000까지 합 구함
        System.out.println(num);
        
        System.out.println("==================================================");
        Grade grade = new Grade(70,90,65); // 함수: 생성자 초기화 조건
        System.out.println(grade.getAvg());
        System.out.println(grade.getGrade());
        
        System.out.println("==================================================");
        for(int i = 1; i <= 5; i++) {
        	for(int j = 1; j <= i; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
        System.out.println("==================================================");
        for(int i = 1; i <= 5; i++) {
        	for(int j = 5; j >= i; j--) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
        System.out.println("==================================================");
        for(int i = 1; i <= 5; i++) {
        	for(int j = 5; j >= i; j--) {
        		if(j<i) {
        			System.out.print("*");
        		} else {
        			System.out.print("0");
        		}
        	}
        	System.out.println();
        }
        
        System.out.println("==================================================");
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
        
        System.out.println("==================================================");
        Song song = new Song(1978, "스웨덴", "ABBA", "Dacing Queen");
        song.show();
        
        System.out.println("==================================================");
        // Accumulator.showResult(); // 최종 누적 결과를 출력

	}
}



class Song {
	int year;
	String title;
	String artist;
	String country;
	
	public Song(int year, String country, String artist, String title) {
		this.year = year;
		this.title = title;
		this.artist = artist;
		this.country = country;
	}
	
	public void show() {
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른" + title);
	}
	
	
}

class TV {
	String name;
	int year;
	int inch;
	
	public TV(String name, int year, int inch) {
		this.name = name;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.println(name + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
	
}

class Grade {
	int kor, eng, math;
	int sum;
	double avg;

	public Grade(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public double getAvg() {
		sum = kor + eng + math;
		avg = sum/3.0;
		return avg;
	}
	
	public char getGrade() {
		// char ch = '가'; return 으로 반환하여 필요 없다
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

class GetSum {
	int num; // 변수 선언 
	public void setNum(int num) {
		this.num = num;
	}
	
	public int sum() {
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}
}
