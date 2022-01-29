package ch07;

public class SingletonMain {

	public static void main(String[] args) {
		// Singleton s = new Singleton() // private 생성자여서 객체 생성 불가능
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
	}

}
