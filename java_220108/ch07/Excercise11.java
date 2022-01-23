package ch07;

public class Excercise11 {

	public static void main(String[] args) {
		int[] arr = {9, 5, 24, 13, 3, 21};
		
		MathEx m = new MathEx();
		int max = m.max(arr);
		int min = m.min(arr);
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
}

// 메소드명 max와 min의 기능을 하는 코드 작성
// max : 매개변수로 입력받은 배열 값 중 최대값을 리턴, 리턴값은 정수, 매개변수는 정수타입 배열
// min : 매개변수로 입력받은 배열 값 중 최소값을 리턴, 리턴값은 정수, 매개변수는 정수타입 배열
class MathEx {
	int min(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < temp) {
				temp = arr[i];
			}
		}
		
		return temp;
	}
	int max(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > temp) {
				temp = arr[i];
			}
		}
		
		return temp;
	}
}
