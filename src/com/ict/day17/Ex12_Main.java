package com.ict.day17;

public class Ex12_Main {
	public static void main(String[] args) {
		//Ex12 t = s -> System.out.println(s + "님 환영");
		Ex12 t = returnString();
		t.showString("hello");
	}
	public static Ex12 returnString() {
		return s->System.out.println(s+ "님 환영");
	}
}
