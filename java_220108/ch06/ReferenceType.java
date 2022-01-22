package ch06;

public class ReferenceType {

	public static void main(String[] args) {
		String name1 = "ȫ�浿";		// �⺻�ڷ���
		String name2 = "ȫ�浿";		// �⺻�ڷ���
		
		System.out.println(name1 == name2);		// �⺻�ڷ���ó�� �� -> true
		System.out.println(name1);		
		System.out.println(name2);		
		
		System.out.println();
		////////////////////////////////////////////////////////////////////////////////////
		String name1_ref = new String("ȫ�浿");
		String name2_ref = new String("ȫ�浿");
		
		System.out.println(name1_ref == name2_ref);		// ���� �����ڷ������� ��ġ �� -> false;
		System.out.println(name1_ref);
		System.out.println(name2_ref);
		
		System.out.println();
		////////////////////////////////////////////////////////////////////////////////////
		// String���� ���� �ٸ��ٸ� �񱳸� �� ������ equals�Լ��� ����ϵ��� �Ѵ�.
		System.out.println(name1.equals(name2));		// String�� ���� ������ �� -> true
		System.out.println(name1_ref.equals(name2_ref));// String�� ���� ������ �� -> true
		
//		name1 = null;		// ��ġ �� ���� �������� ����
//		name2 = null;		// ��ġ �� ���� �������� ����
//		System.out.println(name1.equals(name2));		// true�ƴϰ� false�ƴϰ� �����ڵ�(null �ڵ� ����(NullPointerException))
		
		name1_ref = "";		// ��ġ�� �����ϳ� ���� �������� ���� empty
		name2_ref = null;		// ��ġ �� ���� �������� ����
		System.out.println(name1_ref.equals(name2_ref));// true�ƴϰ� false�ƴϰ� �����ڵ�(null �ڵ� ����(NullPointerException))
		
		// char -> String
		// int -> Integer
		// long -> Long
	}
}
