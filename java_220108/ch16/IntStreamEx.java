package ch16;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamEx {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};

		System.out.println("Arrays.stream() IntStream �����ϱ�");
		IntStream intstream1 = Arrays.stream(arr);
		intstream1.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
//		OptionalInt opInt = intstream1.max();		// Optional -> NullPointerException�� ���̱� ���� ���
//		System.out.println(opInt.isPresent());		// true
//		System.out.println("arr �迭�� ���� ū ���� " + opInt.getAsInt());		// 5
		
		System.out.println("Arrays.of() IntStream �����ϱ�");
		IntStream intstream2 = IntStream.of(arr);
		intstream2.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		System.out.println("Arrays.range() IntStream �����ϱ�");
		IntStream intstream3 = IntStream.range(1, 6);
		intstream3.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		System.out.println("Arrays.rangeClosed() IntStream �����ϱ�");
		IntStream intstream4 = IntStream.rangeClosed(1, 5);
		intstream4.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
	}
}
