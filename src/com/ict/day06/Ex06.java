package com.ict.day06;

import java.util.Scanner;

public class Ex06 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	esc : while (true) {
		System.out.print("숫자 입력 : ");
		int k1 = scan.nextInt();
		String res = "";
		
	//숫자를 받아서 홀수인지 짝수인지
	if(k1%2==0) {
		res = "짝수";
	    }
	else if(k1%2==1) {
		res = "홀수";
	}
	System.out.println(res);
	while(true) {
	System.out.println("계속할까요?(1.yes, 2.no)>>");
	int result = scan.nextInt();
	if(result==1) continue esc;
	if(result==2) break esc;
	
	System.out.println("1과 2중에 골라주세요");
	//안쪽 와일
		
	}
	//바깥 와일
}
}
}
