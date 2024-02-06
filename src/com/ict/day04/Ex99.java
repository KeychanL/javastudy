package com.ict.day04;

import java.util.Scanner;

public class Ex99 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
	System.out.print("일한 시간 입력 : ") ;
	
	double hour = scan.nextDouble();
	double pay = 9860 ;
	double overpay = pay*1.5 ;	
	double underhour = (hour<=8) ? hour : 8 ;
	double overhour = (hour<=8) ? 0 : hour-8;
	double result33 = (underhour*pay) + (overpay*overhour) ;
	int result7 = (int)(result33);
	System.out.println("받아야 할 금액은" + result7 + "원이다");
	
	

	
}
}
