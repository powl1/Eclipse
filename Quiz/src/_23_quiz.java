
public class _23_quiz {

	public static void main(String[] args) {
		showStar(1); // 1층석탑
		showStar(2); // 2층 석탑
		showStar(3); // 3층 석탑
	}
	public static void showStar(int num) {
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

}
