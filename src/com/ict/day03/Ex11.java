package com.ict.day03;

import java.util.Scanner;

public class Ex11 {
public static void main(String[] args) {
	//이름 국어 영어 수학 점수 입력받아서 총점 평균을 구하고 이름 총점 평균을 출력하자(평균은 소수점 둘째자리 까지)
	Scanner scan = new Scanner(System.in);
	System.out.print("이름 : ");
	String name = scan.next();
	
	System.out.print("국어 : ");
	double a = scan.nextDouble();
	
	System.out.print("영어 : ");
	double b = scan.nextDouble();
	
	System.out.print("수학 : ");
	double c = scan.nextDouble();
	
	double net = a + b + c ;
	double ave =(int)(net/3.0*100)/100.0 ;
	
	
	System.out.println(name + "의 총점은 " + net + "이며 평균은 " + ave + "이다.");
	
	
	
}
}