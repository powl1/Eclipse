
public class SCE {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0) && ((num2 +=10) > 0); // 한개라도 false가 되면 뒤에 계산 조차 하지 않는다
		
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2 + '\n');
		
		result = ((num1 += 10) > 0) || ((num2 += 10) > 0); // 
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2 + '\n');
		
		System.out.print("******************** " + '\n');
		//print : 개행이 포함 되어 있지 않는다.
		//println(line new) : 개행이 포함되어 있다.
	}

}
