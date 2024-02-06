package com.ict.day06;

import java.util.Scanner;

public class Ex07 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//전체횟수, 짝수횟수, 퍼센티지(소수점 첫째자리)
	int run = 1;
	int runeven = 0;
	
	
	esc : while (true) {
		System.out.print("숫자 입력 : ");
		int k1 = scan.nextInt();
		String res = "";
		
		
	//숫자를 받아서 홀수인지 짝수인지
	if(k1%2==0) {
		res = "짝수";
		runeven++;
	    }
	else if(k1%2==1) {
		res = "홀수";
	}
	System.out.println(res);
	while(true) {
		
	System.out.println("계속할까요?(1.yes, 2.no)>>");
	int result = scan.nextInt();
	if(result==1) {
		run++;
		continue esc;
	}
	if(result==2) {
		System.out.println("총 시행 횟수 =" + run);
		System.out.println("짝수가나온 횟수 =" + runeven);
		double per= ((double)runeven/run);
		double realfinal = Math.round(per * 10000.0) / 100.0;
		System.out.println("짝수가 나온 퍼센티지 =" + realfinal + "%");
		
		break esc;
	}
	
	System.out.println("1과 2중에 골라주세요");
	//안쪽 와일
		
	
	}
	//바깥 와일
}
}
}
