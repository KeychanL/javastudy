package com.ict.day04;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력 : ") ;
		int k1 = scan.nextInt();
		//중첩 삼항 연산자 : 삼항 연산자 안에 삼항 연산자가 존재
		//형식)) 자료형 변수 = (조건식1)? ((조건식2)?참일때:거짓일때):거짓일때 실행할 문장;
		//형식)) 자료형 변수 = (조건식1)? 참일때 실행할 문장:((조건식2)?참일때:거짓일때);
		//형식)) 자료형 변수 = (조건식1)? ((조건식2)?참일때:거짓일때):((조건식2)?참일때:거짓일때);
		
		//int k1이 90이상이면 "A학점", 80이상이면 "B학점", 나머지는 "F학점";		
	    String result = (k1>=80)?((k1>=90)?"A":"B"):"F";
	    System.out.println(result);
	    
	    //char k가 대문자인지, 소문자인지, 기타문자인지 판별하자
	    //Scanner scan1 = new Scanner(System.in);
		//System.out.print("문자 입력 : ") ;
		//String k = scan1.next();
	    char k = 'd';
		String res3 = (k>= 'A' && k<='Z') ? "대문자" : ((k>='a' && k<='z')?"소문자":"기타문자") ;
		System.out.println(res3);
		
		//int k3가 1또는 3이면 남자 2또는 4이면 여자
		int k3 = 3;
		String res4 = (k3==1 || k3==3)?"남자":"여자";
				System.out.println(res4);
				
				//int k4가 1이면 1900년대 태어난 남자, 2면 2000년대에 태어난 남자
				//2이면 1900년대에 태어난 여자, 4면 2000년대에 태어난 여자 
				int k4 = 3;
				String res5 = (k4==1 || k4==3)?((k4==1)?"1900년대에 태어난 남자"
						:"2000년대에 태어난 남자"):((k4==2)?"1900년대에 태어난 여자"
								:"2000년대에 태어난 여자");
				System.out.println(res5);
				
				int k5 = 8;
				String result5 = (k5==1 || k5==3) ? ((k5==1)? "1900년대에 태어난 남자" : "2000년대에 태어난 남자"):
					((k5==2)|| k5==4)?((k5==2? "1900년대에 태어난 여자": "2000년대 태어난 여자")):"외계인";
					System.out.println(result5);
					
					//두 수 중 큰 수를 구하자
					int su1 = 4;
					int su2 = 9;
					int i = su1>su2 ? su1 : su2 ;
					System.out.println(i);
					
					int res2 = Math.max(su1,  su2);
					System.out.println(res2);
	}

}
