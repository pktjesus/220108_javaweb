package ch06;

public class ArrEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] arrInt = new int[3][3][3];
		
		int value = 0;
		// 값 대입1
		for (int i=0; i<=2; i++) {
			for (int j=0; j<=2; j++) {
				for (int k=0; k<=2; k++) {
					arrInt[i][j][k] = value++; 
				}
			}
		}
		// 값 출력1
		for (int i=0; i<=2; i++) {
			for (int j=0; j<=2; j++) {
				for (int k=0; k<=2; k++) {
					System.out.print(arrInt[i][j][k]+"\t"); 
				}
				System.out.println();
			}
		}
	}

}
