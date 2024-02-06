package com.ict.day02;

public class Ex04 {
	public static void main(String[] args) {
		//실수  : 소수점이 있는 숫자
		// float < double
		// 실수의 기본은 double;
		
		double num = 3837.43 ;
		System.out.println(num);
		
		//줄단위or범위 복사 : 해당 위치에서 컨트롤+알트+아래방향키
		//줄 이동 : 해당 위치에서 알트+위 아래 방향키
		float f1 = 3827.48f ;
		System.out.println(f1);
		float f2 = 382.32F ;
		System.out.println(f2);
		//숫자 뒤에 F또는 f를 붙이지 않으면 오류
		//float f3 = 45.4;
		
		double d1 = 3.14 ;
		System.out.println(d1);
		//중요)float나 double은 부동소숫점으로 값을 표현하므로 소수점 이하의 값이 정확하게 표현이 안되는 오류 발생
		//해결)나중에는 BigDecimal클래스를 사용
		//  현재는 소수점 이하 몇 자리 버림 올림 반올림 이용
	}

}
