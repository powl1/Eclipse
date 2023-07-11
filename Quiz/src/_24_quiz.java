
public class _24_quiz {
	public static void main(String[] args) {
		double area = getCircleArea(10);
		System.out.println(area); //314.0

		area = getRectangleArea(10,20);
		System.out.println(area); //200.0
						
		area = getTriangleArea(40,20);
		System.out.println(area); //400.0
				
		int code = getAscCode('A');
		System.out.println(code); //65
	}

	private static int getAscCode(char c) {
		return c;
	}
	private static double getTriangleArea(int i, int j) {
		return (i*j) / 2;
	}
	private static double getRectangleArea(int i, int j) {
		return i * j;
	}
	static double getCircleArea(int r) {
		final double PI = 3.14;
		return r * r * PI;
	}
}
