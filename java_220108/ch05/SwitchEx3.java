package ch05;

public class SwitchEx3 {

	public static void main(String[] args) {
		String grade = "A";
		
		switch(grade) {		// String은 JDK 1.7이상에서만 가능
			case "A":
				System.out.println("A학점입니다.");
				break;
			case "B":
				System.out.println("B학점입니다.");
				break;
		}

	}

}
