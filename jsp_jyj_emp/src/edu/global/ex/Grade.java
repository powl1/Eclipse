package edu.global.ex;

public class Grade {
   private String name;
   private int kor, eng, math; //인스턴트 변수

   public Grade(String name,int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
   }

   public double getTotal() {
      return (kor + eng + math) ;
   }
   
   public double getAvg() {
      return (kor + eng + math) / 3.0;
   }

   public String showInfo() {
      return name + "님의 평균은" + getAvg() + "성적은" + getGrade() + "입니다.";
   }
   
   public char getGrade() {
      char ch = '가';
      double avg = getAvg();

      if (avg >= 90) {
         ch = '수';
      } else if (avg >= 80) {
         ch = '우';
      } else if (avg >= 70) {
         ch = '미';
      } else if (avg >= 60) {
         ch = '양';
      }else {
         ch ='가';
      }

      return ch;
   }
}