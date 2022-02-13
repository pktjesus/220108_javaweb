package ch12;

public class WrapperEx {

	public static void main(String[] args) {
		// ���� 10�� Integer Ŭ���� ��ü�� ��ȯ (boxing)
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
//		Integer i1 = 10;
//		Integer i2 = 10;
		
		System.out.println("i1==i2 : " + (i1 == i2));
		System.out.println("i1.equals(i2) : " + (i1.equals(i2)));
		System.out.println("i1.toString() : " + i1.toString());
		
		//i1 ��ü�� 100 ������ ��ȯ (unboxing)
		System.out.println("i1==10 : " + (i1==10));
				
		System.out.println("������ �ִ밪 :" + Integer.MAX_VALUE);
		System.out.println("������ �ּҰ� :" + Integer.MIN_VALUE);
		System.out.println("byte�� �ִ밪 :" + Byte.MAX_VALUE);
		System.out.println("byte�� �ּҰ� :" + Byte.MIN_VALUE);
		System.out.println("������ ������ :" + Integer.SIZE);
		System.out.println("float�� ������ :" + Float.SIZE);
		System.out.println("double�� ������ :" + Double.SIZE);
	}

}
