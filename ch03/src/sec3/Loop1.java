package sec3;

public class Loop1 {
	public static void main(String[] args) {
		int[] data = {90,80,70,65,78,99,45,80,95,100}; //data[0]~data[9]
		int tot=0;
/*
		for(반복변수 선언 및 초기화;조건식;증감식){
			반복할 실행문;
		}
		반복변수가 부여된 초기값으로 시작하여 증감식에 따라 증감이 되다가 조건식이 만족하지 않으면, 더이상 실행하지 않는다.
		
 */
		for(int a=0;a<10;a++){
			tot=tot+data[a];
		}
		System.out.println("총 합계는 "+tot+"입니다.");
		
		for(int a=0;a<data.length;a++){			//length 배열의 개수
			System.out.println(a+"번째 사람의 점수 : "+data[a]);
			tot=tot+data[a];		//누산
		}
		double avg = (float) tot / data.length;
		System.out.println("전체 총점 : "+tot+", 전체 평균 : "+avg);
	}

}
