package sec1;

//메인실행클래스
public class Exy1 {

	public static void main(String[] args) {
		System.out.println("하이~ 자바!");
		Exy2 exy2 = new Exy2();
		exy2.method1();
		Exy3 st1 = new Exy3();
		st1.setName("박평화");
		st1.setKor(100);
		st1.setEng(60);
		st1.setMat(90);
		System.out.println("st1의 학생 이름은"+st1.getName());
	}

}
