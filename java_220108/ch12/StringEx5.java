package ch12;

public class StringEx5 {
	static String s1;			// ����ʵ��� ��� ������ �ƹ��� ���� �������� �ʴ� ��� null�� �ڵ� ����(Ŭ������ ���ؼ�)
	static String s2 = "";
	static String s3 = null;	// s1�� ���� �ǹ�
	static String s4 = "null";	// ���ڿ� null
	
	public static void main(String[] args) {
//		String s1 = null;
//		String s2 = "";
		
		System.out.println(s1);		// null(���ڿ� null���� �ٸ�)
		System.out.println(s2);
		
		//System.out.println(s1.length());	// NullPointerException�� ���� ����
		System.out.println(s2.length());	// 0
		//System.out.println(s3.length());	// NullPointerException�� ���� ����
		System.out.println(s4.length());	// 4
	}
}
