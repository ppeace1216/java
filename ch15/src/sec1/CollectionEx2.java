package sec1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionEx2 {

	public static void main(String[] args) {
		List lst = new ArrayList();		//List 밑에서는 형변환 가능
		lst = new Vector();
		lst = new LinkedList();
		
		ArrayList lst2 = new ArrayList();
		//lst2 = new Vector();  ->형제끼리는 형변환이 불가
		
		method1(lst);
		method1(lst2);
		//method2(lst);  - lst는 List로 선언된 것이며 메소드의 매개변수는 ArrayList로 선어되었기 때문에 형변환이 불가하여 사용할 수 없음
		method2(lst2);
	}
	static void method1(List ls){
		
	}
	static void method2(ArrayList ls){
		
	}
}
