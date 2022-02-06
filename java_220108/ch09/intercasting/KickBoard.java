package ch09.intercasting;

public class KickBoard implements Vehicle{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("두개의 바퀴가 달린다");
	}
	
	public void siren() {
		System.out.println("종소리 울림");
	}
}
