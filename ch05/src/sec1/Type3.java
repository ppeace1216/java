package sec1;

public class Type3 {

	public static void main(String[] args) {
		String name = "kim";	//참조형이지만 완벽한 참조형이 아님
		char[] irum = {'k', 'i', 'm'};
		String nick = "kim";
		String lans = new String("kim");
		System.out.println(name);
		System.out.println(irum);
		//System.out.println(name==irum); - 서로 비교대상이 될 수 없음
		System.out.println(name==nick);
		System.out.println(name!=nick);
		System.out.println();
		System.out.println(name==lans);	//서로 같지 않음 객체형과 문자형으로 서로 다르기 때문에
		System.out.println(name!=lans);
		System.out.println();
		System.out.println(name.equals(lans));	//값만 비교시에는 equals!!! 중요
		System.out.println(!name.equals(lans));
	}

}
