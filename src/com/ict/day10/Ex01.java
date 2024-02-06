package com.ict.day10;

public class Ex01 {
	
	//메서드 인자 기본자료형의 값은 인자로 전달하면 값호출
	//원본값은 변하지 않는다.
public int add(int k) {
	++k;
	return k;
}
//메서드 인자를 배열이나 객체를 인자로 전달하면 참조호출
//콜바이레퍼런스
public void add2(int[] k) {
	//받은 배열을 하나씩 꺼내서 10씩 증가하자
	for(int i =0; i<k.length; i++) {
		k[i] = k[i] + 10; //k[i]+=10
	}
	
}
}
