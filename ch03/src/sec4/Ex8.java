package sec4;

public class Ex8 {

	public static void main(String[] args) {
		// 이중for문을 활용하여 아래와 같은 형태의 구구단을 출력
/*
 * 2*1=2	3*1=3	......
 * 2*2=4	3*2=6	......
 * .......................
 * 2*9=18	
 */
		int a = 0, b = 0;
		for(b=1;b<10;b++){
			for(a=2;a<10;a++){
				System.out.print(+a+" * "+b+" = "+(a*b)+"\t");
			}
			System.out.println();
		}
		System.out.println("\n");
//팩토리얼(!) -> 예시)5!=1*2*3*4*5		
		System.out.println("수열 - 팩토리얼의 합계 출력");
		int mul=1;		//곱할거라서 0으로 시작하면 안됨
		long res=0;	
		for(int i=1;i<=10;i++){
			mul*=i;
			res+=mul;
		}
		System.out.println("1!~10!의 합계 : "+res);
	}
}
