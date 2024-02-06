package com.ict.day03;

public class Ex06 {
	public static void main(String[] args) {
		//이름이 홍길동인 사람의 점수가 
		//국어 90, 영어 80, 수학 80 이다.
		//총점과 평균을 구하자
		//출력을 이름, 총점, 평균만 출력하자(단, 평균은 소수점 첫째자리 까지 구하자)
		String name="홍길동";
		double a = 90.0;
		double b = 74.0;
		double c = 60.0;
		double net = a + b + c ;
		double ave =(int)(net/3.0*100)/100.0 ;
		
		
		
		// 소수점 한자리까지 포맷팅
		

		System.out.println(name + "의 총점은 " + net + "이며 평균은 " + ave + "이다.");
		int k1 = 198745 ; 
		int k2 = k1/10*10 ; 
		System.out.println(k2);
		
		
		
	}

}
