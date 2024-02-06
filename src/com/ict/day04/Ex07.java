package com.ict.day04;

import java.util.Scanner;

public class Ex07 {
public static void main(String[] args) {
	
	double dan = 0;
    double output = 0;
	int menu=0;
	
	
	
	
    Scanner scan = new Scanner(System.in);
	
	
	
	System.out.println(">>>>>>>>>>> 메뉴 >>>>>>>>>>>");
    System.out.println(">>>   1.카페모카(3500)    >>>");
    System.out.println(">>>   2.카페라떼(4000)    >>>");
    System.out.println(">>>   3.아메리카노(3000)   >>>");
    System.out.println(">>>   4.과일쥬스(4000)    >>>");
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
    System.out.print("메뉴를 선택하세요  >>> ");
    
    menu=scan.nextInt();
    
    System.out.print("몇 잔을 하시겠습니까? >>>");
    int su = scan.nextInt();
    
    System.out.print(" 입금할 금액 >>>");
    double input = scan.nextDouble();
    
    
    String drink;
	if(menu==1) {
    	drink = "카페모카";
		dan=3500;
	}
	else if(menu==2) {
		drink = "카페라떼";
		dan=4000;
	}	
	else if(menu==3) {
		drink = "아메리카노";
		dan=3000;
	}	
	else if(menu==4) {
		drink = "과일쥬스";
		dan=3500;
	}	
    
    double total = (su*dan)*1.1;
	output = input - total;
	int output1 = (int)(output/100)*100;
	//(int)(net/3.0*100)/100.0
	System.out.println("잔돈은" + output1 + "원입니다");
    
}
}
