package ch16;

import java.util.stream.IntStream;

public class StrToStream {

	public static void main(String[] args) {
		String str = "�ڹ� ������ ������";
		
		// Stream ��ü ����
		IntStream isr = str.chars();
		
		// System.out.print()
		isr.forEach(s -> System.out.print((char)s + " "));

	}

}
