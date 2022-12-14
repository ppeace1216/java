package sec1;
//완전 추상체
//인터페이스는 추상체이므로 직접 해당 생성자를 활용하여 객체를 생성할 수 없다.
public interface Interface1 {
	int MAX = 20;	//final static 안붙여도 상수가 된다
	int MIN = 1;	//상수필드
	
	//interface는 abstract이 기본으로 설정된 것과 같음
	void method1();	//일반 멤버 메서드는 선언만 가능하며, 실행 내용은 기술할 수 없다.
	int method2(int pa1, String pa2);	//parameter:매개변수
	static void method3(int pa1){	//정적 메서드는 선언만 할 수 없다! 선언과 실행 내용을 모두 기술
		System.out.println(pa1+"값을 전달받았습니다");
	}
	default int method4(String pa1){	//디폴트 메서드도 선언과 실행 내용을 모두 기술
		return 1004;
	}
}
