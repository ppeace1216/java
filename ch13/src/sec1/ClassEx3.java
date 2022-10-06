package sec1;
//메소드의 매개변수나 리턴 타입을 일반화(범용화)하는 제네릭 메소드 클래스
//<T,R> R method(T t)
public class ClassEx3 {
	public static void main(String[] args) {
		Box<Integer> box0 = Util.<Integer>boxing(100);	//첫번째 방법
		Box<String> box1 = Util.<String>boxing("평화");
		int intValue = box0.get();
		String strValue0 = box1.get();
		System.out.println(intValue);
		System.out.println(strValue0);
		Box<String> box2 = Util.boxing("박평화");	//두번째 방법
		String strValue = box2.get();
		System.out.println(strValue);
	}
}
class Util{
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
class Box<T>{
	private T t;
	public T get() {return t;}
	public void set(T t) {this.t = t;}
}