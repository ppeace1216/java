package sec6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDataFormat {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");	//E요일 -> 한글 요일 표시 MM/mm은 꼭 소문자 대문자 구별!
        System.out.println(sdf.format(now));
	}

}
