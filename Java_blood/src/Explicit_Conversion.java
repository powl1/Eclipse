
public class Explicit_Conversion {

	public static void main(String[] args) {
		//double pi = 3.1415;
		//int wholeNumber = (int)pi;
		
		//long num1 = 3000000007;
		//int num2 = (int)num1;
		// 위에는 말도 안되는 내용이다.
		
		//short num1 = 1;
		//short num2 = 2;
		//short num3 = (short)(num1 + num2);
		// short가 아니라 int를 사용해야한다.

		int num1 = 4;
		int num2 = 3;
		double num3 = num2 / num1;
		System.out.println(num3);
	}

}
