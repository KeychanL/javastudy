package com.ict.day07;

public class Ex07 {
	public static void main(String[] args) {
		// 순위 구하기
		// 1. 모든 사람의 순위를 1등으로 초기값 부여
		// 2. 모든 사람과 비교해야 한다. (자기자신 제외)
		// 3. 나(i)라고 했을때 남(j)이 나보다 크면 내 순위를 증가시킨다
		int[] s1 = { 90, 80, 70, 95, 65, 85, 75 };
		int[] rank = { 1, 1, 1, 1, 1, 1, 1 };
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s1.length; j++) {
				if (s1[i] < s1[j]) {
					rank[i]++;
				}

			}

		}
		for (int i = 0; i < s1.length; i++) {
			System.out.print(rank[i] + " ");
		}

	}
}
