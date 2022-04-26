package sec05.question;
// 285p 3¹ø
public class ShopService {

	private static ShopService singleton = new ShopService();
	
	private ShopService() {
		
	}
	static ShopService getInstance() {
		return singleton;
	}
}
