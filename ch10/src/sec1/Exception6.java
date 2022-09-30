package sec1;
//자원 접근에 대한 내용은 무조건 예외처리
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Exception6 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream ois = null;
		try {
			fis = new FileInputStream("file.txt");
			ois = new FileOutputStream("file.txt");
		} catch (FileNotFoundException e){
			System.out.println("해당 파일이 존재하지 않아 파일을 열 수 없음");
			e.printStackTrace();
		}
	}

}
