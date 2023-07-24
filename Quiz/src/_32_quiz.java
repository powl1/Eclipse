
public class _32_quiz {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			if((i % 11) == 0 && (i % 7) == 0){
				System.out.println("11의 배수이자 7의 배수인 수는 : " + i);
			}
		}
	}
}
