package ch18;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("java_220108/ch18/test.txt", true);
//			fos.write(68);		// ASCII 값 'D'
//			fos.write(10);		// ASCII 값 enter
//			fos.write(69);		// ASCII 값 'E'
//			fos.write(10);		// ASCII 값 enter
//			fos.write(70);		// ASCII 값 'F'
//			fos.write(10);		// ASCII 값 enter
			
			fos.write(10);		// ASCII 값 enter
			fos.write('a');
			fos.write('b');
			fos.write('c');
			fos.write('가');
			fos.write('나');
			
			fos.flush();
			fos.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
