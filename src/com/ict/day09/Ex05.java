package com.ict.day09;

public class Ex05 {
public static void main(String[] args) {
	//Ex04 클래스를 객체로 만들어야
	//EX04가 가지고 있는 필드와 메서드를 사용할 수 있다.
	
	//Ex04클래스를 객체로 만들기
	Ex04 t = new Ex04();
	
	System.out.println(t.name);
	
	//Ex04에 있는 play01메소드를 호출하자
	//play01dl void이기때문에 데이터를 가져오지는 않는다
	System.out.println(t.total);
	t.play01();
	System.out.println(t.total);
	//System.out.println(4);
	
	int k=t.play03();
	System.out.println(k);
	
	
	
}
}
