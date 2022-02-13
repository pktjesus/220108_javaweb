package ch12;

public class StringEx4 {

	public static void main(String[] args) {
		String text = "Hello My Name is Hong Gil Dong";
		System.out.println("0번 인덱스 : " + text.charAt(0));		// H
		System.out.println("3번 인덱스 : " + text.charAt(3));		// l

		String text2 = "나의 이름은 홍길동입니다";
		System.out.println("0번 인덱스 : " + text2.charAt(0));		// 나
		System.out.println("3번 인덱스 : " + text2.charAt(3));		// 이
		
		for (int i=0; i < text.length(); i++) {
			System.out.println(text.charAt(i));
		}
		for (int i=0; i < text2.length(); i++) {
			System.out.println(text2.charAt(i));
		}
	}

}
