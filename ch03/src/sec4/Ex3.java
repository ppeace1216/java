package sec4;

public class Ex3 {

	public static void main(String[] args) {
		int tot=0;
		for(int i=3;i<=100;i+=3){
			tot+=i;
		}
		System.out.println("3의 배수의 합 : "+tot);
		
		tot=0;
		int i=3;
		while(i<100){
			tot+=i;
			i+=3;
		}
		System.out.println("3의 배수의 합2 : "+tot);
		
		tot=0;
		for(int a=0;a<100;a++){
			if(a%3==0) tot+=a;
		}
		System.out.println("3의 배수의 합3 : "+tot);
		
		tot=0;
		for(int a=0;a<=100;a++){
			
		}
	}

}
