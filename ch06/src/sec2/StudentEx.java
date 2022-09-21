package sec2;

public class StudentEx {
	public static void main(String[] args) {
		Student stu = new Student("김기태",90,80,90);
		System.out.println("이름 : "+stu.name);
		System.out.println("총점 : "+stu.calcTot());
		System.out.println("평균 : "+stu.calcAvg());
		System.out.print("학점 : ");
		stu.calcHak();
		System.out.print("판정 : ");
		stu.calcRes();
	}

}
