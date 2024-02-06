package com.ict.day02;

public class Ex08 {
public static void main(String[] args) {
	//산술연산자 : + - * /
	//대상 : char int long double float
	// 문자형 정수형 실수형 
	double su1 = 9;
	double su2 = 4;
	double result = 0;//결과 저장하는 놈
	result = su1 + su2 ;
	System.out.println(su1+su2);
	System.out.println(su1-su2);
	System.out.println(su1*su2);
	System.out.println(su1/su2);
	System.out.println("su1"+"su2");
	System.out.println("결과 : "+result);
	System.out.println("결과 : "+su1+"+"+su2+"="+result);
	result = su1 - su2 ;
	System.out.println("결과 : "+su1+"-"+su2+"="+result);
	result = su1 * su2 ;
	System.out.println("결과 : "+su1+"*"+su2+"="+result);
	result = su1 / su2 ;
	System.out.println("결과 : "+su1+"/"+su2+"="+result);
	result = su1 / su2 ;
	System.out.println("결과 : "+su1+"/"+su2+"="+result);
	//데이터를 직접 출력하거나 호출하지 말고 변수를 이용해서 출력하거나 호출하자
	//정수로 산술연산하면 정수가 된다
	//정수와 실수가 산술연산을 하면 결과는 실수가 된다.
	double reult3 = su1 /(su2*1.0) ;
	
	//나머지
	result = su1 % su2 ;
	System.out.println("나머지 : "+su1+"/"+su2+"="+result);
	
	
}
}
