package ch12;

public class SystemEx {
	public static void main(String[] args) {
		System.out.println(System.getProperty("java.version"));	// �ڹ� ����
		System.out.println(System.getProperty("java.vm.vendor"));	// �ڹ� vm ������
		System.out.println(System.getProperty("java.home"));	// JDK���
		System.out.println(System.getProperty("os.name"));	// OS �̸�
	}

}
