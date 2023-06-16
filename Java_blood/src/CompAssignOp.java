
public class CompAssignOp {

	public static void main(String[] args) {
		
		short num = 10;
		num = (short)(num + 77L); // 행 변환 안 하면 컴파일 오류 발생, 강제로 형 변환
		int rate = 3;
		rate = (int)(rate *3.5); // 행 변환 안하면 컴파일 오류 발생
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num += 77L; // 행 변환 필요 없음
		// 복합 대입 연산자는 본인 스스로 알아서 형변환이 되는 연산자이다.
		// 사용할 때 정확하게 알고 사용을 해야한다.
		rate = 3;
		rate *= 3.5; // 행 변환 필요 없음
		System.out.println(num);
		System.out.println(rate);

	}

}
