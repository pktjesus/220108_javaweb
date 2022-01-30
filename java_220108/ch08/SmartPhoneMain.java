package ch08;

public class SmartPhoneMain {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.name = "전화기";
		p.company = "현대";
		p.color = "화이트";
		
		System.out.println("Phone 출력");
		System.out.println(p.name);
		System.out.println(p.company);
		System.out.println(p.color);
		p.call();
		p.receive();
		
		System.out.println();
		SmartPhone sp = new SmartPhone();
		sp.name = "갤럭시";
		sp.company = "삼성";
		sp.color = "블랙";
		
		System.out.println("SmartPhone 출력");
		System.out.println(sp.name);		// Phone클래스에 있는 name
		System.out.println(sp.company);		// Phone클래스에 있는 company
		System.out.println(sp.color);		// Phone클래스에 있는 color
		sp.call();			// Phone클래스에 있는 call메소드
		sp.receive();		// Phone클래스에 있는 receive메소드
		sp.installApp();	// SmartPhone클래스에 있는 installApp메소드

	}

}
