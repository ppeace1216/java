package sec1;
//예외(Exception) 처리 : 프로그래밍에서 로직상 에러가 발생하면, 작동이 중지가 되버리기 때문에 이와 같은 경우르 예외가 발생한 것으로 간주하고,
//그 발생된 장애르 미리 예측하여 작동이 중지되지 않고, 계속 실행될 수 있도록 처리를 하는 것
//NullPointerException : null 처리에 대한 예외 발생
public class Exception1 {
	public static void main(String[] args){
		String data = null;
//DB접속시에는 필수!에러가 날 것 같을 때 쓴다
		try { 
			//실행해야 할 문장
			System.out.println(data.toString());
		} catch(NullPointerException e){
			//실행하다가 특정 예외가 발생 시 처리 문장
			System.out.println("널 값은 문자열로 변경하여 출력하지 못함");
		} catch(Exception e){	//마지막은 항상 이렇게
			//실행하다가 장애 발생 시 예외 클래스에 의해 처리해야 할 문장
			System.out.println("알 수 없는 장애로 인하여 계속되지 못함");
		} finally {		//예외가 발생했든 안했든 간에 무조건 실해해야 할 문장
			//장애(예외)의 발생유무와 관계없이 반드시 실행할 문장
			System.out.println("종료");
		}
	}
}