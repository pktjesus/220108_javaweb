package ch12;

public class WrapperEx {

	public static void main(String[] args) {
		// 정수 10이 Integer 클래스 객체로 변환 (boxing)
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
//		Integer i1 = 10;
//		Integer i2 = 10;
		
		System.out.println("i1==i2 : " + (i1 == i2));
		System.out.println("i1.equals(i2) : " + (i1.equals(i2)));
		System.out.println("i1.toString() : " + i1.toString());
		
		//i1 객체가 100 정수로 변환 (unboxing)
		System.out.println("i1==10 : " + (i1==10));
				
		System.out.println("정수의 최대값 :" + Integer.MAX_VALUE);
		System.out.println("정수의 최소값 :" + Integer.MIN_VALUE);
		System.out.println("byte의 최대값 :" + Byte.MAX_VALUE);
		System.out.println("byte의 최소값 :" + Byte.MIN_VALUE);
		System.out.println("정수의 사이즈 :" + Integer.SIZE);
		System.out.println("float의 사이즈 :" + Float.SIZE);
		System.out.println("double의 사이즈 :" + Double.SIZE);
	}

}
