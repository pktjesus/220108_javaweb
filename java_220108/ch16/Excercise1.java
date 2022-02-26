package ch16;

import java.util.Arrays;
import java.util.List;

// ���� : List�� ����Ǿ� �ִ� String ��ҿ��� ��ҹ��ڿ� ������� "java"��� �ܾ ���Ե� ���ڿ��� ���͸��ؼ� ���
// Hint : String�� toLowerCase�� contains �޼ҵ带 ���
public class Excercise1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions"
		);

		// ������ : This is a java book
		//          Java8 supports lambda expressions
		list.stream()
		// �ڵ��ۼ�
		.filter(a -> a.toLowerCase().contains("java"))
		//.filter(a -> a.contains("java") && a.toLowerCase().equals("java"))
		.forEach(a -> System.out.println(a));
	}

}
