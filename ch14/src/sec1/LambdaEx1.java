package sec1;
//Functional 메소드를 기반으로 기능을 람다식으로 정의하여 활용 : 인터페이스를 선언하고, 추상체를 구현함으로써 람다식을 
public class LambdaEx1 {
	//일반 메소드 정의
	public int method1(int x, int y){
		return x+y;
	}
	/* 람다식 구현방식 정의
	(x, y) -> {x+y};
	람다식 구현 종류  - 689p참고
	Consumer : 매개값 리턴값
	*/
}
