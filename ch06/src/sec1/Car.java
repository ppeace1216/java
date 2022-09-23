package sec1;
//교재 198p 참고
public class Car {
	String company;		//멤버필드
	String model;
	private String color;
	private int maxSpeed;
	int speed;
	int rpm;
	Body body;
	Engine engine;
	Tire tire;
	
	//[접근제한자][수정자] 데이터타입   필드명;
	
	//멤버상수
	//final static 데이터타이 상수명 = 값;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	//[접근제한자] 반환타입  메서드명 ([매개변수타입][매개변수명],....){
	// 실행할 내용;
	// return 반환변수 또는 값;		->반환변수가 가지는 값이나 반환되는 값의 종류가 반환타입과 일치해야 한다.
	// 반환을 하지 않는 경우는 반환타입이 void
	//}
	
	//[접근제한자] 클래스명 ([매개변수타입][매개변수명],....){
	// this.필드명 = 매개변수명;
	// this([매개변수명 | 값);
	//}
}
