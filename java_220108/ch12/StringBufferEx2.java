package ch12;

public class StringBufferEx2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		// �޼��� ü�̴����� ���� Ÿ���� �Ű��������� StringBuffer ��ü�� ���ڿ����� �߰�
		sb.append("abc").append(123).append('A').append(false);
		System.out.println(sb);
		
		// 2~3�� �ε����� ����
		sb.delete(2, 4);
		System.out.println(sb);
		
		// 4�� �ε����� ����
		sb.deleteCharAt(4);
		System.out.println(sb);
		
		// 5�� �ε����� == �߰�
		sb.insert(5,"==");
		System.out.println(sb);
		
		// 6�� �ε����� 1.23 �߰�(���ڿ��� ��ȯ)
		sb.insert(6,1.23);
		System. out.println(sb);
	}

}
