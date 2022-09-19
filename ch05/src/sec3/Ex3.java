package sec3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNUM = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1){
				System.out.print("학생수 > ");
				studentNUM = sc.nextInt();
			}else if(selectNo == 2){
				int i = 0;
				System.out.print("scores["+i+"] >");
				scores[i] = sc.nextInt();
			}else if(selectNo == 3){
				for(int i=0;i<studentNUM;i++){
					System.out.print("scores["+i+"] : "+scores[i]);
				}
			}else if(selectNo == 4){
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				for(int i=0;i<studentNUM;i++){
					if(max<scores[i]) max=scores[i];
					sum+=scores[i];
				}
				avg = (double)sum/studentNUM;
				System.out.print("최고 점수 : "+max);
				System.out.print("평균 점수 : "+avg);
			}else if(selectNo == 5){
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
