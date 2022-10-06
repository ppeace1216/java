package sec1;
//키와 값을 공통으로 갖거나 두개의 클래스로 일반화 클래스를 만드는 경우
//Map 구조를 상속 받아서도 가능
public class ClassEx2 {
	public static void main(String[] args) {
		//Moving<Integer, String> m1 = Moving<>();
		Moving<String, Integer> m1 = new Moving();
		m1.key = "age";
		m1.value =40;
		Moving<Car, Tire> m2 = new Moving<>();
	}
}
class Moving<K,V>{	//key, value를 타입에서 활용 가능함(=Dictionary)
	public K key;
	public V value;
}
class Car{}
class Tire{}