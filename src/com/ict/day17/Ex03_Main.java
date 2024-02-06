package com.ict.day17;

public class Ex03_Main {
	public static void main(String[] args) {
		Ex03 test = new Ex03();
		new Thread(test, "dog").start();
		new Thread(test, "cat").start();

		System.out.println("main : " + Thread.currentThread().getName());
	}
}
