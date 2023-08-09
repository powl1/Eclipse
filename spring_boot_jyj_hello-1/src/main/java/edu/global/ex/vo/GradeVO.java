package edu.global.ex.vo;

import lombok.Data;

@Data
public class GradeVO {
	
	private int kor;
	private int eng;
	private int mat;
	private int sum;
	private double avg;
	
	public int sum() {
		return (kor+eng+mat);
	}
	
	public double avg() {
		int sum = sum();
		return sum / 3.0;
	}
	
	public char getGrade() {
		
		double avg = avg();
		
		char ch;
		if(avg>=90) {
			ch = '수';
		} else if(avg>=80) {
			ch = '우';
		} else if(avg>=70) {
			ch = '미';
		} else if(avg>=60) {
			ch = '양';
		} else {
			ch = '가';
		}
		return ch;
	}
}