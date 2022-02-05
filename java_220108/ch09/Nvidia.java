package ch09;

public class Nvidia implements GraphicCard  {
	static final String MEMORY = "3G";
	@Override
	public void process() {
		System.out.println("Nvidia 그래픽 처리");
	}
}
