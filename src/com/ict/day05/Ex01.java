package com.ict.day05;

public class Ex01 {


public static void main(String[] args) {
	//switch case : 다중 if~else 문과 같은 조건문
	//if문 조건식 boolean형, 즉 비교연산, 논리연산, boolean형일때
	//switch문 인자값이 int이하, char, String일때 사용
	//long, 실수형일때 사용 불가
	//형식) switch(인자값=int, char, String){
	//case 조건값1 : 인자값과 조건값1이 같을때 수행할 문장 ; break;
	//case 조건값2 : 인자값과 조건값2이 같을때 수행할 문장;
    // 인자값과 조건값2이 같을 때 수행할 문장; break;
	//case 조건값3 : 인자값과 조건값3이같을때 수행할 문장; break;
	//default : 조건값1,2,3 모두 같지 않을때 수행할 문장;
	//}
	//**주의사항 : break가 없으면 break를 만날때까지 모든 실행문을 실행한다.
	//break문의역할은 현재 실행 중인 범위({}블록)를 벗어나는 역할을 한다.
	//default는 생략가능
	
	//int k1이 1이면 카페모카, 2이면 카페라떼, 3이면 아메리카노, 4이면 과일쥬스
	String drink = "음료";
	int k1= 3;
	if(k1==1) {
		drink="카페모카";
		}
	else if(k1==2) {
		drink="카페라떼";
	}
	else if(k1==3) {
		drink="아메리카노";
	}
	else if(k1==4) {
		drink="과일쥬스";
	}
	System.out.println(drink);
	
	switch (k1) {
	case 1: System.out.println("카페모카");break;
	case 2: System.out.println("카페라떼");break;
	case 3: System.out.println("아메리카노");break;
	case 4: System.out.println("과일쥬스");break;
	}
	//char k2이A이면 아프리카 B면 브라질 C면 캐나다 나머지 한국
	
	
	char k2 = 'K';
	
	switch (k2) {
	case 'A': System.out.println("아프리카");break;
	case 'B': System.out.println("브라질");break;
	case 'C': System.out.println("캐나다");break;
	default : System.out.println("한국");break;
	}	
	//char k3가 A거나a면 아프리카 ~
	char k3 = 'b';
	String result3="";
	switch(k3) {
	case 'A','a' : result3 = "아프리카"; break;
	case 'B','b' : result3 = "브라질"; break;
	case 'C','c' : result3 = "캐나다"; break;
	default : result3 = "한국"; break;
	}
	System.out.println(result3);
	
	//char k3가 A거나a면 아프리카 ~
	char k4 = 'b';
	String result4="";
	switch(k4) {
	case 'A':
	case 'a': result4 = "아프리카"; break;
	case 'B':
	case 'b': result4 = "브라질"; break;
	case 'C':
	case 'c': result4 = "캐나다"; break;
	default : result4 = "한국"; break;
	}
	System.out.println(result4);
	//String k5 가 한국이면 서울 중국이면 베이징 일본이면 도쿄 미국이면 워싱턴
	
	String k5 = "한국";
	String result5 = "";
	switch(k5) {
	case "한국" : result5 = "서울"; break;
	case "중국" : result5 = "베이징"; break;
	case "일본" : result5 = "도쿄"; break;
	case "미국" : result5 = "워싱턴"; break;
	
	}
	System.out.println(result5);
	String result6 = "";
	int k6=93;
	switch ((int)(k6/10)) {
	case 10 : 
	case 9 : result6 = "A"; break;
	case 8 : result6 = "B"; break;
	case 7 : result6 = "C"; break;
	default : result6 = "F"; break;
	
	}
	System.out.println(result6);
}
}
