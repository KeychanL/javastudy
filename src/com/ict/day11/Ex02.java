package com.ict.day11;

public class Ex02 {
public static void main(String[] args) {
	
	//Ex01 객체 생성
	//없어서 기본 생성자를 사용
	//Ex01의 생성자를 만들자
	
	//이름, 나이, 주소 출력
	Ex01 t = new Ex01("도우너", 11);
	System.out.println(t.getName());
	
	
	System.out.println(t.getAge());
	
	
	System.out.println(t.getAddr());
	System.out.println();
	
	//이름을 임꺽정 나이를 34 주소를 함경도
	t.setName("임꺽정");
	System.out.println(t.getName());
	
	t.setAge(34);
	System.out.println(t.getAge());
	
	t.setAddr("함경도");
	System.out.println(t.getAddr());

}
}
