package com.ict.day12;

public class Ex05_Cat extends Ex05_Animal{
	int tail = 10;
	
	//부모 메서드를 가져와서 자식클래스가 마음대로 변경할 수 있다.
	//오버라이딩이라고한다
	//@Override=>어노테이션 이라고 함
	//@Override=>부모클래스 메소드를 자식클래스가 가져와서 재정의한다.
	
	@Override
	public void sound() {
		System.out.println("야옹 ~ 야옹 ~ ");
	}
	public void play() {
		System.out.println("놀기");
	}

}
