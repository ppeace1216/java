package sec2;

public class Car1 {
	public static void main(String[] args) {
		int a=1004, b;	//4byte
		short c, d;	//2byte
		long e=100, f;	//8byte
		byte g, h;	//1byte
		b = 65538;
		//c = a;
		c = 500;
		a = c;	//short -> int = 자동 형변환(auto casting)
		d = (short) b;	// 형 변환 연산자에 의한 형 변환 (force casting)
		System.out.println("d="+d); // 형 변환이 제대로 이루어지지 않음
		System.out.println("b="+b);
		/* e는 100*/
		e = b;
		/* e는 65538 */
		f = a + c;
		a = (int) (f + c);

		System.out.println(c);
		System.out.println(f);
		System.out.println(a);
		
	}

}
