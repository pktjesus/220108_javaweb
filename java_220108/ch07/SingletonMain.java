package ch07;

public class SingletonMain {

	public static void main(String[] args) {
		// Singleton s = new Singleton() // private �����ڿ��� ��ü ���� �Ұ���
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
	}

}
