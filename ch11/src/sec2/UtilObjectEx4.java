package sec2;

import java.util.Objects;

public class UtilObjectEx4 {

	public static void main(String[] args) {
		String data1 = "김담비";
		String data2 = null;
		
		System.out.println(data1.toString());
		try {
			System.out.println(data2.toString());
		} catch(NullPointerException e){
			System.out.println("null");
		}
		//Objects를 통해 예외처리
		System.out.println(Objects.toString(data1));
		System.out.println(Objects.toString(data2));
		System.out.println(Objects.toString(data2,"값이 없음"));
	}
}
//유효성, 데이터검색 등 object,objects로 가능