package com.ict.day05;

public class Ex04 {
public static void main(String[] args) {
	//while 문 : for 문과 같은 반복문
	//형식1)
	// 초기식 또는 현재 변수
	//while(조건식){
	//   조건식이 참일때 실행;
	//   조건식이 참일때 실행;
	//   증감식;
	//   }
	//*while의 끝을 만나면 조건식으로 이동
	int k1 = 0;
	while(k1<11) {
		k1++;
		if(k1%2==0) {
		System.out.println(k1);
		}
	}
	int k2 = 10;
	while(k2<21) {
		k2++;
		if(k2%2==0) {
			System.out.println(k2);
		}
	}
	int k3 = 1;
	while(k3<10) {
		System.out.println("7*" + k3 + "=" + (7*k3));
		k3++;
		
		}
	}

}