package com.ict.day04;

public class Ex06 {
private static final boolean A = false;

public static void main(String[] args) {
	//다중이프문
	//형식) if(조건식1){
    //          조건식 1이 참일때 실행;       
	//          조건식 1이 참일때 실행;
	//     }else if(조건식2){
	//          조건식 1에는 거짓이면서 조건식2에는 참일때 실행;
    //     }else if(조건식3){
	//          조건식1,2에는 거짓이면서 조건식2에는 참일때 실행;
    //          조건식1,2에는 거짓이면서 조건식2에는 참일때 실행;
	//     }else{
	//          조건식1,2,3에 모두 안맞는다
	//          나머지 다
	//     }
	
	//int k1의 점수가 90이상이면 a 80이상이면 b 70이상이면 c 나머지f
	int k1 = 89;
			if(k1>=90) {
				System.out.println("A");
			}
			else if(k1>=80) {
				System.out.println("B");
			}
			else if(k1>=70) {
				System.out.println("C");
			}
			else {
				System.out.println("F");
			}
			char k2 = '9' ;
			if(k2>= 'A' && k2<='Z') {
				System.out.println("대문자");
			}
			else if(k2>= 'a' && k2<='z') {
				System.out.println("소문자");
			}
			else if(k2>='0'&&k2<='9' ) {
				System.out.println("숫자");
			}
			else {
				System.out.println("기타문자");
			}
			
			char k3 = 'd';
			if(k3=='A'||k3=='a' ) {
				System.out.println("아프리카");
			}
			else if(k3=='B'||k3=='b') {
				System.out.println("브라질");
			}
			else if(k3=='C'||k3=='c') {
				System.out.println("캐나다");
			}
			else {
				System.out.println("대한민국");
			}
			
			int menu = 3;
			int input = 10000;
			int su = 2;
			int dan = 0;
			
			int vat = 0;
			double output = 0.0;
			String drink = "";
			if(menu==1) {
				drink="카페모카";
				dan=3500;
			}
			else if(menu==2) {
				drink="카페라떼";
				dan=4000;
			}	
			else if(menu==3) {
				drink="아메리카노";
				dan=3000;
			}	
			else if(menu==4) {
				drink="과일쥬스";
				dan=3500;
			}	
			double total = (2*dan)*1.1;
			output = input - total;
			int output1 = (int)(output/100)*100;
			//(int)(net/3.0*100)/100.0
			System.out.println(output1);
			
}
}