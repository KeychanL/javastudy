package com.ict.day04;

public class Ex05 {
	public static void main(String[] args) {
		//if ~else 문
		//삼향연산자와비슷하게 처리
		//즉, 조건식이 참일때와 거짓일때 각각 나눠서 처리한다.
		//주의사항 ) 한 줄은 블록 생략 가능
		//if(조건식){
		//   조건식이 참일때 실행;
		//   조건식이 참일때 실행;

        //}else {
		//   조건식이 거짓일때 실행;
		//   조건식이 거짓일때 실행;
        //}
		//int k1이 홀수인지 짝수인지 판별하자.
		//int k2가 60 이상이면 합격 아니면 불합격
		//k3가 1이면 가격에 0.1할인(10%)한다. (얼마에 살 수있냐)
		//char k4 = 대문자인지 대문자가 아닌지 판별
		//근무시간 8시간까지 9860원 8시간 초과한 시간은 1.5배
		//현재 근무 시간 10시간 얼마 받아야 하는가
		int k1 = 47 ;
		int res = k1 % 2;
		if (res==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		int k2 = 57;
		if(k2>=60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
		int k3 = 1;
		int price = 1000;
		int pay = 0;
		if(k3==1) {
			pay = (int) (0.9*price)  ;			
		}
		else {
			pay = price ;
		}
		System.out.println(pay);
		
			
		char k4 = 'Q';
		if(k4>= 'A' && k4<='Z') {
			System.out.println("대문자");
		}
		else {
			System.out.println("소문자");
		}
		
		double pay1 = 9860 ;
		double overpay = pay1*1.5 ;
		double hour = 10;
		double result = 0.0;
		if(hour>=8) {
			result = 8*pay1 + overpay*(hour-8);
		}
		else {
			result = (hour*pay1);
		}
		int result1 = (int)(result);
		System.out.println("받아야 할 금액은" + result1 + "원이다");
		
		}

}
