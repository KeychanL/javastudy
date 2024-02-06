package com.ict.day17;

public class Ex01_Main {
public static void main(String[] args) {
	System.out.println("main : " + Thread.currentThread().getName());
	Ex01 test = new Ex01();
	Thread thread = new Thread(test);
	thread.start();
	//join() : 현재 스레드는 조인을 호출한 스레드가 끝날때까지 대기상태로 빠짐 조인을 호출한 스레드가 끝나면 다시 실행 즉 조인을 호출한 스레ㅐ드가 끝나야 실행할 수 잇다
	try {
		thread.join();
	} catch(InterruptedException e) {
		e.printStackTrace();
	}
	
	System.out.println("수고하셨습니다 : " + Thread.currentThread().getName());
}
}
