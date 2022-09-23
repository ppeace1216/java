package sec3;

public class SingletoneEx {
//공유하는데에 static을 붙여서 공유하면 항상 같음
	public static void main(String[] args) {
		//Singletone single1 = new Singleton();
		Singletone single1 = Singletone.getInstance();
		Singletone single2 = Singletone.getInstance();
		Singletone single3 = Singletone.getInstance();
		System.out.println(single1);
		System.out.println(single2);
		System.out.println(single3);
		//객체이름만 다르고 값을 보면 결국 다 같은 주소로 나온다
		if(single1==single2){
			System.out.println("single1은 single2입니다.");
		}
	}
}
