package ch07;

public class ShopService {
	// 싱글톤 코드 작성
	private static ShopService instance = new ShopService();
	
	// 생성자에 private으로 설정해서 자기 내부에서만 생성자를 호출할 수 있도록 설정 
	private ShopService() {}
	
	// public static 메소드
	public static ShopService getInstance() {
		return instance;
	}
}
