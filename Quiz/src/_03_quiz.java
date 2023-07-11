
public class _03_quiz {

	public static void main(String[] args) {
		int num1 = -6;
		int num2 = 10;
		int num3 = 1;
		
		int max = num1;
		
		if( max < num2) {
			max = num2;
		}
		if( max < num3) {
			max = num3;
		}
		
		System.out.println("최댓값: " + max);
	}
	
}
