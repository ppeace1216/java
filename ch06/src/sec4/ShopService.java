package sec4;	//18번

public class ShopService {
	private static ShopService shop = new ShopService();
	private ShopService(){}
	static ShopService geyInstance(){
		return shop;
	}
}
