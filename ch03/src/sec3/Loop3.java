package sec3;

public class Loop3 {

	public static void main(String[] args) {
/*	do-while문
		반복변수=초기값;	①
		do {
			실행문장;	②
			증감식;	③
		} while(조건식);	④
		1-2-3-4 실행되다가 조건이 만족하는 동안 2-3-4 반복 수행함
		그러므로 실행부터 하고, 조건을 나중에 비교하므로 최소 1번 이상 실행하게 됨
 */
		int a=10, tot=0;
		do {
			tot=tot+a;
			a++;
		} while(a<10);
		System.out.println("a = "+a+",tot = "+tot);
	}

}
