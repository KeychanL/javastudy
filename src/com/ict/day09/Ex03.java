package com.ict.day09;

public class Ex03 {
	public static void main(String[] args) {
	//Math 클래스 주요메서드
    //I : 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스
		
	//E, PI
		System.out.println(Math.E);//자연 로그의 밑값 2.718..
		System.out.println(Math.PI);
		
		//메서드 모두 static이다.
		//생성자는 없다.=>객체 생성으로 할 수 없다.
		
		//1. random()//0~1사이의난수
		System.out.println(Math.random());
	    int k1 =(int)(Math.random());
	    int k2 =(int)(Math.random()*10);
	    System.out.println(k2);
	    
	    //2. ceil : 올림, round() : 반올림, floor가 버림
	    System.out.println(Math.ceil(10.0));//10
	    System.out.println(Math.ceil(10.1234));//11
	    System.out.println(Math.ceil(-10.0));//-10
	    System.out.println(Math.ceil(-10.1234));//-10
	    
	    System.out.println(Math.floor(10.0));//10
	    System.out.println(Math.floor(10.1234));//10
	    System.out.println(Math.floor(-10.0));//-10
	    System.out.println(Math.floor(-10.1234));//-11
	    
	    System.out.println(Math.round(10.0));//
	    System.out.println(Math.round(10.4));//
	    System.out.println(Math.round(10.5));//
	
	    System.out.println(Math.abs(10.7));//
	    System.out.println(Math.abs(10.0));//
	    System.out.println(Math.abs(10.4));//
	    System.out.println(Math.abs(10.5));//
	    System.out.println(Math.abs(10.7));//
	    
	    System.out.println(Math.max(15, 15.00089));
	    System.out.println(Math.min(15, 15.00089));
	    
	    
	    
	    
	    
	    
}

}
