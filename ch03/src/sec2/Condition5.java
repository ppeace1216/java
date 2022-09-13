package sec2;

import java.util.Scanner;

public class Condition5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean sw = true;
		int money=0, balance=0; //보통 balance가 잔액
		
		while(sw){
			System.out.println("작업할 번호 (1-입금, 2-출금, 3-잔액조회, 그 외-종료)[1-9]");
			int job = sc.nextInt();
			switch(job){
				case 1:
					System.out.println("입금액 : ");
					money = sc.nextInt();
					balance=balance+money;
					break;
				case 2:
					System.out.println("출금액 : ");
					money = sc.nextInt();
					if(money>balance) System.out.println("잔액 부족");
					balance=balance-money;
					break;
				case 3:
					System.out.println("잔액 : "+balance);
					break;
				default:
					System.out.println("모든 작업을 종료합니다.");
					sw=false;
			}
		}
		sc.close();
	}

}
