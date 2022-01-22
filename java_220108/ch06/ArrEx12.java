package ch06;

public class ArrEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrInt = new int[3][3];		// 3,3인 matrix
		int[][] arrInt2 = new int[3][];		// 3행을 가지고 몇 열을 가질지는 나중에 결정하는 코드
		
		arrInt2[0] = new int[]{ 1 };
		arrInt2[1] = new int[]{ 1, 2 };
		arrInt2[2] = new int[]{ 1, 2, 3 };
	
		for (int i=0; i<arrInt2.length; i++) {
			for (int j=0; j<arrInt2[i].length; j++) {
				System.out.print(arrInt2[i][j] + " ");
			}
			System.out.println();
		}
	}

}
