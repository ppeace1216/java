package sec3;

import sec2.Student;

public class SystemEx2 {
	public static void main(String[] args) {
		Student st;
		st = new Student(1,"나야나");	//쓰레기1
		st = null;		//쓰레기 2
		st = new Student();		//쓰레기3
		st = new Student(2,"너야너");
		
		System.out.println(st.sno+", "+st.sname);
		System.gc(); 	//Garbage Collection 쓰레기의 데이터를 싹 정리
	}

}
