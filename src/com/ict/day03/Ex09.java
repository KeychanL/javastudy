package com.ict.day03;

public class Ex09 {
public static void main(String[] args) {
	//카페모카 6500원이다.
	//친구와 둘이서 15000원을 내고 주문했다.
	//잔돈은 얼마인가?(단, 부가세 10% 포함)
	double camo = 6500 ;
	double pay = 15000 ;
	double money = pay%(camo*1.1) ;
	int finalmoney = (int) money ;
	
	System.out.println("잔돈은" + finalmoney + "원입니다");
}

}
