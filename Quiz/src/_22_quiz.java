
public class _22_quiz {
	

	public static void main(String[] args) {
		System.out.println(add(3,5)); //8
		System.out.println(sub(3,5)); //-2
		System.out.println(mul(3,5)); //15
		System.out.println(gradChar(90.8)); //수
		System.out.println(gradChar(80.0)); //우
		System.out.println(gradChar(50.0)); //가
	}

	private static int add(int i, int j) {
		int result = i + j;
		return result;
	}
	
	private static int sub(int i, int j) {
		int result = i - j;
		return result;
	}
	
	public static int mul(int i, int j) {
		return i * j;
	}
	
	public static char gradChar(double num1) {
		if(num1 >= 90) {
			return '수';
		} else if(num1 >= 80) {
			return '우';
		} else if(num1 >= 70) {
			return '미';
		} else if(num1 >= 60) {
			return '양';
		} else {
			return '가';
		}
	}

}
