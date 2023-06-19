
public class Star01 {

	public static void main(String[] args) {
		// 기본 별찍기
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		System.out.println();
		System.out.println("===================================================");
		System.out.println();
		
		
		//강사님 답변 1
		for(int i=1;i<=5;i++){
				System.out.println("*****");
		}
		System.out.println();
		
		//강사님 답변 2
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("===================================================");
		System.out.println();
		
		//순차적으로 늘리며 별 찍기
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println();
		System.out.println("===================================================");
		System.out.println();
		
		// 역순차적으로 줄이며 별 찍기
		
//		for(int i = 1; i <= 5; i++){
//			for(int j = i; j <= 5; j--){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=6-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("===================================================");
		System.out.println();
		
		//오른쪽 정렬로 별찍기
		
		for(int i=1;i<=5;i++){
			for(int j=5;j>0;j--){
				if(i<j){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		System.out.println();
		System.out.println("===================================================");
		System.out.println();
		
		//오른쪽 정렬로 별찍기
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<i;j++){
				System.out.print("1");
			}
			for(int j=1;j<=1;j++) {
					System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}

}
