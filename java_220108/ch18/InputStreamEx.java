package ch18;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {
	// �ý��� �ֿܼ��� �Է� �޴� ����
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
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
		System.out.println("���α׷� ��ħ");
	}
}
