package com.ict.day04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ") ;
	
		int k1= scan.nextInt();
		String result = k1%2==0 ? "짝수" : "홀수" ;
		System.out.println(result);
		
		System.out.print("점수 : ");
		int k2=scan.nextInt();
		//받은 점수가 60점이상이면 합격 아니면 불합격
		String result1 = k2>=60 ? "합격" : "불합격" ;
		System.out.println(result1);
		
	}

}
