package ch12;

public class StringEx7 {
	public static void main(String[] args) {
		String str = "Hello My Name is Hong Gil Dong";
		System.out.println(str.charAt(6)); // 6�� �ε����� ����
		System.out.println(str.equals("Hello My Name is Hong Gil Dong")); // ���ڿ��� ��
		System.out.println(str.indexOf("Hong")); // "Hong" ���ڿ��� ��ġ
		System.out.println(str.indexOf('H')); // 'H'������ ��ġ
		System.out.println(str.substring(17)); // 17�� �ε������� ������ �߶�
		System.out.println(str.substring(6, 13)); // 6�� �ε������� 13��(12�� �ε���)���� ���ڿ�
		System.out.println(str.toLowerCase()); // �ҹ��ڷ� ����
		System.out.println(str.toUpperCase()); // �빮�ڷ� ����
		System.out.println(str.length()); // ���ڿ��� ����
		System.out.println(str.startsWith("Hello")); // "Hello"���� �����ϴ��� ����
		System.out.println(str.endsWith("Dong")); // "Dong"���� �������� ����
		System.out.println(str.replace("Hong", "Kim")); // "Hong"�� "Kim"���� ġȯ
		System.out.println(str.replaceAll("Name", "NickName")); // "Name"�� "NickName"���� ġȯ
		System.out.println(str.toString());
		
		str = "   �ȳ� �ϼ���,     �ݰ����ϴ�.      ";
		System.out.println(str.trim()); // �յ� ���� ����
		// ��� ������ �����ϴ� ���
		System.out.println(str.replace(" ", ""));
		
		str = String.valueOf(10); // �⺻�ڷ��� int�� ���ڿ��� ��ȯ
		str = String.valueOf(10.5); // �⺻�ڷ��� double�� ���ڿ��� ��ȯ
		
		str = "ȫ�浿,�̼���,������,���߱�";
		String[] arr = str.split(","); // ,�� �����ڷ� ������ �迭�� ����
		for (int i=0; i<arr.length; i++) {
			System.out.println(i+"�� �ε��� �� = "+arr[i]);
		}
	}
}
