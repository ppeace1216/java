package sec2;

public class Account {
	String number;
	String owner;
	int balance;
	int money;
	public Account (int money){this.money=money;}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	//runDeposit(계좌입금작업) 은 입출금액을 입력받아 입금작업을 진행하여 해당 계좌에 잔액이 증가된다.
	//runWithdraw(계좌출금작업) 은 입출금액을 입력받아 출금작업을 진행하여 해당 계좌에 잔액이 감소된다.
		//※ 다만, 잔액은 음수(-)일 수 없음
	//runBalance(잔액조회) 은 해당 계좌에 잔액을 조회하여 반환한다.
	//printAccount(계좌정보보기) 는 해당 계좌의 계좌번호, 계좌주, 잔액 을 출력하도록 한다.
	public int runDeposit(){
		return money;
		//this.balance=this.balance+money;
	}
	//public int runWithdraw(){
		//if(money<balance){
			//return money;
		//}this.balance=this.balance
	//}
	public int runBalance(){
		return balance;
	}
	public void printAccount(){
		System.out.println("계좌번호 : "+number+", 계좌주 : "+owner+", 잔액 : "+balance);
	}
}
