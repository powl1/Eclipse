class TV {
	String made;
	int year;
	int size;
	
	public TV(String made, int year, int size) {
		this.made = made;
		this.year = year;
		this.size = size;
	}
	public void show() {
		System.out.println(made + "에서 만든 " + year + "년형 " + size + "인치 TV");
	}
}

public class _25_quiz {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
		//LG에서 만든 2017년형 32인치 TV
	}
	
}
