package sec4;

import java.util.StringTokenizer;

public class StringEx2 {

	public static void main(String[] args) {
		String names = "김태엽&한태헌,안효준,고유진,유광현-이해나";
		//문자열을 배열요소로 형변환   split(분해하다)
		String[] name = names.split("&|,|-");
		for(String irum : name){
			System.out.println((irum));
		}
		//Token : 구분자 또는 사용권
		String nick = "김도연/남송윤/조민재/이하영/김연정/김지훈";
		StringTokenizer irums = new StringTokenizer (nick, "/");
		
	}

}
