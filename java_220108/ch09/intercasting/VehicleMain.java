package ch09.intercasting;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle v1 = new Bus();
		Vehicle v2 = new KickBoard();
		
		v1.run();
		Bus b1 = (Bus)v1;		// ��������ȯ
		b1.checkFare();
	}

}
