package sec2;

import java.util.Objects;

public class UtilObjectsEx2 {

	public static void main(String[] args) {
		Student s1 = new Student(1, "박평화");
		Student s2 = new Student(2, "김평화");
		Student s3 = new Student(3, "이평화");
		Student s4 = s1;	//얉은 복제 - 같은 메모리를 공유		같은 것 하나라고보면됨
		System.out.println(s1); 	//메모리 주소 출력 16진수
		System.out.println(s1.hashCode()); 		//메모리 주소 출력 10진수
		System.out.println(Objects.hashCode(s1));	//메모리 출력
		System.out.println(s4);
		System.out.println(s1.sname);
		System.out.println(s4.sname);
		s1.sname="김도연";		//s1만 바꿔도 s1과 s4가 변경됨
		System.out.println(s4.sname);
		
		Student s5 = new Student ( s1.sno, s1.sname );		//깉은 복제 deep copy - 서로 다른 메모리
		System.out.println(s1);
		System.out.println(s5);
	}
}
