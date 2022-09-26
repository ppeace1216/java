package sec2;

public class DmbPhoneEx {

	public static void main(String[] args) {
		CellPhone p1 = new CellPhone();
		CellPhone p2 = new DmbPhone();
		DmbPhone p3 = new DmbPhone();
		//DmbPhone p4 = new CellPhone();
		System.out.println(p1.COMPANY);
		System.out.println(p2.COMPANY);
		System.out.println(p3.COMPANY);
		p1.powerOn();
		p2.powerOn();
		p3.powerOn();
		//부모 클래스로부터 유도된 객체는 자식 클래스로부터 유도된 객체의 내용으로 변환될 수 있음
		p1=p3;	//자동 형 변환
		//자식 클래스로부터 유도된 객체는 부모 클래스로부터 유도된 객체의 내용으로 자동 변환되지 않음
		//그러므로 강제 형 변환하면 형 변환을 할 수 있음
		DmbPhone p6;
		p6 = (DmbPhone) p2;	//강제 형 변환
	}

}
