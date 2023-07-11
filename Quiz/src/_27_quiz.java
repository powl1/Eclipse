
public class _27_quiz {
	public static void main(String[] args) {
		Gugudan gugudan = new Gugudan();
		gugudan.printGugu(10); //1단부터 10단까지 출력
		gugudan.printGugu(20); //1단부터 20단까지 출력
	}
}
class Gugudan {
	public static void printGugu(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
	}
}