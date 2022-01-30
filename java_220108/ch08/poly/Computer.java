package ch08.poly;

public class Computer {
	public static void main(String[] args) {
		GraphicCard gc = new GraphicCard();
		gc.process();// 그래픽 처리중
		
		gc = new Amd();
		gc.process();// AMD 그래픽 처리중
		
		gc = new Nvidia();
		gc.process();// Nvidia 그래픽 처리중

	}

}
