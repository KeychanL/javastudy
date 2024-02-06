package com.ict.day02;

public class Ex02 {
	public static void main(String[] args) {
		// 문자형 : char 숫자로 저장된다.
		//        그러나 우리는 숫자 대신에 홑따옴표 사용 ('a', 'A', '가',...)
		// '10'은 두 글자로 문자열이라고함
		// 선언 
		// char 변수이름 ;(선언)
		// 문자형 ch1 이라는 변수에 a를 저장하자
		char ch1 = 'a' ;
		System.out.println(ch1);
	
		ch1 = 'A';
		System.out.println(ch1);
		
		ch1 = 100-32;
		System.out.println(ch1);
		//변수에 저장하지 않았으므로 문자가 아니라 숫자 100이 나옴
		System.out.println(ch1+32);
		
		
	}
}
