
public class WhileBasic {

	public static void main(String[] args) {

		int num = 1;
		
		while(num <= 5) {
			System.out.println("Hello World!" + num); //1
			num++;
		}
		
		System.out.println(num);
		//////////////////////////
		num = 1;
		sum = 0;
		
		do { // 먼저 실행이 되고
			sum = sum + num;
			num++;
		} while(num <= 10) {
			System.out.println("Hello World!" + num); 
			num++;
		}
		
		System.out.println(num);

	}

}
