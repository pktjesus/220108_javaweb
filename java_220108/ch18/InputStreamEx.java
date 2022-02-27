package ch18;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {
	// 시스템 콘솔에서 입력 받는 예제
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			InputStream in = System.in;
			int data = 0;
			while((data = in.read()) != -1) {		// -1 -> Enter
				char inputChar = (char)data;
				
				if(inputChar == 'q')
					break;
				else
					System.out.print((char)data);
			}
		} catch (IOException e) {
			
		}
		System.out.println("프로그램 마침");
	}
}
