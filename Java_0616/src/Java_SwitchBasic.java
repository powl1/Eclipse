
public class Java_SwitchBasic {

	public static void main(String[] args) {
		int n = 3;
		
		switch(n) {
		case 1:
			System.out.println("Simple Jave");
			break;
			// 출력값 때문에 case 3이 출력 되어야 하지만,
			// break 를 걸었기 때문에 case1에서 걸려 출력됨.
		case 2:
			System.out.println("Funny Jave");
		case 3:
			System.out.println("Fantastic Jave");
		default:
			System.out.println("The best programing language");
		}
		
		System.out.println("Do you like jave?");
	}

}
