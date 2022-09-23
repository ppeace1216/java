package sec3;
/* 싱글톤 : 자바 디자인 패턴 중에서 오로지 하나의 객체만 생성할 수 있도록 하는 객체 지향 프로그램 */
public class Singletone {
	private static Singletone bungle = new Singletone();
	private Singletone() {}
	static Singletone getInstance(){
		return bungle;
	}
}
//멤버 필드와 메소드에  static이 있어야하며 접근제한자는 default여야 한다
