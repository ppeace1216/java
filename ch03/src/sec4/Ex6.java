package sec4;

public class Ex6 {
	public static void main(String[] args) {
		for(int a=0;a<5;a++){			//a는 행 -> 0행부터 4행까지 실행시킨다
			for(int b=0;b<=a;b++){		//b는 열 
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n");
		//역삼각형
		for(int a=0;a<5;a++){
			for(int b=0;b<5-a;b++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n");
		for(int a=0;a<5;a++){
			for(int b=4;b>=a;b--){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
