
public class UnaryAddMin {

	public static void main(String[] args) {
		
		short num1 =5;
		
		System.out.println(+num1); //결과적으로 불필요한 + 연산
		// +num1 : +1*5 = +5
		System.out.println(-num1); //부호를 바꿔서 얻은 결과를 출력
		// +num1 : -1*5 = -5
		
		
		short num2 = 7;
		short num3 = (short)(+num2); // 형 변환 하지 않으면 오류 발생
		// +를 붙여서 오류가 발생한다.
		// +를 붙이면  +1*num2 를 해서 연산이 발생하여 오류가 발생한다.
		short num4 = (short)(-num2); // 형 변환 하지 않은면 오류 발생
		
		System.out.println(num3);
		System.out.println(num4);

	}

}
