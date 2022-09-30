package sec2;

public class SystemEx3 {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		int sum=0;
		for(int i=1;i<1000000000;i++){
			sum+=i;
		}
		long time2 = System.nanoTime();
		System.out.println("합산결과 : "+sum);
		System.out.println("걸린시간 : "+(time2-time1));
		//초>밀리초(1/1000)>마이크로초(1/1000000)>나노초(1/1000000000)
	}

}
