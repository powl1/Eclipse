
public class PostfixOp {

	public static void main(String[] args) {
		int num = 5;
		System.out.println((num++) + " "); // 출력 후에 값이 증가
		System.out.println((num++) + " "); // 출력 후에 값이 증가
		System.out.println(num + "\n");
		
		System.out.println((num--) + " "); // 출력 후에 값이 감소
		System.out.println((num--) + " "); // 출력 후에 값이 감소
		System.out.println(num + "\n");

	}

}
