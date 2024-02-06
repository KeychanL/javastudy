package com.ict.day09;

import java.util.Scanner;

public class Ex18 {
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.print("첫번째 숫자 : ");
    int s1 = scan.nextInt();
	
	System.out.print("두번째 숫자 : ");
	int s2 = scan.nextInt();
	
	Ex17 p = new Ex17();
	
	int res1 = p.plus(s1, s2);
	System.out.println(res1);
	
	int res2 = p.sub(s1, s2);
	System.out.println(res2);
	
	int res3 = p.mul(s1, s2);
	System.out.println(res3);
	
	double res4 = p.div(s1, s2);
	System.out.println(res4);
	
	
	System.out.println(s1 + "+" + s2 + "=" + res1);
	System.out.println(s1 + "-" + s2 + "=" + res2);
	System.out.println(s1 + "*" + s2 + "=" + res3);
	System.out.println(s1 + "/" + s2 + "=" + res4);
	
	
	
	//첫번째 숫자
	
	//두번째 숫자
	
	//연산자 : + - * /
	
	//출력
	
	//숫자 연산자 숫자 = 결과
	
}
}
