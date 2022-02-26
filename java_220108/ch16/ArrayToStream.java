package ch16;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {
		// ���ڿ� �迭��ü����
		String[] arr = new String[] { "a", "b", "c", "d" };	// ����� ���ÿ� �ʱ�ȭ
		
		Stream<String> stream1 = Arrays.stream(arr);		// �迭��ü�� Stream��ü�� ��ȯ
		stream1.forEach(s -> System.out.print(s + " "));	// a b c d
		System.out.println();
		
		Stream<String> stream2 = Arrays.stream(arr, 1, 3);	// �ε����� �����ؼ� ��ȯ(1���� 3������)
		stream2.forEach(s -> System.out.print(s + " "));	// b c
	}

}
