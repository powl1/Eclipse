public class _15_quiz {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			if((i % 2) == 1) {
				for(int j = 1; j <= 9; j++) {
					System.out.println(i + " * " + j + " = " + (j*i));
				}
			}
		}
	}

}