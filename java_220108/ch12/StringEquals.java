package ch12;

public class StringEquals {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		if(str1 == str2) {
			System.out.println("str1 ��ü�� str2 ��ü�� ����");
		} else {
			System.out.println("str1 ��ü�� str2 ��ü�� �ٸ�");
		}
		if(str1.equals(str2)) {
			System.out.println("str1 ���ڿ��� str2 ���ڿ��� ����");
		} else {
			System.out.println("str1���ڿ���  str2 ���ڿ��� �ٸ�");
		}
		
		String str3 = "abc";
		String str4 = "abc";
		if(str3 == str4) {
			System.out.println("str3 ��ü�� str4 ��ü�� ����");
		} else {
			System.out.println("str3 ��ü�� str4 ��ü�� �ٸ�");
		}
		if(str3.equals(str4)) {
			System.out.println("str3 ���ڿ��� str4 ���ڿ��� ����");
		} else {
			System.out.println("str3���ڿ���  str4 ���ڿ��� �ٸ�");
		}
		
	}
}
