package sec4;

public class ShopServiceEx {

	public static void main(String[] args) {
		ShopService obj1=ShopService.geyInstance();
		ShopService obj2=ShopService.geyInstance();
		
		if(obj1 == obj2){
			System.out.println("같은 ShopService 객체 입니다.");
		} else {
			System.out.println("다른 ShopService 객체 입니다.");
		}

	}

}
