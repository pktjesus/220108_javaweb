package ch05;

import java.util.Scanner;

public class Excercise8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int balance = 0;		// ���� �ܾ�
		boolean run = true;
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("---------------------------------");
			System.out.print("����> ");
			
			int menuNumber = scanner.nextInt();
			
			switch(menuNumber) {
				case 1:
					System.out.print("���ݾ�> ");
					balance += scanner.nextInt();
					break;
				case 2:
					System.out.print("��ݾ�> ");
					balance -= scanner.nextInt();
					break;
				case 3:
					System.out.print("�ܰ�> ");
					System.out.println(balance);
					break;
				case 4:
					run = false;
					break;
			}
			
			System.out.println();
		}
		
		System.out.println("���α׷� ����");
	}

}
