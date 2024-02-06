package com.ict.day16;

import java.util.Stack;

/*
 * List인터페이스 : 배열과 흡사한 구조, 삽입 삭제 추가 자유 크기 지정안해도됨
 * 
 * 구현한 클래스 : Stack, Vector, ArrayList
 * 구조 : LIFO(Last In First Out)
 *       후입선출
 * add, push, addElement => 추가
 * add(index, E)=> 삽입
 * pop : 맨 위에 존재하는 객체 반환 후 삭제
 * peek : 맨 위에 존재하는 객체 반환 후 삭제안함
 * search : 검색 (오른쪽1부터)
 * indexOf : 검색(왼쪽0부터) = > 배열 형식 처럼
   elementAt(index) : 해당 요소 반환
   get(index) : 해당 요소 반환
   firstElement() : 멘 처음 요소 변환
   LastElement() : 마지막  요소 변환
   setElement(Element, index) : 치환
 *
 *
 *
 *
 *
 *
 */
public class Ex01 {
public static void main(String[] args) {
	Stack<String>s1 = new Stack<String>();
	s1.add("둘리");
	s1.push("공실이");
	s1.addElement("마이콜");
	
	s1.add(1, "고길동");
	s1.add(3, "희동이");
	System.out.println(s1);
// 마지막 객체 보기 : pop(삭제), peek, LastElement
	String res = s1.peek();
	System.out.println("가지고 온 객체 : " + res);
	System.out.println(s1);
	
	res = s1.pop();
	System.out.println("가지고 온 객체 : " + res);
	System.out.println(s1);
	
	res = s1.lastElement();
	System.out.println("가지고 온 객체 : " + res);
	System.out.println(s1);
	
	if(s1.contains("둘리")) {
		System.out.println(s1.indexOf("희동이"));
		System.out.println(s1.search("희동이"));
		
		
		System.out.println(s1.get(1));
		System.out.println(s1.elementAt(1));
		
		System.out.println(s1.firstElement());
		System.out.println(s1.lastElement());
		
		
	}else {
		if(s1.contains("고길동")) {
			s1.setElementAt("도우너", s1.indexOf("고길동") );
		}
		System.out.println("존재하지 않음");
		
		//중복가능
		s1.add("둘리");
	}
	
	}
}
