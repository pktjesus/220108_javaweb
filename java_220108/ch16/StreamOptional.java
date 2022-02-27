package ch16;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StreamOptional {

	public static void main(String[] args) {
		int[] arr = new int[100];
		for(int i=0; i < 100; i++) {
			arr[i] = i+1;
		}
		// ���ϰ� long
		long count = Arrays.stream(arr).count();    // 100
		System.out.println("��ҵ��� ���� : " + count);
		
		// ���ϰ� int
		int sum = Arrays.stream(arr).sum();
		System.out.println("��ҵ��� �� : " + sum);	// 5050
		
		// OptionalŬ���� ���
		OptionalInt first = Arrays.stream(arr).findFirst();
		System.out.println("��ҵ� �� ù��° �� : " + first.getAsInt());		// 1
		
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println("��ҵ� �� �ִ� �� : " + max.getAsInt());		// 100
		
		OptionalInt min = Arrays.stream(arr).min();
		System.out.println("��ҵ� �� �ּ� �� : " + min.getAsInt());		// 1
		
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println("��ҵ��� ��� : " + avg.getAsDouble());			// 50.5
	}

}
