package com.ict.day09;

import java.util.Scanner;

public class HW {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int count = 0;
		int win = 0;

		esc: while (true) {
			System.out.println("무엇을 내실건가요???");
			String play = scan.next().toLowerCase(); // Convert to lowercase for case-insensitive comparison
			int com = (int) (Math.random() * 3);

			switch (com) {
			case 0:
				System.out.println("컴퓨터는 가위를 냈습니다!");
				if (play.equals("가위")) {
					System.out.println("무승부");
				} else if (play.equals("바위")) {
					System.out.println("승리");
					win++;
				} else if (play.equals("보")) {
					System.out.println("패배");
				}
				break;

			case 1:
				System.out.println("컴퓨터는 바위를 냈습니다!");
				if (play.equals("가위")) {
					System.out.println("패배");
				} else if (play.equals("바위")) {
					System.out.println("무승부");
				} else if (play.equals("보")) {
					System.out.println("승리");
					win++;
				}
				break;

			case 2:
				System.out.println("컴퓨터는 보를 냈습니다!");
				if (play.equals("가위")) {
					System.out.println("승리");
					win++;
				} else if (play.equals("바위")) {
					System.out.println("패배");
				} else if (play.equals("보")) {
					System.out.println("무승부");
				}
				break;
			}
			count++;
			System.out.println("계속할까요?(1.yes, 2.no)>>");
			int re = scan.nextInt();
			if (re == 1)
				continue esc;
			else if (re == 2) {
				double rate = ((double) win / count) * 100;
				System.out.println("시행횟수 = " + count);

				System.out.println("승리횟수 = " + win);
				System.out.printf("당신의 승률은 = %.1f%%\n", rate);

				break esc;
			} else {
				System.out.println("제대로 입력해주세요!");
				break;
			}

		}

		scan.close();
	}
}