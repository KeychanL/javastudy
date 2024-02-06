package com.ict.day17;

interface Ex10 {
public void makeString(String k1, String k2);

}

//일반적인 방법 
//1 . 일반클래스가 인터페이스를 상속, 오버라이딩해라
class Ex10_1 implements Ex10{
	@Override
	public void makeString(String k1, String k2) {
		System.out.println(k1.concat(k2));
		System.out.println(k1+k2);
	}
	
}
