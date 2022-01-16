package ch05;

import java.util.Scanner;

public class Excercise8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int balance = 0;		// 계좌 잔액
		boolean run = true;
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			
			int menuNumber = scanner.nextInt();
			
			switch(menuNumber) {
				case 1:
					System.out.print("예금액> ");
					balance += scanner.nextInt();
					break;
				case 2:
					System.out.print("출금액> ");
					balance -= scanner.nextInt();
					break;
				case 3:
					System.out.print("잔고> ");
					System.out.println(balance);
					break;
				case 4:
					run = false;
					break;
			}
			
			System.out.println();
		}
		
		System.out.println("프로그램 종료");
	}

}
