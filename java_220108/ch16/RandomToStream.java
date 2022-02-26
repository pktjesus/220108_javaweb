package ch16;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RandomToStream {
	public static void main(String[] args) {
		Random rnd = new Random();
		System.out.println("������ : " + rnd.nextInt());		// -21������ ~ 21������
		
		System.out.println("int �� ���� ��Ʈ�� : ");
		// ints(3) 3��
		IntStream isr = new Random().ints(3);
		isr.forEach(s -> System.out.println(s));			// -21������ ~ 21�������� 3���� ���
		IntStream isr2 = new Random().ints(10,0,3);			// ints(����, ���۰�, ����������)
		isr2.forEach(s -> System.out.println(s));			
		
		System.out.println("long �� ���� ��Ʈ�� : ");
		// longs(3) 3��
		LongStream lsr = new Random().longs(3);
		lsr.forEach(s -> System.out.println(s));			
		
		System.out.println("double �� ���� ��Ʈ�� : ");
		// doubles(3) 3��
		DoubleStream dsr = new Random().doubles(3);
		dsr.forEach(s -> System.out.println(s));
	}
}
