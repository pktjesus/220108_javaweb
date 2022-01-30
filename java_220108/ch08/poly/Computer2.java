package ch08.poly;

public class Computer2 {

	public static void main(String[] args) {
		Game g = new Game();
		
		GraphicCard gc = new GraphicCard();
		g.display(gc);		// 그래픽 처리중
		
		Amd gc2 = new Amd();
		g.display(gc2);		// AMD 그래픽 처리중
		
		Nvidia gc3 = new Nvidia();
		g.display(gc3);		// Nvidia 그래픽 처리중
		
		System.out.println("hashCode : " + g.hashCode());
		System.out.println("toString : " + g.toString());
	}
}
