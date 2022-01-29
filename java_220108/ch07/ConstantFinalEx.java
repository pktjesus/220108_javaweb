package ch07;

public class ConstantFinalEx {
	static final double CARD_COMMISSION = 1.5;
	
	public static void main(String[] args) {
		// CARD_COMMISSION = 1.8;	// 에러가 발생 -> final 변수이기 때문에...
		System.out.println("카드 수수료율 : " + CARD_COMMISSION);
		System.out.println("원주율 : " + Math.PI);
	}

}
