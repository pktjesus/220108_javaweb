package ch12;

public class PropertyEx {
	public static void main(String[] args) {
		for (String var : System.getenv().keySet()) {		// OS ȯ�溯�� ����Ʈ �о��
			System.out.println(var + " = " + System.getenv(var));
		}
	}

}
