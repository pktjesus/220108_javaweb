package ch12;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abcd");
		System.out.println("문자열 연결전 sb1 = "+System.identityHashCode(sb1));
		sb1.append("efg");
		System.out.println("문자열 연결후 sb1 = "+System.identityHashCode(sb1));
		
		System.out.println(sb1.toString().equals("abcdefg"));
		System.out.println(sb1.deleteCharAt(sb1.length() - 1));
	}

}
