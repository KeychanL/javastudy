package com.ict.day09;

public class Ex06 {
	
	String name = "홍길동";
	static int kor = 80;
	static int eng = 95;
	static int math = 95;
	int total = 0;
	
	//static 메서드
	public static void play01() {
		//스태틱 메서드가 전역변수를 사용하기 위해서는 전역변수 스태틱
		int sum = kor + eng + math;
		
		//System.out.println(name);
		System.out.println(kor);
	}
	public static int play02() {
		int sum= kor+eng+math;
		return sum;
	}
}