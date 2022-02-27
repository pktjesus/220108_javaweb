package ch18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("java_220108/ch18/print.txt", true);
			PrintStream ps = new PrintStream(fos);
			ps.println("ȫ�浿");
			ps.println(1111);
			ps.println(true);
			ps.println(3.14);
			
			ps.flush();
			ps.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
