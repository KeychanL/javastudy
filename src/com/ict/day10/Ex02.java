package com.ict.day10;

public class Ex02 {
	public static void main(String[] args) {
		Ex01 t = new Ex01();
		int var1 = 100;
		//인자가 기본자료형  : Call By Value
		//값이 변하지 않는다.
		int var2 = t.add(var1);
		
		//값이 변하지 않는다
		System.out.println(var1);//100
		System.out.println(var2);//101
		
		int[] su = {1, 10, 100, 1000};
		t.add2(su);
		
		for(int i =0; i<su.length; i++) {
			System.out.println(su[i]);
		}
	}

}
