package sec1;

public class Oper4 {
	public static void main(String[] args) {
		int a=200, b=100, c=20, d=10;
		// 비교연산자(==, !=, >, >=, <, <=) -> true 또는 false로 결과가 산출됨
		//== 같다 (이다)
		//!= 같지 않다 (다르다)
		//> 크다 (초과==후)
		//>= 크거나 같다 (이상==이후)
		//< 작다 (미만==전)
		//<= 작거나 같다 (이하==이전)
		System.out.println("a==b => "+(a==b));	//false
		System.out.println("a!=b => "+(a!=b));	//true
		System.out.println("a>b => "+(a>b));	//true
		System.out.println("a>=b => "+(a>=b));	//true
		System.out.println("a<b => "+(a<b));	//false
		System.out.println("a<=b => "+(a<=b));	//false
		System.out.println("a가 문자열이 맞습니까? => "+a instanceof String); 	//true  +a까지 문자열로 치기 때문에 true가 나온다
		// 논리연산자 (이항 연산)
		// 논리연산자 (단항 연산)
		// 입력		!(a>b)
		// 0		1			=>진리 테이블
		// 1		0
		System.out.println("a>b && c>d =>"+(a>b && c>d));	//true
		System.out.println("a<b || c<d =>"+(a<b || c<d));	//false
		System.out.println("!(a>b) +>"+(!(a>b)));	//false
		//삼항연산자
		//삼항 => 조건 ? 참일때식 : 거짓일때식
		System.out.println(a>=b ? "크거나 같다" : "작다");
		
	}

}
