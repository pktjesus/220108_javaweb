package ch09;

// �������̽� ���� ����
// [public] interface �������̽��� {
// [public static final] �ڷ��� ����� = ��;
// [public abstract] ����Ÿ�� �߻�޼ҵ��();
// [public] default ����Ÿ�� �޼����(�Ű����� ...) { ... } -> ���� ������ �޼ҵ� 
// [public] static ����Ÿ�� �޼����(�Ű����� ...) { ... }  -> ���� ������ �޼ҵ�

// �������̽��� Ư¡
// 1. ��ü���� �Ұ�, ���� Ŭ������ ��ü ���� == �߻�Ŭ������ ���� ���
// 2. ���� ���� ���� <-> �߻� Ŭ������ ���� �ٸ� Ư¡�� ���ϴ� ���(�߻� Ŭ������ ���Ϸ� ����Ͽ� ���� ����)\
// 3. �������̽����� ��� ����(�������̽������� ���� ����� ����)
// 4. �������̽� ���� �����ڴ� public(���������ڰ� ��� public)
// 5. �������̽��� ��� ��� ������ final���� ���
interface InterfaceEx {
	// ���
	public final int MIN_PRICE = 0;
	int MAX_PRICE = 100000;		// == 4,5�� Ư¡���� ���ؼ� public final int MAX_PRICE = 100000; ���� ����
	
	// �߻�޼ҵ�(abstractŰ���尡 ��� �߻�޼ҵ尡 ����)
	public double meanPrice();
	double totalPrice(); // == 4�� Ư¡���� ���ؼ� public double totalPrice(); ���� ���� 
	
	// default �޼ҵ�(������ ������ �޼ҵ�)
	default double getSalePrice(double price) {		
		return price - (price * 0.05);
	}
	
	// static �޼ҵ�(������ ������ �޼ҵ�)
	static void printPrice(double price) {
		System.out.println(price);
	}
}
