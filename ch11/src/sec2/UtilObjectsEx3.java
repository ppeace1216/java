package sec2;

import java.util.Objects;

public class UtilObjectsEx3 {
	public static void main(String[] args){
	Student s1 = null;
	Student s2 = new Student(4, "이도희");
	Student s3 = new Student(5, "권지혜");
	
	System.out.println();
	if(Objects.isNull(s1)){
		System.out.println("s1이 null입니다");
	} else {
		System.out.println("s1은 not null입니다");
	}
	if(Objects.nonNull(s1)){
		System.out.println("s1이 not null입니다");
	} else {
		System.out.println("s1은 null입니다");
	}
	//if (s1==null)을 하고 싶은데 안될 때 위와 같이 활용해주면 된다.
	}
}