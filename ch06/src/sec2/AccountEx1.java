package sec2;

public class AccountEx1 {
	public static void main(String[] args) {
		Account1 acc1 = new Account1();
		//acc1.setBalance(0);
		acc1.setAccount("123-123-123456");
		acc1.setOwner("박평화");
		acc1.runDeposit(150000);
		acc1.runWithdraw(90000);
		System.out.println("잔액조회 : "+acc1.runBlance());
		acc1.runDeposit(200000);
		acc1.printAccount();
	}
}