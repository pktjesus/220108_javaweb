package ch12;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cnt = 0;
		while(true) {
			System.out.println("�̸��� �Է��ϼ���");
			String name = scan.nextLine();
			if("".equals(name)) break;
			System.out.println(name+"�� �ȳ��ϼ���.");
			cnt++;
		}
		System.out.println("�� �Էµ� ȸ���� :"+cnt);
	}

}
