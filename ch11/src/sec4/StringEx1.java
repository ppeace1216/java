package sec4;

public class StringEx1 {

	public static void main(String[] args) {
		String str1 = new String("Park");
		System.out.println("str1 = "+str1);
		System.out.println("네번째 글자 : "+str1.charAt(3));
		System.out.println("문자열 비교 : "+str1.equals("park"));
		
		byte[] char1 = str1.getBytes();
		System.out.println("char1은 문자열을 한 글자씩 분리 : "); 		//주소가 나옴
		charPrint(char1);
		int a = (char) str1.indexOf("r");		//해당 문자를 찾기
		System.out.println("r은 몇 번째? "+a);		//중복이 될 경우 가장 먼저 찾은 문자의 위치
		String data = str1.substring(1,3);
		System.out.println("인덱스가 1부터 3전까지 : "+data);
		System.out.println("소문자로 : "+str1.toLowerCase());
		System.out.println("대문자로 : "+str1.toUpperCase());
		String name = "   My name is Pyeonghwa, Park   ";
		System.out.println("글자수 : "+name.length());
		System.out.println("공백 제거 전 : "+name);
		System.out.println("공백 제거 전 : "+name.trim()+", 문자 수 : "+name.trim().length());
		int b = 1004;
		System.out.println(String.valueOf(b)+1004);	//문자열로 형 변환
		System.out.println();
		System.out.println("2진수로 변환 : "+Integer.toBinaryString(b));
		System.out.println("8진수로 변환 : "+Integer.toOctalString(b));
		System.out.println("16진수로 변환 : "+Integer.toHexString(b));
		String c1 = "1111101100";
		String c2 = "1754";
		String c3 = "3ec";
		System.out.println("10진수로 변환");
		System.out.println(+Integer.valueOf(c1,2));
		System.out.println(+Integer.valueOf(c2,8));
		System.out.println(+Integer.valueOf(c3,16));
		String str2 = str1.replace("P", "L");
		System.out.println("name2 : "+str2);
		String str3 = str1.replace("Park", "Lee");
		System.out.println("name3 : "+str3);
	}
	static void charPrint(byte[] data){
		for(int i=0;i<data.length;i++){
			char a = (char) data[i];
			System.out.println(a);
		}
		System.out.println();
	}
}