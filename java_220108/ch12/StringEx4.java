package ch12;

public class StringEx4 {

	public static void main(String[] args) {
		String text = "Hello My Name is Hong Gil Dong";
		System.out.println("0�� �ε��� : " + text.charAt(0));		// H
		System.out.println("3�� �ε��� : " + text.charAt(3));		// l

		String text2 = "���� �̸��� ȫ�浿�Դϴ�";
		System.out.println("0�� �ε��� : " + text2.charAt(0));		// ��
		System.out.println("3�� �ε��� : " + text2.charAt(3));		// ��
		
		for (int i=0; i < text.length(); i++) {
			System.out.println(text.charAt(i));
		}
		for (int i=0; i < text2.length(); i++) {
			System.out.println(text2.charAt(i));
		}
	}

}
