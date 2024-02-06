package com.ict.day11;

public class Ex13 {
	//static : 객체 생성과 상관없이 미리 만들어진 필드와 메서드
	//         클래스와 지역변수에는 사용할 수 없다.
	//         모든객체에서 접근해서 사용할 수 있음(단, private이면 안됨)
	//         스태틱 영역에 만들어진다.
	
	int su = 10;
	static int num = 10;
	
	public Ex13() {
		su++;
		num++;
	}
	
	public void play() {
		int k = su + 1000;
		int k2 = num + 10;
		
		
	}
	//스태틱메서드는 전역변수 사용못함
	//지역변수에 static사용 못함
	public static int play2() {
		//int k =su + 1000;
		System.out.println("k : " + 1000);
		
		int k2 = num + 10;
		return k2;
		//static int k3 = 1000;
	}

}
