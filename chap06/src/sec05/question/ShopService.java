package sec05.question;
// 285p 3��
public class ShopService {

	private static ShopService singleton = new ShopService();
	
	private ShopService() {
		
	}
	static ShopService getInstance() {
		return singleton;
	}
}
