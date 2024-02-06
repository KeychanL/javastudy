package com.ict.day02;

public class Ex07 {
    public static void main(String[] args) {
	  //String : 문자열을 처리하기 위한 클래스
    	// 기본자료형은 아니다 참조자료형이다(클래스를 자료형으로 사용)
    	// 기본 자료형과 같은 사용법이다.
    	// 데이터에는 반드시 "내용"(쌍따옴표) 사용
    	//String 이름 = "내용" ;
    	//+연산자를 사용할 수 있다.
    	//실제로 더하는 것이 아니라 문자열과 문자열을 연결하는 역할을 한다.
    	//+연산을 하면 무조건 결과는 문자열(String)이다.
    	
    	String s1 = "Hello";
    	//String s2 = 10;
    	//String s3 = 3.14;
    	//String s4 = 'a';
    	String s5="a";
    	System.out.println(s1);
    	System.out.println(s5);
    	
    	String k1 = "1000";
    	int k2 = 1000;
    	System.out.println(k1+100);
    	System.out.println(k2+100);
    	
    	//int k3 = 105 + "105";
    	//문자열에 더하기를 하면 문자열이라 int에 넣을수가 없음
    	String k4 = 105 + "105";
    	System.out.println(k4);
    	
    	int su1 = 20;
    	int su2 = 4;
    	System.out.println("합계 : " + su1 +su2);
    	System.out.println("합계 : " + (su1 +su2));
    	
    	
}
}
