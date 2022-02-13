package ch12;

public class StringEx5 {
	static String s1;			// 멤버필드일 경우 변수에 아무런 값을 대입하지 않는 경우 null로 자동 세팅(클래스에 한해서)
	static String s2 = "";
	static String s3 = null;	// s1과 같은 의미
	static String s4 = "null";	// 문자열 null
	
	public static void main(String[] args) {
//		String s1 = null;
//		String s2 = "";
		
		System.out.println(s1);		// null(문자열 null과는 다름)
		System.out.println(s2);
		
		//System.out.println(s1.length());	// NullPointerException이 나서 에러
		System.out.println(s2.length());	// 0
		//System.out.println(s3.length());	// NullPointerException이 나서 에러
		System.out.println(s4.length());	// 4
	}
}
