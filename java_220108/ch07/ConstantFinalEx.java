package ch07;

public class ConstantFinalEx {
	static final double CARD_COMMISSION = 1.5;
	
	public static void main(String[] args) {
		// CARD_COMMISSION = 1.8;	// ������ �߻� -> final �����̱� ������...
		System.out.println("ī�� �������� : " + CARD_COMMISSION);
		System.out.println("������ : " + Math.PI);
	}

}
