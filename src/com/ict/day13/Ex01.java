package com.ict.day13;
//인터페이스 : 서비스를 제공하는 목록
//          상수와 추상메서드로 구성되어있음
//          생성자가 없음(객체 생성 안됨)
//          **상속과 달리 인터페이스는 하나의 클래스가 둘 이상의 인터페이스를 동시에 구현할 수 있다.
//          인터페이스가 같다라는 뜻은 대체가 가능하다는 뜻
//          java 8 부터 지원 1)스태틱 메서드 추가 2)디폴트 메서드 추가

public class Ex01 {
//원래는 변수명을 대문자 사용
	int su1 = 10;
	static int su2 = 20;
	final int su3 = 30;
	static final int su4 = 40;
	
	
}

interface Ex02 {
	//변수명을 대문자 사용
	int su1 = 10;
	static int su2 = 20;
	final int su3 = 30;
	static final int su4 = 40;
	//
	public abstract void sound();
	public void play();
	
}
