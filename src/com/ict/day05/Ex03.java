package com.ict.day05;

public class Ex03 {
public static void main(String[] args) {
	//중첩 for문 : for문 안에 또 다른 for문이 존재하는 것
	//포문의 끝을 만나면 증감식으로 돌아가라
	for(int i = 0; i<4; i++) {
		System.out.println("명령문1");
		for(int j=0; j<6; j++) {
			System.out.println("i=" + i + ",j=" + j);
		}
		System.out.println("명령문2");
		}
			
	}

}
