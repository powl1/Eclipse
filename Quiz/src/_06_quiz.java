
public class _06_quiz {

	public static void main(String[] args) {
		int month;
		month = 5;
		
		switch(month) {
			case 12:
			case 1:
			case 2:
			case 3:
				System.out.println(month + "월은 31일 입니다.");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println(month + "월은 봄 입니다.");
				break;
			case 7:
			case 8:
				System.out.println(month + "월은 여름 입니다.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month + "월은 가을 입니다.");
				break;
			default:
				System.out.println("잘못된 입력값 입니다. 1월 ~ 12월 사이의 숫자를 입력해주세요");
		}

	}

}
