package edu.global.ex.shape;


public class Grade { 

	public int sum;
	private double avg;

	public Grade(int kor, int eng, int math) {
		sum = kor+eng+math;
		avg = sum/3.0;
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