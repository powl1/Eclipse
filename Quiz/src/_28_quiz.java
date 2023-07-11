
public class _28_quiz {
	public static void main(String[] args) {
		Grade grade = new Grade();
		
		grade.setGrade(85, 80, 85);
		double avg=grade.getAvg();
		char result = grade.getGrade();
		System.out.println(avg);
		System.out.println(result);
	}
}
class Grade {
	int kor, eng, math;
	double avg;
	
	void setGrade(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math =  math;
	}
	
	double getAvg() {
		return (kor + eng + math) / 3.0;
	}
	
	char getGrade() {
		double avg = getAvg();
		char grade ='가';
		if(avg >= 90.0) {
			grade= '수';
		} else if(avg >= 80.0 ) {
			grade= '우';
		} else if(avg >= 70.0 ) {
			grade= '미';
		} else if(avg >= 60.0 ) {
			grade = '양';
		} else {
			grade= '가';
		}
		return grade;
	}
}