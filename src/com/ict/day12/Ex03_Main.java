package com.ict.day12;

public class Ex03_Main {
	public static void main(String[] args) {
		//자식클래스를 객체 생성하면 부모클래스가 먼저 생성된다
		Ex03_Sub t1 = new Ex03_Sub();
		Ex03_Sup t2 = new Ex03_Sub();//Ex03_Sub is a Ex03_Sup
		//Ex03_Sub t3 = new Ex03_Sup();요거는 오류
		
		
	}

}
