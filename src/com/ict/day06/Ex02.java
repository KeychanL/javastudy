package com.ict.day06;

public class Ex02 {
	public static void main(String[] args) {
		// break와 continue
		// break : 현재위치 블록을 탈출할때사용하는 예약어
		// (for, while, switch)을 탈출할때 사용하는 예약어
		// continue : continue 문 이하 수행문을 포기하고 다음회차로진행
		// 밑으로 안가고 바로 증감식으로 가버리는 놈
		// for문인 경우는 증감식으로 이동, while문인 경우는조건식으로 이동
		// 보통 if문과 함께 사용한다.

		// 1-10까지 출력
		for (int i = 1; i < 11; i++) {
			// 이스케이프문자(제어문자)
			// \n=>줄바꿈, \t=>탭 \'=>', \"=>"
			System.out.print(i + " ");
		}
		System.out.println();

		// 1-10까지 출력 6에서 break 사용
		for (int i = 1; i < 11; i++) {
			if (i == 6)
				break;
			System.out.print(i + " ");
		}
		System.out.println();

		// 탈출을 시행하고 해버린
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if (i == 6)
				break;
		}
		System.out.println();

		// 1-10까지 출력 6에서 continue 사용
		for (int i = 1; i < 11; i++) {
			if (i == 6)
				continue;
			System.out.print(i + " ");
		}
		System.out.println();
		// 의미없음
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if (i == 6)
				continue;
		}
		System.out.println();

		// 1-10까지 짝수만 출력 continue 사용
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 1)
				continue;
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
