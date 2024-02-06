package com.ict.day04;

public class Ex01 {
	public static void main(String[] args) {
		//삼항연산자
		//형식) 자료형 변수 = (조건식) ? 참일때 실행할 문장 : 거짓일때 실행할 문장 ;
		//int k1이 홀수인지 짝수인지 판별하자
		//어떤 수를 2 나눈 나머지가 0이면 짝수 1이면 홀수
		int k1 = 47 ;
		int res = k1 % 2;
		
		String result = (res==0) ? "짝수"  : "홀수" ;
		System.out.println(k1 + " : " + result);
		
		result = (k1%2==0)?"짝수":"홀수";
			System.out.println(k1+":"+result);

		//int k2가 60이상이면 합격 아니면 불합격
			int k2 = 57;					;
			String resultt = (k2>=80) ? "합격":"불합격";
			System.out.println(k2 + ":" + resultt);
			
		//k3가 1이면 가격에 0.1 할인한다
			int k3 = 1;
			int price = 1000;
			int res2 = (k3==1) ? price-(int)(price*0.1) : price; 	
			System.out.println(k3 + ":" + res2);
			
			//char k4 = 대문자인지 대문자가 아닌지 판별 
			char k4 = 'Q';
			String res3 = (k4>= 'A' && k4<='Z') ? "대문자" : "대문자 아님" ;
			System.out.println(k4 + ":" + res3);
			//근무시간이 8시간까지는 시간당 9860이고
			//8시간 초과한 시간만큼은 1.5배 지급한다.
			//현재 근무한 시간이 10시간이다.
			//얼마를 받아야 하는가?
			
			double pay = 9860 ;
			double overpay = pay*1.5 ;
			double hour = 10;
			double underhour = (hour<=8) ? hour : 8 ;
			double overhour = (hour<=8) ? 0 : hour-8;
			double result33 = (underhour*pay) + (overpay*overhour) ;
			int result7 = (int)(result33);
			System.out.println("받아야 할 금액은" + result7 + "원이다");
            //내가 한거
			
			int time = 10;
			int dan = 9860;
			double res99 = (time>8) ? (int)(dan*1.5*(time-8))+(8*dan) : time * dan;
			System.out.println("결과 : " + res99);
			
	}

}
