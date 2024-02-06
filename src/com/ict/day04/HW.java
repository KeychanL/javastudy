package com.ict.day04;

public class HW {
public static void main(String[] args) {
	
	double a = 99;
	double b = 77;
	double c = 10000;
	double re1 = Math.max(a,b);
	System.out.println(re1);
    //두 수 중에 큰 값을 출력
	double re2 = Math.min(a,b);
	System.out.println(re2);
	//두 수 중에 작은 값을 출력
	double originalValue = 3.141592;
	double nextUpValue = Math.nextUp(originalValue);

	System.out.println("Original Value: " + originalValue);
	System.out.println("Next Up Value: " + nextUpValue);
	//입력되는 수보다 최소한의 단위만큼 큰 수를 출력 해당 메소드로 
	//컴퓨터의 숫자 표현에 관한 정밀도를 알 수 있음
	double re3 = Math.log10(c);
	System.out.println(re3);
	//10의 밑을 가지는 로그함수에 입력 후 결과값 출력
	int re4 = Math.multiplyExact((int) a, (int) b);
	System.out.println(re4);
	//두 수의 곱을 출력
	
	
	
	
	
}
}
