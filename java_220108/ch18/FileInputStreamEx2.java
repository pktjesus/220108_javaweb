package ch18;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("java_220108/ch18/text1.txt");
			
			int data = 0;
			byte[] buf = new byte[fis.available()];
			// 2锅掳 规过
//			while((data=fis.read(buf)) != -1) {
//				System.out.print(new String(buf, 0, data));
//			}
			// 3锅掳 规过
			while((data=fis.read(buf, 0, buf.length)) != -1) {
				System.out.print(new String(buf, 0, data));
			}
		} catch (IOException e) {
			
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}
