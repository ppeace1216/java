package sec1;

public class Type2 {

	public static void main(String[] args) {
		//reference (참조형) type : 여러 개(다수)의 데이터를 저장하기 위한 기억장소로서 null값이 허용됨
		//참조형의 종류 : array (배열형), enum (열거형), class (클래스), interface (인터페이스)
		int[] arr1 = {10,20,30};
		int[] arr2 = {10,20,30};
		int[] arr3 = null;		//reference type은 null값을 허용하나 pointer(히프영역의 주소)가 null이 되어 참조할 수 없는 예외가 발생됨
		//int a = null; - primitive type은 null 값일 수 없다.
		arr3[0] = 20;
		System.out.println(arr3[0]);
		System.out.println(arr1==arr2);	//false
		System.out.println(arr1!=arr2);	//true
		//주소를 비교하는 것이기 때문에 다르다고 나온다
		//참조형은 간접비교(간접접근을 하기때문에)를 해야 하므로 직접 비교하게 되면, 포인터 주소를 비교하게 되므로 비교 될 수 없음
	}

}

