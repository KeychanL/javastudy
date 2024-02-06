package com.ict.day14;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		esc:while(true) {
			System.out.print("숫자 입력 : ");
			String su = scan.next();
			int s1 = Integer.parseInt(su);
			
			String res = "";
			if(s1 %2==0) {
				res = "짝수";
				
			}else {
				res = "홀수";
			}
			System.out.println(su + "는"+ res + "입니다.");
			while(true) {
				System.out.println("계속할까요?(y/n)");
				String msg = scan.next();
				//String에서는 같다==를 사용하면 안됨
				//equals() => 대소문자를 구별
				//equalsIgnoreCase() => 대소문자를 구별하지 않음
				if(msg.equalsIgnoreCase("y")) {
					continue esc;
					
				}
				if(msg.equalsIgnoreCase("n")) {
					break esc;
				}
				System.out.println("제대로 입력하세요");
			}//안  while
		}//밖 while
		System.out.println("수고하셨습니다");
	}
}
