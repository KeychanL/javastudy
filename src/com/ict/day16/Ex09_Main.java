package com.ict.day16;

public class Ex09_Main {
public static void main(String[] args) {
	Ex09_TestA testA = new Ex09_TestA();
	Ex09_TestB testB = new Ex09_TestB();
	
	//runnable은 스타트가 없으므로 사용못함
	//testA.start();
	
	Thread t1 = new Thread(testA);
	t1.start();
	
	new Thread(testB).start();
	
}
}
