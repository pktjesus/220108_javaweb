package ch12;

public class StringEquals {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		if(str1 == str2) {
			System.out.println("str1 객체와 str2 객체는 같음");
		} else {
			System.out.println("str1 객체와 str2 객체는 다름");
		}
		if(str1.equals(str2)) {
			System.out.println("str1 문자열과 str2 문자열은 같음");
		} else {
			System.out.println("str1문자열과  str2 문자열은 다름");
		}
		
		String str3 = "abc";
		String str4 = "abc";
		if(str3 == str4) {
			System.out.println("str3 객체와 str4 객체는 같음");
		} else {
			System.out.println("str3 객체와 str4 객체는 다름");
		}
		if(str3.equals(str4)) {
			System.out.println("str3 문자열과 str4 문자열은 같음");
		} else {
			System.out.println("str3문자열과  str4 문자열은 다름");
		}
		
	}
}
