package sec1;
public class Exception2 {
	public static void main(String[] args) {
		int[] arr = new int [3];
		int i=0;
		while(i<3){
			try{
				arr[i] = i*10-5;
				i++;
				System.out.println(arr[i]);
			} catch(ArrayIndexOutOfBoundsException e){
				System.out.println("배정된 배열의 요소 수 보다 더 많은 데이터를 요구하였음");
				e.printStackTrace();	//원인까지 알려줌 /최근에 발생한 인터럽트나 에러를 찾아서 가져와라/ 인터럽트나 예외에 발생된 정보가 스택에 저장 LIFO
				break;
			} catch(Exception e){	
				System.out.println("알 수 없는 장애로 인하여 계속되지 못함");
			} finally {	
				System.out.println("종료");
			}
		}
	}
}
