package com.ict.day17;

public class Ex01 implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i<51; i++) {
			System.out.println("run : " + Thread.currentThread().getName());
		}
		// TODO Auto-generated method stub
		//메소드가 메소드를 호출
		play();
		System.out.println("run : " + Thread.currentThread().getName());
		
	}
	public void play() {
		System.out.println("first : " + Thread.currentThread().getName());
	}

}
