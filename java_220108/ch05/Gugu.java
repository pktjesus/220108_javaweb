package ch05;

public class Gugu {

	public static void main(String[] args) {
		int lineNumber = 0;
		
		for (int i = 2; i < 10; i++) {
			System.out.println("[" + i + "]´Ü");
			for (int j = 1; j < 10; j++) {
				System.out.println((++lineNumber) + " : i = " + i + ", j = " + j);
			}
		}

	}

}
