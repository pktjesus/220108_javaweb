package ch09;

public class Computer {
	public static void main(String[] args) {
		GraphicCard gc1 = new Amd();		// �������̽��� ������
		GraphicCard gc2 = new Nvidia();		// �������̽��� ������
		
		System.out.println("AMD �޸� : " + gc1.MEMORY);			// 2G
		System.out.println("Nvidia �޸� : " + gc2.MEMORY);		// 2G	
		System.out.println("AMD �޸� : " + Amd.MEMORY);			// 1G
		System.out.println("Nvidia �޸� : " + Nvidia.MEMORY);	// 3G
		
		gc1 = new Amd();	// Amd�� �ڵ�����ȯ
		gc1.process();		// AMD �׷��� ó��
			
		gc1 = new Nvidia();	// Nvidia�� �ڵ�����ȯ
		gc1.process();		// Nvidia �׷��� ó��
		
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
