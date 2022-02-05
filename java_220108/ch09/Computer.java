package ch09;

public class Computer {
	public static void main(String[] args) {
		GraphicCard gc1 = new Amd();		// 인터페이스의 다형성
		GraphicCard gc2 = new Nvidia();		// 인터페이스의 다형성
		
		System.out.println("AMD 메모리 : " + gc1.MEMORY);			// 2G
		System.out.println("Nvidia 메모리 : " + gc2.MEMORY);		// 2G	
		System.out.println("AMD 메모리 : " + Amd.MEMORY);			// 1G
		System.out.println("Nvidia 메모리 : " + Nvidia.MEMORY);	// 3G
		
		gc1 = new Amd();	// Amd로 자동형변환
		gc1.process();		// AMD 그래픽 처리
			
		gc1 = new Nvidia();	// Nvidia로 자동형변환
		gc1.process();		// Nvidia 그래픽 처리
		
		System.out.println("===================================================================");
		Game g = new Game();
//		g.display(new Amd());
//		g.display(new Nvidia());
		Amd amd1 = new Amd();
		g.display(amd1);
		Nvidia nvidia1 = new Nvidia();
		g.display(nvidia1);
	}
}
