package sec4;

public abstract class Student {
	String schoolName;
	String bun;
	String name;
	int jum1;
	int jum2;
	int jum3;
	
	//추상화된 메서드 : abstract가 기술되어 있는 메서드로서 반환타입, 메서드명, 매개변수 등만 기술되어야 하며
	//구현내용은 기술하지 않고
	abstract int computerTot(int jum1,int jum2,int jum3);
	abstract double computerAvg(int jum1,int jum2,int jum3);
	//일반 멤버 메서드
//	public String computerHak(int jum1,int jum2,int jum3){
//		int tot = jum1+jum2+jum3;
//		if(tot>=90){
//			return="A"
//		}
//	}
}
