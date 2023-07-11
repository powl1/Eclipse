
public class _26_quiz {
	public static void main(String[] args) {
		StarPrint strPrint = new StarPrint();
		 
		strPrint.printTriangle(3);
		System.out.println();
		strPrint.printReverseTriangle(3);
	}
}

class StarPrint {
	public static void printTriangle(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void printReverseTriangle(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
