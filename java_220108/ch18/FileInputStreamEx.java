package ch18;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String args[]) {
		try {
			FileInputStream fis = new FileInputStream("java_220108/ch18/text1.txt");
			
			int data = 0;
			// 1번째 방법
			while((data=fis.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {
			
		}

	}
}
