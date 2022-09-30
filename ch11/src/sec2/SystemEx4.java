package sec2;

import java.util.Properties;
import java.util.Set;

public class SystemEx4 {

	public static void main(String[] args) {
		System.out.println(System.getProperty("os.name"));	//운영체제
		System.out.println(System.getProperty("user.name"));	//사용자 명
		System.out.println(System.getProperty("user.home"));	//사용자 디렉토리 위치
		System.out.println(System.getProperty("java.version"));	//자바버전
		System.out.println(System.getProperty("java.home"));	//자바 디렉토리 위치
		
		Properties props = System.getProperties();	//해당 항목(키)를 뽑아 저장
		Set keys = props.keySet();	//항목들을 집합으로 별도로 저장
		for(Object objKey : keys){
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("["+key+"]:"+value);
		}
		System.out.println("환경변수 JAVA_HOME : "+System.getenv("JAVA_HOME"));
	}

}
