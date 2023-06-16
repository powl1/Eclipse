
public class EX01 {

	public static void main(String[] args) {
//		int kor = 90;
//		int eng = 70;
//		int mat = 45;
//		int sum = kor + eng + mat;
//		int avr = sum / 3;
//		
//		
//		System.out.println("총점 : " + sum + "점");
//		System.out.println("평균 : " + avr + "점");
//		
//		if ( avr > 90 ) {
//			System.out.println("성적 : 수" );
//		} else {
//			if ( avr > 80 ) {
//				System.out.println("성적 : 미" );
//			} else { 
//				System.out.println("성적 : 양" );
//			}
//		};
		
//		int i;
//		if ( avr > 90) {
//			i = 수;
//		} else if (avr > 80) {
//			i = 미;
//		} else if ( avr > 70 ) {
//			i = 양;
//		} else { 
//			i = 가;
//		}
//		System.out.println("성적은 : " + i + "입니다");
		
		
		//--------------------------------------------//
		
		int kor, eng, math;
		int total;
		double avg; // 소수점 나와야 해서 double
		char grade = '가';
		
		kor = 90;
		eng = 70;
		math = 45;
		
		total = kor + eng + math;
		avg = (double)(total / 3); // avg = totla / 3 은 오료가 뜬다.
		// total-int 3-int 두 개 모두 int 라서 소수점이 나오지 않는다.
		// 방법1 : total / 3.0
		// 방법2 : (double)(total / 3)
		
		if(avg >= 90) { 
			grade = '수';
		} else if (avg >= 80) {
			grade = '우';
		} else if (avg >= 70) {
			grade = '미';
		} else if (avg >= 60) {
			grade = '양';
		} else {
			grade = '가';
		}
		
		System.out.println("총점 : " + total + "점");
		System.out.println("평균 : " + avg + "점");
		System.out.println("성적 : " + grade );

		
		
		
		
		
		
			
	}

}
