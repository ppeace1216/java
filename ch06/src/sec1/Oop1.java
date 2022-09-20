package sec1;

public class Oop1 {

	public static void main(String[] args) {
		//객체지향프로그래밍(Object Oriented Programming) - OOP
		//클래스와 같은 구조(틀)로 만든 인스턴스 -> 객체
		Member mem = new Member();
		//이 때 Member는 클래스명, mem은 인스턴스(객체), new는 객체를 만드는 명령(키워드),
		//Member()는 생성자(Constructor)
		//인스턴스 (객체)는 자바에서 1)기본적으로 제공하는 클래스이거나 2)사용자가 필요에 따라 만든 클래스로 부터 생성될 수 있다.
		String str = new String("kim");	//1)
		Member mem1 = new Member();		//2)
		//또한, 클래스는 멤버필드, 멤버상수, 생성자, 메서드 등으로 구성되는데 이를 캡슐화라 함
		//이렇게 구성된 클래스는 작성한 사람 또는 설계자만 알 수 있도록 하는 것을 정보은닉이라 하며, 
		//필요에 따라 기존 클래스로 유도하여 새로운 클래스를 만들 때 기존 클래스의 멤버필드 (속성), 메서드 등을 상속하여 활용할 수 있다.
		//상속이 될 때 상속을 해주는 클래스를 슈퍼 클래스라 하고, 상속을 받는 클래스는 서브 클래스라 함.
		//상속 후에 매서드나 생성자 함수를 여러 가지 형태로 다르게 바꿀 수 있는데 이를 메서드 오버라이딩과
		//하나의 클래스 내에서 메서드나 함수의 매개변수 개수나 변수 데이터타입에 따라 같은 이름으로 여러 개 지정이 가능한데 이를 오버로딩
		//객체를 만들 때 여러 형태로 만들거나 선언할 수도 있고, 메서드 오버라이딩이나 메서드 오버로딩과 같이 같은 이름의 여러 형태로 활용할 수 있을 -> 다형성
		//추상화 - 간소화된 꼭 필요한 요소만으로 구성하여 다른 서브 클래스들에서 공통으로 활용할 수 있도록 하는 것
		//공통으로 활용할 수 있도록 상세한 내용을 기술하지 않고 선언만 하는 것
		// -> 일부만 추상화된 클래스 (추상화 클래스), 완전한 추상화 클래스 (인터페이스)
	}
}
