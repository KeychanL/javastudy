package com.ict.day12;

public class Ex06_Cat extends Ex06_Animal{
	
	public void play() {
		age = age + 10;
		System.out.println(age);
	}
	public void play02() {
		//사용하는 것은 가능
		age = month + 10;
		
		//데이터를 변경하는 것은 안됨
		//month = month +10;
	}
	
	@Override
	public void sound () {
		super.sound();
	}

}
