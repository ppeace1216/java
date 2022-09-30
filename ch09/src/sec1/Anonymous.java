package sec1;

public class Anonymous {
	Vehicle field = new Vehicle(){	//필드를 통해 익명의 객체 만들기
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
	void method1(){	//메서드를 호출하면, 익명의 객체 만들기
		Vehicle localVar = new Vehicle(){
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		localVar.run();
	}
	//메서드의 매개변수로 받아 익명의 객체 만들기
	void method2(Vehicle v){
		v.run();
	}
}
