package ch07;

public class ShopService {
	// �̱��� �ڵ� �ۼ�
	private static ShopService instance = new ShopService();
	
	// �����ڿ� private���� �����ؼ� �ڱ� ���ο����� �����ڸ� ȣ���� �� �ֵ��� ���� 
	private ShopService() {}
	
	// public static �޼ҵ�
	public static ShopService getInstance() {
		return instance;
	}
}
