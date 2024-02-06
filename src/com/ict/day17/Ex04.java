package com.ict.day17;
//두개의 스레드를 생성해서 첫번째 스레드의 출력을 1-100까지출력
//두번째 스레드의 출력을 101-200까지 출력하라 (싱크로나이즈드 사용)
public class Ex04 implements Runnable{
	int x=0;
	@Override
	/*public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":"+ ++x);
		}*/
	public void run() {
		synchronized (this) {
			for(int i = 0; i <100; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + ++x);
			}
			
		}
	}

}
