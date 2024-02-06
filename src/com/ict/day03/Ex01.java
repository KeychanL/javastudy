package com.ict.day03;

public class Ex01 {
	public static void main(String[] args) {
		//증감연산자 : 1증가 또는1감소 하는 연산자
		//++(--)변수 : 현재변수가 가지고 있는값에 1을증가(감소)하고 나머지를 실행
		//변수 ++(--) : 현재 변수를가지고 실행을 하고 증감진행
		
		int su1 = 10;
		int su2 = 10;
		
		System.out.println(++su1 + 4);
		System.out.println(su2++ + 4);
		System.out.println(su1);
		System.out.println(su2);
	}

}
