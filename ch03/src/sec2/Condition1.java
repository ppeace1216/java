package sec2;

import java.util.Scanner;

public class Condition1 { //condition 조건
	public static void main(String[] args) {
		System.out.println("점수 입력: ");
		Scanner sc = new Scanner(System.in);	//
		int num = sc.nextInt();  //sc에 저장
		if(num>=80) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		//else없이 진행하는 경우
		String str = "탈락";
		if(num>=80) str="합격";
		System.out.println(str);
		
		//상황연산자
		String  str2 = (num>=80)? "합격" : "탈락";
		System.out.println(str2);
		
		sc.close();
	}

}
