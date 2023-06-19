
public class TIMER01 {

	public static void main(String[] args) {
		int kor, eng, math;
		int sum;
		double avg;
		
		kor = 90;
		eng = 70;
		math = 45;
		
		sum = kor + eng + math;
		avg = sum / 3.0;
		
		char grade;
		
		if(avg >= 90) {
			grade ='수';
		} else if(avg >= 80) {
			grade = '우';
		} else if(avg >= 70) {
			grade = '미';
		} else if(avg >= 60) {
			grade = '양';
		} else {
			grade = '가';
		}
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("성젹 : " + grade);

	}

}
