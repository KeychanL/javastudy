package com.ict.day17;
//두개의 스레드를 생성해 첫번째 스레드의 출력이 1-50 출력
//두번째 스레드의 출력은 51-100까지
//다시 첫번째 스레드가 101-150
//두번째 스레드가 151-200까지 출력(싱크로나이즈드 사용)
public class Ex05 implements Runnable{
	int x =0;
	@Override
	public synchronized void run() {
		for(int i = 0; i<100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + ++x);
			if(x==50 || x==100) {
				try {
					wait();
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			notify();
		}
	}

}
