package ch12;

public class PropertyEx {
	public static void main(String[] args) {
		for (String var : System.getenv().keySet()) {		// OS 환경변수 리스트 읽어옴
			System.out.println(var + " = " + System.getenv(var));
		}
	}

}
