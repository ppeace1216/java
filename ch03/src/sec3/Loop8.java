package sec3;

public class Loop8 {

	public static void main(String[] args) {
		// 이중for문을 활용하여 아래와 같은 형태의 구구단을 출력
/*
 * 2*1=2	3*1=3	......
 * 2*2=4	3*2=6	......
 * .......................
 * 2*9=18	
 */
		int a = 0;
		int b = 0;
		for(a=2;a<10;a++){
			for(b=1;b<10;b++){
				System.out.print(+a+" * "+b+" = "+a*b+"\t");
			}
			System.out.println();
		}
		
			
		
	}

}
