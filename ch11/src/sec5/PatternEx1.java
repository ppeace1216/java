package sec5;

import java.util.regex.Pattern;

//Pattern(패턴) : regExp = 정규표현식 - 특정 형식에 만즌 데이터인지 검증
public class PatternEx1 {
	public static void main(String[] args) {
		String regExp = "(02|031|010)-\\d{3,4}-\\d{4}";		//d는 10진수
//		String data1 = "(02)-1234-1234";
//		String data2 = "(042)-1234-1234";
//		String data3 = "(010)-1234-1234";
//		String data4 = "(031)-123-1234"; 		괄호는 표현 형식에 포함되지 않는다.
		String data1 = "02-1234-1234";
		String data2 = "042-1234-1234";
		String data3 = "010-1234-1234";
		String data4 = "031-123-1234"; 
		boolean p1 = Pattern.matches(regExp, data1);
		System.out.println(p1);
		System.out.println(Pattern.matches(regExp, data2));
		System.out.println(Pattern.matches(regExp, data3));
		System.out.println(Pattern.matches(regExp, data4));
		
		regExp = "\\w+@\\w+(\\.\\w+)?";
		data1 = "peace1216@naver.com";
		data2 = "kbs@googlecom";
		data3 = "joeun.co.kr";
		System.out.println(Pattern.matches(regExp, data1));
		System.out.println(Pattern.matches(regExp, data2));
		System.out.println(Pattern.matches(regExp, data3));
				
	}
}