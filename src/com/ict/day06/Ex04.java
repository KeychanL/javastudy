package com.ict.day06;

public class Ex04 {
public static void main(String[] args) {
	//브레이크와 브레이크라벨
	//브레이크 : 현재 위치의 블록을 탈출
	//브레이크레이블 : 레이블이 지정한 블록을 탈출
	
	//레이블 지정 : 반복문 앞에 '이름' 붙이면 된다.
	
	//1-10 출력(break)
	for (int i = 1; i < 11; i++) {
		if(i==6)break;
		
		System.out.print(i + " ");
		
	}
	System.out.println();
	
	//1-10출력 (break label)
	//반복문 앞에 label이름뒤 :을 붙인다
	//for문에는 break label을 붙일 이유가 없다.
	exit : for (int i = 1; i < 11; i++) {
		if(i==6)break exit;
		
		System.out.print(i + " ");
		
	}
	System.out.println();
	
	System.out.println("다중 for문 안에서 사용하기");
	
	for(int i =1; i<4; i++) {
		for(int j=1; j<6; j++) {
			if(i==2)break;
			System.out.println("i="+i+", j="+j);
		}
	}
	run : for(int i =1; i<4; i++) {
		for(int j=1; j<6; j++) {
			if(i==2)break run;
			System.out.println("i="+i+", j="+j);
		}
	}
}
}
