package com.ict.homework;

public class exam {
	public static void main(String[] args) {
		int k1 = 13;
		String result = "";
		if (k1 % 2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		System.out.println("k1는 " + result + " 입니다.");
	}

}
