
public class _21_quiz {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j < i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
