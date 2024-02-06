package com.ict.day03;

public class Ex08 {
	public static void main(String[] args) {
		//3989초는 몇시간 몇분 몇초일까
		int t = 3989;
		
		
		int h = t / 3600 ;
		int m = (t%3600) / 60 ;
		int s = (t%3600) % 60 ;
		System.out.println(t + "초는" + h + "시간" +  m + "분" + s + "초");
		
		
	}

}
