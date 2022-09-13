package sec2;

import java.util.Scanner;

public class Condition4 {
	public static void main(String[] args) {
		//점수를 입력받아 등급을 구하되, 등급이 90점 이상이면 "A", 80점 이상이면 "B", 70점 이상이면  "C", 60점 이상이면 "D", 그밖의 점수는 "F"
		//상품은 등급이 A이면 "100년 묵은 산삼", B이면 "한우갈비세트", C이면 "백화점 상품권", D이면 "츄파춥스", F는 "한입만"
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 : ");
		int jum = 84;
		String grade = sc.next();
		if(jum>=90){
			grade="A";
		} else if(jum>=80){
			grade="B";
		} else if(jum>=70){
			grade="C";
		} else if(jum>=60){
			grade="D";
		} else {
			grade="F";
		}
		String goods = "";
		switch(grade) {
			case "A":
				goods="백년 묵은 산삼";
				break;
			case "B":
				goods="한우갈비세트";
				break;
			case "C":
				goods="백화점상품권";
				break;
			case "D":
				goods="츄파츕스";
				break;
			default:
				goods="한입만";
		}
		System.out.println("당신의 점수는"+jum+"점이며, 등급은 "+grade+"이고, 상품은 "+goods+"입니다.");
		sc.close();
			
		
		}

}
