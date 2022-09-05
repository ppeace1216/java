package sec1;
//프로그램(Operation)의 모든 명령은 Op-code(연산자)와 Operand(피연산자)로 이루어지며,
//a = a + b; ->제2주소 명령형식 (기억장소의 수에 따라 달라짐)
//+ : 연산(명령) -> Op-code
//a, b -> Operand
//입력항에 따라 단항(unary)연산과 이항(binary)연산으로 분류됨
//연산의 종류에 따라 산술, 논리, 비교, 비트, 증감, 대입 연산 등이 있음 -> p.64 참고

public class Oper1 {
	public static void main(String[] args) {
		int a=20, b=30, c;
		System.out.println(a);
		prt();
		c = a + b;
		//운용방식1 : +ab	-> pre(fix) order(전위)
		//운용방식2 : ab+	-> post(fix) order(후위)
		//운용방식3 : a+b	-> in(fix) order(중위)
	}

	public static void prt(){
		System.out.println("data");}
}
