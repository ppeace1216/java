package sec2;

import java.util.Scanner;

public class ProductEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product p1 = new Product();
		System.out.print("제품코드 : ");
		p1.setPid(sc.next());
		System.out.print("제품명 : ");
		p1.setPname(sc.next());
		System.out.print("제품수량 : ");
		p1.setAmount(sc.nextInt());
		System.out.print("제품가격 : ");
		p1.setPrice(sc.nextInt());
		System.out.print("이미지 : ");
		p1.setImg(sc.next());
		sc.close();
		p1.printProduct();
	}
}
