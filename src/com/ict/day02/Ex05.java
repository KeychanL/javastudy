package com.ict.day02;

public class Ex05 {
public static void main(String[] args) {
	//크기 비교 (boolean만 제외됨 char은 제외안됨 숫자저장이라 크기비교 가능)
	//byte < short < char < int < long < float < double
	
	//큰 자료형은 작은 자료형을 저장할 수 있다.
	//작은 자료형은 큰 자료형을 저장할 수 없다.
	//데이터 100이 int s1에 들어감 
	int s1 = 100;
	//변수 s1안의 데이터 100이 long s2에 들어감
	long s2 = s1;
	//변수 s1안의 데이터 100이 double s3에 들어감
	double s3 = s1 ;
	
	char s4 = 'a';
	int s5 = 'a' ;
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	System.out.println(s5);
}
}
