package ch16;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RandomToStream {
	public static void main(String[] args) {
		Random rnd = new Random();
		System.out.println("난수값 : " + rnd.nextInt());		// -21억정도 ~ 21억정도
		
		System.out.println("int 형 난수 스트림 : ");
		// ints(3) 3개
		IntStream isr = new Random().ints(3);
		isr.forEach(s -> System.out.println(s));			// -21억정도 ~ 21억정도가 3개가 출력
		IntStream isr2 = new Random().ints(10,0,3);			// ints(갯수, 시작값, 끝값전까지)
		isr2.forEach(s -> System.out.println(s));			
		
		System.out.println("long 형 난수 스트림 : ");
		// longs(3) 3개
		LongStream lsr = new Random().longs(3);
		lsr.forEach(s -> System.out.println(s));			
		
		System.out.println("double 형 난수 스트림 : ");
		// doubles(3) 3개
		DoubleStream dsr = new Random().doubles(3);
		dsr.forEach(s -> System.out.println(s));
	}
}
