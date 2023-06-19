
public class EX04 {

	public static void main(String[] args) {
		/*1부터 10까지의 합*/
		// 1, 2, 3, 4 ...
		
		int num = 1;
		int sum = 0;
		// 핵심은 int sum 변수 하나 더 작성하는 것이다.
		
		while(num <= 10) {
			sum += num;
			System.out.println(num);
			num++;
		}
			
			System.out.println("합은 " + sum);
	}

}
