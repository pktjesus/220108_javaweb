package ch09;

public class Amd implements GraphicCard {
	static final String MEMORY = "1G"; 
	@Override
	public void process() {
		System.out.println("AMD 그래픽 처리");
	}
}
