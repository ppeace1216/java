package sec2;

public class LangObjectEx1 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		if(obj1==obj2 || obj1.equals(obj2)){		//문자열 String은 equals로 같은지 확인 가능
			System.out.println("동일");
		}
		String str1 = new String("Lee");
		String str2 = new String("Park");
		String str3;
		Integer num1;
		if(str1.equals(str2)){
			System.out.println("동일");
		}
		//if(str3==null){}	-쓸 수 없다
		Member mem = new Member();
		//여기에 나중에 데이터를 가져오는 과정이 있어야함
		if(mem==null){
			System.out.println("mem 값이 비어 있습니다.");
			//return false;
		}
	}
}
class Member{	//최상위 조상 -> Object
	String name;
	int age;
}