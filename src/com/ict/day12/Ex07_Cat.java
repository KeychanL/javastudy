package com.ict.day12;



public class Ex07_Cat extends Ex07_Animal {
int id = 124123;
public Ex07_Cat() {
	super("짜오", 3);
	//super();생략되어잇음
	//super : 부모크래스의 주소를 참조
	//super(인자) : 부모클래스의 생산자
	System.out.println("자식생성자");
}
}
