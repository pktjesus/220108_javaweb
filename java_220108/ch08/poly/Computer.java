package ch08.poly;

public class Computer {
	public static void main(String[] args) {
		GraphicCard gc = new GraphicCard();
		gc.process();// �׷��� ó����
		
		gc = new Amd();
		gc.process();// AMD �׷��� ó����
		
		gc = new Nvidia();
		gc.process();// Nvidia �׷��� ó����

	}

}
