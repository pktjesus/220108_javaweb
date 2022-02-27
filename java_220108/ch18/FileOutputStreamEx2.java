package ch18;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx2 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("java_220108/ch18/test2.txt", true);
			
			byte[] b = new byte[26];
			byte data = 65;		// 'A'
			for (int i=0; i<b.length; i++) {
				b[i] = data;
				data++;
			}
			fos.write(b);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
