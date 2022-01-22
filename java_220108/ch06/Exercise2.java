package ch06;

public class Exercise2 {
	public static void main(String[] args) {
		int[][] arr = {
				{1},
				{1,2},
				{1,2,3},
				{1,2,3,4},
				{1,2,3,4,5}
		};
		System.out.println("arr의 길이 : "+arr.length);		 // 4 : 1차원 행의 개수
		System.out.println("arr[2]의 길이 : "+arr[2].length); // 3 : 3행의 열의 개수
	}
}
