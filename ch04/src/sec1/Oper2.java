package sec1;

public class Oper2 {
	public static void main(String[] args) {
		//산술연산자
		int a=15, b=20;
		System.out.println("a+b="+(a+b));	//더하기
		System.out.println("a-b="+(a-b));	//뺴기
		System.out.println("b*a="+(b*a));	//곱하기
		System.out.println("b/a="+((float) b/a));	//나누기
		System.out.println("b%a="+(b%a));	//나머지
		//부호연산자
		System.out.println(-a);
		System.out.println(-(a-b));
		
	}
}
