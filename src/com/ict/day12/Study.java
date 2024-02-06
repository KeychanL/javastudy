package com.ict.day12;

public class Study {
	package com.ict.day02;

	public class Ex01 {
	public static void main(String[] args) {
		// 주석 : 컴파일러는 해당 줄을 무시하고 사람에게는 보이는 줄 (해당 코딩의 설명글을 표시하는 줄)
		// 논리형 :  boolean으로 사용,  true 또는 false를 말한다.
		
		// 변수는 데이터 하나를 저장하는 영역이다. 가장 최신의 데이터만 남는다.
		// 예) 변수에 10이 저장되어있다가 20을 저장하면 10을 지우고 20이 저장된다.
		// 변수 앞에 어떤 데이터를 저장할 수 있는지 맨 처음에 표시한다.( 선언)
		
		// 논리형을 변수에 기억 시키는 방법
		// 1. boolean 변수이름 ; (선언)
		
		//    데이터가 변수에 저장된다 라는 뜻
		//    boolean 형에서 사용할 수 있는 데이터는 true 또는 false 이다. 
		// 2. 변수이름 = 데이터(표현범위) ;
		
		boolean b1 ;
		b1 = true;
		
		// 변수를 호출하면 변수안에 있는 데이터가 나온다.
		System.out.println(b1);
		
		// false를 다시 b1에 저장하자
		b1 =false;
		System.out.println(b1);
		
		// 변수 b2 만들기
		// 자료형(boolean) 변수이름 = 데이터 ;
		// 선언과 저장을 한번에 
		boolean b2 = true;
		// b2 내용 보가 
		System.out.println(b2);
		// b2 데이터를 false로 변경하기 
		b2 = false;
		// b2 내용보기
		System.out.println(b2);
		
		// boolean은 true, false 이외에는 오류 발생한다.
		// boolean b3 = 0 ;

		
	}
	}


	package com.ict.day02;

	public class Ex02 {
		public static void main(String[] args) {
		  // 문자형 : char  , 숫자로 저장된다. (연산이 가능하다)
		  //       그러나 우리는 숫자 대신에 홑따옴표를 사용 ('a', 'A','가'...)
		  
		  // 선언
		  // char 변수이름 ; (선언)
		  // 변수이름 = 데이터( 'a', 'A','가'...)
			
		  // 문자형 ch1 이라는 변수에 a를 저장하자
			char ch1 ;
			ch1 = 'a' ;
			
		  // ch1를 화면에 출력하자 
			System.out.println(ch1);
			
			ch1 = 'A';
			System.out.println(ch1);
			
			ch1 = 100;
			System.out.println(ch1);
			
			ch1 = 100 - 32 ;
			System.out.println(ch1);
			// 변수에 저장하지 않았으므로 문자가 아니라 숫자 100이 나온다.
			System.out.println(ch1+32); 
			
		}
	}
	package com.ict.day02;

	public class Ex03 {
		public static void main(String[] args) {
			// 숫자는 정수형과 실수형으로 나눠진다.
			// 정수란 소수점이 없는 숫자 
			// 실수란 소수점이 있는 숫자
			// 정수 < 실수
			// 정수 : byte < short < int(기본) < long
			// 실수 : float < double(기본)
			
			// byte : -128 ~ 127 
			byte b1 = 100 ;
			System.out.println(b1);
			
			b1 = 127 ;
			System.out.println(b1);
			
			// 계산 결과가 127를 넘었으므로 오류 발생 한다.
			// 즉, 변수에 저장할 때는 결과값으로 저장 유무를 결정한다.
			// b1 = 120 + 9;
			
			// short : -32,768 ~ 32,767
			// byte 처럼 결과값이 범위를 넘으면 사용 불가
			
			// int : 기본적으로 정수를 사용할 때 호출하는 자료형
	        int su = 35 ;
	        System.out.println(su);
	        
	        // long : 정수 중에 가장 큰 범위를 가지고 있음
	        //        즉, 큰 정수를 사용할때 호출하는 자료형 
	        //        숫자 뒤에 L 또는 l 를 붙인다. (생략가능)
	        long num = 32L ;
	        long num2 = -3514L;
	        long num3 = 32145l;
	        long num4 = -56212l;
	        System.out.println(num);
			
			
		}
	}





	package com.ict.day02;

	public class Ex03 {
		public static void main(String[] args) {
			// 숫자는 정수형과 실수형으로 나눠진다.
			// 정수란 소수점이 없는 숫자 
			// 실수란 소수점이 있는 숫자
			// 정수 < 실수
			// 정수 : byte < short < int(기본) < long
			// 실수 : float < double(기본)
			
			// byte : -128 ~ 127 
			byte b1 = 100 ;
			System.out.println(b1);
			
			b1 = 127 ;
			System.out.println(b1);
			
			// 계산 결과가 127를 넘었으므로 오류 발생 한다.
			// 즉, 변수에 저장할 때는 결과값으로 저장 유무를 결정한다.
			// b1 = 120 + 9;
			
			// short : -32,768 ~ 32,767
			// byte 처럼 결과값이 범위를 넘으면 사용 불가
			
			// int : 기본적으로 정수를 사용할 때 호출하는 자료형
	        int su = 35 ;
	        System.out.println(su);
	        
	        // long : 정수 중에 가장 큰 범위를 가지고 있음
	        //        즉, 큰 정수를 사용할때 호출하는 자료형 
	        //        숫자 뒤에 L 또는 l 를 붙인다. (생략가능)
	        long num = 32L ;
	        long num2 = -3514L;
	        long num3 = 32145l;
	        long num4 = -56212l;
	        System.out.println(num);
			
			
		}
	}


	package com.ict.day02;

	public class Ex04 {
		public static void main(String[] args) {
			// 실수 : 소숫점이 있는 숫자
			//      float < double
			// 실수의 기본은 double 
			
			// float는 숫자 뒤에 반드시 F 나 f를 붙인다.
			
			// 줄단위 복사 : 해당 위치에서 ctrl + alt + 아래 방향키
			// 줄 이동  : 해당 위치에서 alt + 위/아래 방향키
			float f1 = 3.14F ;
			System.out.println(f1);
			
			float f2 = -25.0f;
			System.out.println(f2);
			
			// 숫자뒤에 F 또는 f 를 붙이지 않으면 오류
			// float f3 = 45.4;
			
			double d1 = 3.14 ;
			System.out.println(d1);
			
			// 중요)float나 double은 부동소숫점으로 값을 표현하므로 소수점 이하의값이 정확하게 표현이 안되는 오류가 발생
			// 해결)나중에는 BigDecimal 클래스를 자료형으로 사용
			//    현재는 소수점이하 몇 자리 버림, 올림, 반올림을 이용하자.
			
			
		}
	}
	package com.ict.day02;

	public class Ex05 {
		public static void main(String[] args) {
			// 크기 비교 ( boolean 만 제외)
			//  byte < short < char < int < long <  float <  double
			
			// 큰자료형은 작은 자료형을 저장할 수 있다.
			// 작은자료형은 큰 자료형을 저장할 수 없다.
			
			// 데이터 100 이 int s1에 저장된다.
			int s1 = 100 ;
			
			// 변수 s1안에 있는 데이터(100)가 long s2에 저장 
			long s2 = s1 ;
			
			// 변수 s1안에 있는 데이터(100)가 double s3에 저장
			double s3 = s1 ;
			
			char s4 = 'a';
			
			int s5 = 'a';
		}
	}
	package com.ict.day02;

	public class Ex07 {
		public static void main(String[] args) {
			// String : 문자열을 처리하기 위한 클래스이다.
			//          기본 자료형은 아니다. 참조자료형(클래스를 자료형으로 사용)이다.
			//          기본 자료형 같은 사용법이다.
			//          데이터에는 반드시 "내용"(쌍따옴표) 사용
			// String 이름 = "내용" ;
			
			
			// + 연산자를 사용할 수 있다.
			// 실제로 더하는 것이 아니라 문자열과 문자열을 연결하는 역할을 한다.
			// + 연산을 하면 무조건 결과는 문자열(String)이다.
			
			String s1 = "Hello";
			
			//String s2 = 10;
			//String s3 = 3.14 ;
			//String s4 = 'a';
			
			String s5 = "a";
			
			System.out.println(s1);
			System.out.println(s5);
			
			String k1 = "1000";
			int k2 = 1000;
			System.out.println(k1+100);
			System.out.println(k2+100);
			
			// 문자열에 + 연산자를 사용하면 무조건 결과는 String이다. 
			// int k3 = 105 + "105";
			String k4 = 105 + "105";
			
			int su1 = 20 ;
			int su2 = 4 ;
			System.out.println(su1+su2);
			System.out.println("합계 : " + su1+su2);
			System.out.println("합계 : " + (su1+su2));
			
		}
	}




	package com.ict.day02;

	public class Ex06 {
		public static void main(String[] args) {
			// 형 변환 : 자동 형 변환, 강제 형 변환
			// 자동 형 변환 = 프로모션 : 작은 자료형이 큰 자료형을 변환하는 것 (저장하는 것)
			
			int s1 = 10 ;
			System.out.println(s1);
			long s2 = s1 ;
			System.out.println(s2);
			
			long s3 = 10 ;
			System.out.println(s3);
			
			// 강제 형변환 = 디모션 : 큰자료형이 작은 자료형으로 변환할때 오류가 발생하여서 
			//                  강제로 변경시키는 방법 (데이터가 손실될 가능성이 있다.)
			
			double d1 = 35.14 ;
			System.out.println(d1);
			
			int d2 = (int) d1 ;
			System.out.println(d2);
			
			float f1 = (float)(5426.142) ;
			System.out.println(f1);
			
			// 자동형변환
		    int k1 = 'a';
		    System.out.println(k1);
		    
		    // char가 0~65,535 사이의 값은 받을 수 있다.
		    char k2 = 105 ;
		    System.out.println(k2);
		    
		    int k3 = 105;
		    System.out.println(k3);
		    
		    char k4 = (char)(k3);
		    System.out.println(k4);
		    
		    
	  		
		}
	}


	package com.ict.day02;

	public class Ex08 {
		public static void main(String[] args) {
			// 산술연산자 : + , - , * , / 
			// 대상 : char, int, long, double, float
			//       문자형, 정수형, 실수형 
			int su1 = 9 ;
			int su2 = 4 ;
			int result = 0 ; // 결과를 저장하는 놈
			result = su1 + su2 ;
			System.out.println("결과 : " + result);
			System.out.println("결과 : 9 + 4 = " + result);
			System.out.println("결과 : su1 + su2 = " + result);
			// ** 데이터를 직접 출력하거나 호출 하지 말고 변수를 이용해서 출력하거나 호출 하자.
			System.out.println("결과 : "+su1 + "+" + su2 + "=" + result);
			
			result = su1 - su2 ;
			System.out.println("결과 : "+su1 + "-" + su2 + "=" + result);
			
			result = su1 * su2 ;
			System.out.println("결과 : "+su1 + "*" + su2 + "=" + result);
			
			// 정수 와 정수가 산술연산을 하면 결과는 정수가 된다.
			result = su1 / su2 ;
			System.out.println("결과 : "+su1 + "/" + su2 + "=" + result);
			
			double result2 = su1 / su2 ;
			System.out.println("결과 : "+su1 + "/" + su2 + "=" + result2);
			
			// 정수와 실수가 산술연산을 하면 결과는 실수가 된다
			double result3 = su1 / (su2 * 1.0) ;
			System.out.println("결과 : "+su1 + "/" + su2 + "=" + result3);
			
		}
	}
	package com.ict.day03;

	public class Ex01 {
		public static void main(String[] args) {
			// 증감 연산자 : 1 증가 또는 1 감소 하는 연산자 
			// ++(--) 변수 : 현재 변수가 가지고 있는 값에 1을 증가(감소) 하고 나머지를 실행 
			// 변수 ++(--) : 현재 변수를 가지고 실행 한 후 그 명령 구문이 끝날때 1을 증가(감소)한다.
			
			int su1 = 10 ;
			int su2 = 10 ;
			
			System.out.println(++su1 + 4);
			System.out.println(su2++ + 4);
			System.out.println(su1);
			System.out.println(su2);
		}
	}
	package com.ict.day03;

	public class Ex02 {
		public static void main(String[] args) {
			// 비교연산자 : >, <, >=, <=, ==(같다), !=(다르다, 같지않다)
			// 비교연산자를 사용할 수 있는 기본 자료형 : 문자형, 정수형, 실수형
			// 비교연산 결과는  무조건 논리형이다. 
			// 논리형(boolean)은 기본적으로 조건식에 사용된다.
			
			int su1 = 90 ;
			int su2 = 80 ;
			// 정수끼리 비교
			boolean result  = su1 > su2 ;
			System.out.println(result);
			
			double su3 = 97.4;
			double su4 = 89.0;
			
			// 실수끼리 비교
			result = su3 > su4 ;
			System.out.println(result);
			
			// 정수와실수 비교 가능
			result = su1 > su4 ;
			System.out.println(result);
			
			
			char su5 = 'a';
			char su6 = 'c';
			// 문자끼리 비교
			result = su5 > su6 ;
			System.out.println(result);
			
			// 정수 와 문자 비교
			result = su1 > su5 ;
			System.out.println(result);
		}
	}
	package com.ict.day03;

	public class Ex03 {
		public static void main(String[] args) {
			// 논리연산자 :  &&(AND, 논리곱, 교집합),  ||(OR, 논리합, 합집합),  !(NOT, 논리부정)
			// 논리연산자 대상은 boolean형(비교연산, 논리연산자, 논리형) 
			// 논리연산자의 결과는 booolean형
			
			// &&(AND, 논리곱, 교집합)
			// 주어진 조건들이 모두 참(true)일때 결과는 참(true)
			// 조건들 중에 거짓(false)이 있으면 결과는 거짓(false)
			// **거짓 이후에 연산은 하지 않는다.
			// AND  조건을 이용하면 범위를 지정할 수 있다.
			// a >= 10 && a <= 20
			// a는 10 부터 20까지의 범위를 의미한다.
			
			int su1 = 10 ;
			int su2 = 7 ;
			boolean res ;
			
			// true = true   &&    true
			res = (su1 >= 7) && (su2 >=5);
			System.out.println(res);
		    // false = true   &&  false	
			res = (su1 >= 7) && (su2 <=5);
			System.out.println(res);
			// false = false   &&  true	
			res = (su1 <= 7) && (su2 >=5);
			System.out.println(res);
			// false = false   &&  false	
			res = (su1 <= 7) && (su2 <=5);
			System.out.println(res);
			
			System.out.println();
			
			// int su1 = 10 , int su2 = 7 
			res = ((su1 = su1 + 2) > su2 ) && (su1 == (su2=su2 + 5));
			System.out.println("결과 : " + res);
			System.out.println("su1 : " + su1);
			System.out.println("su2 : " + su2);
			System.out.println();
			
			su1 = 10 ;
			su2 = 7 ;
			res = ((su1 = su1 + 2) < su2 ) && (su1 == (su2=su2 + 5));
			System.out.println("결과 : " + res);
			System.out.println("su1 : " + su1);
			System.out.println("su2 : " + su2);
			
			int su3 = 34 ;
			// su3값은 20~30 사이의 값이다.
			res = su3 >= 20 && su3 <=30 ;
			System.out.println(res);
			
			res = su3 >= 30 && su3 <=40 ;
			System.out.println(res);
			System.out.println();

			// char c1 이 소문자 이냐?
			char c1 = 'G';
			res = c1 >='a' && c1 <='z';
			System.out.println(res);
			
			c1 = 'm';
			res = c1 >='a' && c1 <='z';
			System.out.println(res);
			
			
			
		}
	}










	package com.ict.day03;

	public class Ex04 {
		public static void main(String[] args) {
			//  || ( OR, 논리합, 합집합)
			// 주어진 조건들 중에서 하나라도 참(true)이면 결과는 참(true)
			// 참(true)을 만나면 이후 연산을 하지 않는다.
			int su1 = 10 ;
			int su2 = 7 ;
			boolean res ;
			
			// true = true   ||    true
			res = (su1 >= 7) || (su2 >=5);
			System.out.println(res);
			
			// true = true   ||    false
			res = (su1 >= 7) || (su2 <=5);
			System.out.println(res);
			
			// true = false   ||    true
			res = (su1 <= 7) || (su2 >=5);
			System.out.println(res);
			
			// false = false   ||    false
			res = (su1 <= 7) || (su2 <=5);
			System.out.println(res);
			System.out.println();
			
			su1 = 10 ;
			su2 = 7 ;
			res = ((su1 = su1 + 2) > su2) || (su2 == su2 + 5);
			System.out.println("결과 : " + res);
			System.out.println("su1 : " + su1);
			System.out.println("su2 : " + su2);
			
			// NOT (!, 논리부정)
			// 주어진 논리값을 반대로 출력
			// true => false,  false => true
			res = true;
			System.out.println(res);
			System.out.println(!res);
			System.out.println(!!res);
			System.out.println(!!!res);
		}
	}















	package com.ict.day03;

	public class Ex05 {
		public static void main(String[] args) {
			// 대입 연산자 : 특정 값이나 객체의 주소를 변수에 기억시킬 때 사용
			// ** 변수를 호출하면 변수가 가지고 있는 데이터가 나온다.
					
			// 변수 a = 데이터 b 또는 변수 b
			//  a += b =>  a = a + b ;
			//  a -= b =>  a = a - b ;
			//  a *= b =>  a = a * b;
			
			int su1 = 7 ;
			su1 += 4 ;  // su1 = su1 + 4 ;
			su1 -= 3 ;  // su1 = su1 - 3 ;
			
			
			
		}
	}
	package com.ict.day03;

	public class Ex06 {
		public static void main(String[] args) {
			// 이름이 홍길동인 사람의 점수가 
			// 국어 90, 영어 80, 수학 80 이다.
			// 총점과 평균을 구하자 
			// 출력은 이름, 총점, 평균만 출력하자 (단, 평균은 소수점 첫째자리 까지 구하자)
				
			// 입력정보
			// 이름 저장
			String name = "홍길동" ;
			// 국어 저장
			int kor = 90 ;
			// 영어 
			int eng = 80 ;
			// 수학 
			int math = 60 ;
			
			// 요구사항 (처리 = 비즈니스로직) 
			// 총점과 평균
			int sum = kor + eng + math ;
			//  정수와 실수가 산술연산하면 실수가 된다.(소수점이 있다.)
			double avg = (int)(sum / 3.0 * 10)/10.0;
			double avg2 = (int)(sum / 3.0 * 100)/100.0;
			
			// 출력
			System.out.println("이름 : " + name);
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("평균 : " + avg2);
			
			// 끝의 5를 버릴 때 
			int k1 = (198745/10) * 10 ;
			// 끝 두자리 45를 버릴 때 
			int k2 = (198745/100) * 100 ;
		 
		    System.out.println(k1);	
		    System.out.println(k2);	
		}
	}




	package com.ict.day03;

	public class Ex07 {
		public static void main(String[] args) {
			// 2시간 40분 30초를 초로 환산 하여라 (몇 초일까요?)
			int h = 2 * 60 * 60 ;
			int m = 40 *60 ;
			int s = 30 ;
			
			int total = h + m + s ;
			System.out.println("2시간 40분 30초는 " + total +"초 입니다.");
			
		}
	}
	package com.ict.day03;

	public class Ex08 {
		public static void main(String[] args) {
			// 3989초 몇시간, 몇분, 몇초일까 ?
			int total = 3989 ;
			int h = 0 ;
			int m = 0 ;
			int s = 0 ;
			int res =0 ;  // 나머지 저장 
			
			// 시간을 구하자 
			h = total /(60 * 60) ;
			res = total %(60 * 60) ;
			
			m = res/(60);
			s = res%(60);
			System.out.println(h);
			System.out.println(m);
			System.out.println(s);

		}
	}
	package com.ict.day03;

	public class Ex09 {
		public static void main(String[] args) {
			// 카페모카 6500원이다.
			// 친구와 둘이서 15000원을 내고 주문했다.
			// 잔돈은 얼마인가?(단, 부가세 10% 포함)
			
			// 입력정보
			String coff = "카페모카";
			int input  = 15000;
			int dan = 6500;
			int su = 2 ;
			
			int total = dan * su ;
			int vat = total / 10 ;
			int vat1 = (int)(total * 0.1);
			int sum = total + vat ;
			
			// 다른방법
			int sum2 = (int)(total * 1.1) ;
			int output = input - sum ;
			
			System.out.println(vat);
			System.out.println(vat1);
			System.out.println(sum);
			System.out.println(sum2);
			System.out.println("잔돈 : "+ output);
					
		}
	}
	package com.ict.day03;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		// 패키지가 java.lang에 존재하는 클래스를 사용할 때는 import를 할 필요 없다.
		// java.lang 이외에 존재하는 클래스를 사용하기 위해서 import를 해야 된다.
		// 해당 클래스의 위치를 표시하므로 해당 클래스를 사용할 수 있게 한다.

		// 키보드에 입력한 정보를 받아서 scan 변수에 저장
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");

		// .next() : 입력한 내용을 String 형으로 처리하는 메서드
		String name = scan.next();
		System.out.println("당신의 이름 : " + name);

		System.out.print("나이 : ");
		String age = scan.next();
		System.out.println("당신의 나이 : " + (age + 1));

		// .nextInt() : 입력한 내용을 int형 으로 처리하는 메서드
		System.out.print("나이2 : ");
		int age2 = scan.nextInt();
		System.out.println("당신의 나이2 : " + (age2 + 1));

		System.out.print("키 : ");
		// .nextDouble() : 입력한 내용을 double형 으로 처리하는 메서드
		double height = scan.nextDouble();
		System.out.println("당신의 키는 " + (height + 1) + "입니다.");

	}
}

package com.ict.day03;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		// 이름이 국어 , 영어 , 수학 점수를 키보드로 입력 받아서
		// 총점과 평균을 구하자
		// 출력은 이름, 총점, 평균만 출력하자 (단, 평균은 소수점 둘째자리 까지 구하자)

		// 키보드로 정보를 입력 받자
		Scanner scan = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = scan.next();

		System.out.print("국어 : ");
		int kor = scan.nextInt();

		System.out.print("영어 : ");
		int eng = scan.nextInt();

		System.out.print("수학 : ");
		int math = scan.nextInt();

		// 요구사항 구하기
		// 처리 = 비즈니스로직
		int sum = kor + eng + math;

		double avg = (int) (sum / 3.0 * 100) / 100.0;

		// 출력
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);

	}
}package com.ict.day04;

public class Ex01 {
	public static void main(String[] args) {
		// 삼항연산자
		// 형식) 자료형 변수 = (조건식) ? 참일때 실행할 문장 : 거짓일때 실행할 문장 ;

		// int k1이 홀수인지 짝수인지 판별하자
		// 힌트) 어떤 수를 2 나눈 나머지가 0이면 짝수, 1이면 홀수

		int k1 = 16;
		int res = k1 % 2;

		// 자료형 변수 = (res == 1) ? "홀수": "짝수" ;
		String result = (res == 0) ? "짝수" : "홀수";
		System.out.println(k1 + " : " + result);

		result = (k1 % 2 == 0) ? "짝수" : "홀수";
		System.out.println(k1 + " : " + result);

		// int k2가 60이상이면 합격 아니면 불합격
		int k2 = 57;
		result = (k2 >= 60) ? "합격" : "불합격";
		System.out.println(k2 + " : " + result);

		// k3가 1이면 가격에 0.1 할인(10%) 한다. (얼마에 살 수 있나)
		int k3 = 2;
		int price = 1000;
		int res2 = (k3 == 1) ? price - (int) (price * 0.1) : price;
		// 자료형 변수 = (k3 == 1) ? price - (price/10) : price ;
		// 자료형 변수 = (k3 == 1) ? (int)(price * 0.9) : price ;
		System.out.println("결과 : " + res2);

		// char k4 = 대문자인지 , 대문자가 아닌지 판별하자.
		char k4 = 'a';
		result = (k4 >= 'A' && k4 <= 'Z') ? "대문자" : "대문자아님";
		System.out.println("결과 : " + result);

		// 근무시간이 8시간 까지는 시간당 9860이고
		// 8시간 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10시간 이다.
		// 얼마를 받아야 하는가?
		int time = 10;
		int dan = 9860;
		int res3 = (time > 8) ? (int) (dan * 1.5 * (time - 8)) + (8 * dan) : time * dan;
		System.out.println("결과 : " + res3);

	}
}

package com.ict.day04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int k1 = scan.nextInt();
		// 받은 숫자가 홀수, 짝수 판별
		String result = (k1 % 2 == 0) ? "짝수" : "홀수";
		System.out.println(k1 + ":" + result);
		System.out.println();

		System.out.print("점수 : ");
		int k2 = scan.nextInt();
		// 받은 점수가 60점이상이면 합격 아니면 불합격
		String result2 = (k2 >= 60) ? "합격" : "불합격";
		System.out.println("결과 : " + result2);
	}
}package com.ict.day04;

public class Ex03 {
	public static void main(String[] args) {
		// 중첩 삼항 연산자 : 삼항 연산자 안에 삼항 연산자가 존재
		// 형식) 자료형 변수 = (조건식1) ? ((조건식2)?참일때:거짓일때): 거짓일때 실행할 문장 ;
		// **형식) 자료형 변수 = (조건식1) ? 참일때 실행할 문장: ((조건식2)?참일때:거짓일때) ;

		// int k1이 90이상이면 "A학점", 80이상이면 "B학점", 나머지는 "F학점"
		int k1 = 76;
		String result = (k1 >= 90) ? "A학점" : ((k1 >= 80) ? "B학점" : "F학점");
		System.out.println("결과 : " + result);

		// char k2가 대문자인지, 소문자 인지, 기타문자인지 판별하자
		char k2 = '1';

		String result2 = (k2 >= 'A' && k2 <= 'Z') ? "대문자" : ((k2 >= 'a' && k2 <= 'z') ? "소문자" : "기타문자");
		System.out.println("결과 : " + result2);

		// int k3가 1 또는 3 이면 남자 , 나머지 여자
		int k3 = 2;
		String result3 = (k3 == 1 || k3 == 3) ? "남자" : "여자";
		System.out.println("결과 : " + result3);

		// int k4 가 1 또는 3이면 남자, 2 또는 4이면 여자
		int k4 = 3;
		String result4 = (k4 == 1 || k4 == 3) ? "남자" : ((k4 == 2 || k4 == 4) ? "여자" : "외계인");
		System.out.println("결과 : " + result4);

		// int k5 가 1이면 1900년대 태어난 남자, 3이면 2000년대 태어난 남자
		// 2이면 1900년대 태어난 여자, 4이면 2000년대 태어난 남자
		int k5 = 8;
		String result5 = (k5 == 1 || k5 == 3) ? ((k5 == 1) ? "1900년대 태어난 남자" : "2000년대 태어난 남자")
				: ((k5 == 2 || k5 == 4) ? ((k5 == 2 ? "1900년대 태어난 여자" : "2000년대 태어난 여자")) : "외계인");
		System.out.println("결과 : " + result5);

		// 두 수 중 큰 수를 구하자
		int su1 = 4;
		int su2 = 9;
		int res = (su1 > su2) ? su1 : su2;
		System.out.println("결과 : " + res);

		int res2 = Math.max(su1, su2);

	}
}

package com.ict.day04;

public class Ex04 {
	public static void main(String[] args) {
		// 단순 if 문 : 조건이 참일때만 실행 , 거짓일 경우는 무시한다.
		// 형식) if(조건식){
		// 조건식이 참일때 실행할 문장;
		// 조건식이 참일때 실행할 문장;
		// 조건식이 참일때 실행할 문장;
		// }
		// 주의사항: 실행할 문장이 한 줄이면 {}(블록) 생략 가능

		// int k1이 60이상 합격
		int k1 = 70;
		String result = "초기값";
		if (k1 >= 60) {
			result = "합격";
		}
		System.out.println("결과 : " + result);

		// int k2가 60이상이면 합격, 60미만이면 불합격
		int k2 = 49;
		String result2 = "초기값";
		if (k2 >= 60) {
			result2 = "합격";
		}
		if (k2 < 60) {
			result2 = "불합격";
		}
		System.out.println("k2 : " + result2);

		// int k3가 60이상이면 합격, 60미만이면 불합격
		int k3 = 79;
		String result3 = "불합격";
		if (k3 >= 60) {
			result3 = "합격";
		}
		System.out.println("k3 : " + result3);

	}
}

package com.ict.day04;

public class Ex05 {
	public static void main(String[] args) {
		// if ~ else 문
		// 삼항연산자와 비슷하게 처리
		// 즉, 조건식이 참일때와 거짓일 때 각각 나눠서 처리한다.
		// 주의사항) 한줄은 블록 생략 가능
		// if(조건식){
		// 조건식이 참일 때 실행 ;
		// 조건식이 참일 때 실행 ;
		// 조건식이 참일 때 실행 ;
		// }else{
		// 조건식이 거짓일 때 실행 ;
		// 조건식이 거짓일 때 실행 ;
		// 조건식이 거짓일 때 실행 ;
		// }

		// int k1이 홀수인지 짝수인지 판별하자
		// 힌트) 어떤 수를 2 나눈 나머지가 0이면 짝수, 1이면 홀수
		int k1 = 7;
		String result = "";
		if (k1 % 2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		System.out.println("k1는 " + result + " 입니다.");

		// int k2가 60이상이면 합격 아니면 불합격
		int k2 = 47;
		String result2 = "";
		if (k2 >= 60) {
			result2 = "합격";
		} else {
			result2 = "불합격";
		}
		System.out.println("k2는 " + result2 + " 입니다.");

		// k3가 1이면 가격에 0.1 할인(10%) 한다.(얼마에 살 수 있나)
		int k3 = 0;
		int price = 1000;
		int result3 = 0;

		if (k3 == 1) {
			result3 = price - (int) (price * 0.1);
		} else {
			result3 = price;
		}
		System.out.println("k3은  " + result3 + " 입니다.");

		// char k4 = 대문자인지 , 대문자가 아닌지 판별하자.
		char k4 = 'A';
		String result4 = "";
		if (k4 >= 'A' && k4 <= 'Z') {
			result4 = "대문자";
		} else {
			result4 = "대문자 아님";
		}
		System.out.println("k4는 " + result4 + " 입니다.");

		// 근무시간이 8시간 까지는 시간당 9860이고
		// 8시간 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10시간 이다.
		// 얼마를 받아야 하는가?
		int time = 10;
		int dan = 9860;
		int pay = 0;
		int lmit = 8;
		if (time > lmit) {
			pay = (lmit * dan) + (int) ((time - lmit) * dan * 1.5);
		} else {
			pay = time * dan;
		}
		System.out.println("결과 : " + pay);

	}
}

package com.ict.day04;

public class Ex06 {
	public static void main(String[] args) {
		// 다중 if 문
		// 형식) if(조건식1){
		// 조건식1이 참일 때 실행;
		// 조건식1이 참일 때 실행;
		// }else if(조건식2){
		// 조건식1에는 거짓이면서 조건식2에는 참일때 실행 ;
		// 조건식1에는 거짓이면서 조건식2에는 참일때 실행 ;
		// }else if(조건식3){
		// 조건식1,2에는 거짓이면서 조건식3에는 참일때 실행 ;
		// 조건식1,2에는 거짓이면서 조건식3에는 참일때 실행 ;
		// }else{
		// 조건식 1,2,3 이 모든 거짓인 경우 실행 ;
		// 나머지 다
		// }

		// int k1의 점수가 90이상이면 A학점, 80이상이면 B학점, 70이상이면 C학점, 나머지 F학점
		int k1 = 91;
		String result = "";
		if (k1 >= 90) {
			result = "A학점";
		} else if (k1 >= 80) {
			result = "B학점";
		} else if (k1 >= 70) {
			result = "C학점";
		} else {
			result = "F학점";
		}
		System.out.println("학점 결과 : " + result);

		// char k2가 대문자인지, 소문자인지, 숫자인지 나머지 기타문자인지 판별
		char k2 = '*';
		String result2 = "";
		if (k2 >= 'A' && k2 <= 'Z') {
			result2 = "대문자";
		} else if (k2 >= 'a' && k2 <= 'z') {
			result2 = "소문자";
		} else if (k2 >= '0' && k2 <= '9') {
			result2 = "숫자";
		} else {
			result2 = "기타문자";
		}
		System.out.println("문자 결과 : " + result2);

		// char k3가 A 이거나 a이면 아프리카 B 이거나 b이면 브라질 C 이거나 c이면 캐나다 나머지 한국
		char k3 = 'k';
		String result3 = "";
		if (k3 == 'A' || k3 == 'a') {
			result3 = "아프리카";
		} else if (k3 == 'B' || k3 == 'b') {
			result3 = "브라질";
		} else if (k3 == 'C' || k3 == 'c') {
			result3 = "캐나다";
		} else {
			result3 = "한국";
		}
		System.out.println("문자2 결과 : " + result3);
		System.out.println();

		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000, 4이면 과일쥬스 3500이다.
		// 친구와 2잔을 10000내고 먹었다. 잔돈은 얼마인가? (단, 부가세 10% 포함, 친구와 같은 음료만 선택 가능)
		int menu = 2;
		int input = 10000;
		int su = 2;
		int dan = 0;
		int total = 0;
		int vat = 0;
		int output = 0;
		String drink = "";

		if (menu == 1) {
			drink = "카페모카";
			dan = 3500;
		} else if (menu == 2) {
			drink = "카페라떼";
			dan = 4000;
		} else if (menu == 3) {
			drink = "아메리카노";
			dan = 3000;
		} else if (menu == 4) {
			drink = "과일쥬스";
			dan = 3500;
		}
		// 단가 * 수량
		total = dan * su;
		vat = (int) (total * 0.1);
		output = input - (total + vat);
		System.out.println("지불 금액 : " + input);
		System.out.println("선택 음료 : " + drink);
		System.out.println("음료 단가 : " + dan);
		System.out.println("음료 개수 : " + su);
		System.out.println("총 금액 : " + (total + vat));
		System.out.println("잔 돈 : " + output);

	}
}

package com.ict.day04;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(">>>>>>>>>>> 메뉴 >>>>>>>>>>>");
		System.out.println(">>>   1.카페모카(3500)    >>>");
		System.out.println(">>>   2.카페라떼(4000)    >>>");
		System.out.println(">>>   3.아메리카노(3000)   >>>");
		System.out.println(">>>   4.과일쥬스(4000)    >>>");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.print("메뉴를 선택하세요  >>> ");

		System.out.print("주문 수량 >>> ");

		System.out.print("입금할 금액 >>> ");

		System.out.println("잔돈은 ????? 입니다.");
	}
}package com.ict.day05;

public class Ex01 {
	public static void main(String[] args) {
		// switch ~ case : 다중 if~else 문과 같은 조건문
		// if문 조건식 boolean 형, 즉 비교연산, 논리연산, boolean 형일때
		// switch문 인자값이 int 이하, char, String 일때 사용
		// long, 실수형일때 사용 불가
		// 형식) switch(인자값 = int, char, String){
		// case 조건값1 : 인자값과 조건값1이 같을 때 수행할 문장 ; break;
		// case 조건값2 : 인자값과 조건값2이 같을 때 수행할 문장 ;
		// 인자값과 조건값2이 같을 때 수행할 문장 ; break;
		// case 조건값3 : 인자값과 조건값3이 같을 때 수행할 문장 ; break;
		// default : 조건값1,2,3 모두 같지 않을 때 수행할 문장;
		// }
		// ** 주의사항 : break가 없으면 break를 만날때까지 모든 실행문을 실행한다.
		// break 문의 역할은 현재 실행 중인 범위({ } 블록)를 벗어나는 역할을 한다.
		// default는 생략 가능

		// int k1이 1이면 카페모카, 2이면 카페라떼, 3이면 아메리카노, 4이면 과일쥬스
		int k1 = 3;
		String result = "";
		if (k1 == 1) {
			System.out.println("카페모카");
		} else if (k1 == 2) {
			System.out.println("카페라떼");
		} else if (k1 == 3) {
			System.out.println("아메리카노");
		} else if (k1 == 4) {
			System.out.println("과일쥬스");
		}

		switch (k1) {
		case 1:
			System.out.println("카페모카");
			break;
		case 2:
			System.out.println("카페라떼");
			break;
		case 3:
			System.out.println("아메리카노");
			break;
		case 4:
			System.out.println("과일쥬스");
			break;
		}

		// char k2이 A이면 아프리카, B이면 브라질, C이면 캐나다 나머지 한국
		char k2 = 'K';
		String result2 = "";
		switch (k2) {
		case 'A':
			result2 = "아프리카";
			break;
		case 'B':
			result2 = "브라질";
			break;
		case 'C':
			result2 = "캐나다";
			break;
		default:
			result2 = "한국";
			break;
		}
		System.out.println("결과 : " + result2);

		// char k3가 A 이거나 a이면 아프리카 B 이거나 b이면 브라질 C 이거나 c이면 캐나다 나머지 한국
		char k3 = 'B';
		String result3 = "";
		switch (k3) {
		case 'A':
			result3 = "아프리카";
			break;
		case 'B':
			result3 = "브라질";
			break;
		case 'C':
			result3 = "캐나다";
			break;
		case 'a':
			result3 = "아프리카";
			break;
		case 'b':
			result3 = "브라질";
			break;
		case 'c':
			result3 = "캐나다";
			break;
		default:
			result3 = "한국";
			break;
		}
		System.out.println("결과 : " + result3);

		// char k4가 A 이거나 a이면 아프리카 B 이거나 b이면 브라질 C 이거나 c이면 캐나다 나머지 한국
		char k4 = 'B';
		String result4 = "";
		switch (k4) {
		case 'A':
		case 'a':
			result4 = "아프리카";
			break;
		case 'B':
		case 'b':
			result4 = "브라질";
			break;
		case 'C':
		case 'c':
			result4 = "캐나다";
			break;
		default:
			result4 = "한국";
			break;
		}
		System.out.println("결과 : " + result4);

		// String k5이 한국이면 서울, 중국이면 베이징, 일본이면 도쿄, 미국이면 워싱턴
		String k5 = "한국";
		String result5 = "";
		switch (k5) {
		case "한국":
			result5 = "서울";
			break;
		case "중국":
			result5 = "베이징";
			break;
		case "일본":
			result5 = "도쿄";
			break;
		case "미국":
			result5 = "워싱턴";
			break;
		}
		System.out.println("결과 : " + result5);

		// switch문 범위가 넓어지면 사용하지 말자 (if문 사용하자 )
		// int k6의 점수가 90이상이면 A, 80이상이면 B, 70이상이면 C, 나머지 F

		int k6 = 93;
		String result6 = "";
//			 switch (k6) {
//				case 100: break;
//				case 99: break;
//				case 98: break;
		//
//				default:
//					break;
//			 }

		switch ((int) (k6 / 10)) {
		case 10:
		case 9:
			result6 = "A";
			break;
		case 8:
			result6 = "B";
			break;
		case 7:
			result6 = "C";
			break;
		default:
			result6 = "F";
			break;
		}
		System.out.println("결과 : " + result6);
	}
}

package com.ict.day05;

public class Ex02 {
	public static void main(String[] args) {
		// for문 : 정해진 규칙에 따라 실행문을 반복 처리 한다.
		// 조건식이 참일때 실행, 거짓이면 실행하지 않음
		// 형식) for(초기식; 조건식; 증감식){
		// 조건식이 참일때 실행할 문장;
		// 조건식이 참일때 실행할 문장;
		// }

		// 1. for문 만나면 초기식에 간다.
		// 2. 초기식 가지고 조건식 간다.
		// 3. 조건식이 참이면 실행, 거짓이면 실행하지 않음
		// 4. 참일때 실행하다가 for문의 끝을 만나면 다시 증감식으로 간다.
		// 5. 증감식에서 증가하거나 감소 후 다시 조건식에 간다.
		// 6. 조건식이 참이면 실행, 거짓이면 실행하지 않음

		// 자바에서는 블록안에서 변수를 만들고 선언하면 해당 블록에서만 사용 가능
		// 해당 블록을 벗어나면 변수는 사라진다.
		// for문의 초기식에서 변수를 만들어 사용한다.
		// 초기식에서 만든 변수는 for문을 벗어나면 사용 못함(즉, 사라진다.)

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			System.out.println("hi");
			System.out.println("안녕하세요");
		}
		// for문에서 만든 변수는 for문 밖에서 사용 불가
		// System.out.println(i);

		int k1;
		for (k1 = 0; k1 < 10; k1++) {
			System.out.println("hi");
		}
		System.out.println(k1);
		System.out.println();

		// 10-20 출력
		System.out.println("10-20 출력");
		for (int i = 10; i < 21; i++) {
			System.out.println(i);
		}
		System.out.println("10-20 짝수만 출력");
		// 10-20 까지 짝수만 출력
		for (int i = 10; i < 21; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("10-20 홀수만 출력");
		// 10-20 까지 홀수만 출력
		for (int i = 11; i < 20; i = i + 2) {
			System.out.println(i);
		}
		System.out.println();

		System.out.println("10-20 짝수만 출력");
		for (int i = 10; i < 21; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();

		System.out.println("10-20 홀수만 출력");
		for (int i = 10; i < 21; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		System.out.println();

		// 5단 출력
		for (int i = 1; i < 10; i++) {
			System.out.println("5 * " + i + " = " + (5 * i));
		}

		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0

		// 0 0 0 0 을 하나로 보는 방법
		for (int i = 1; i < 5; i++) {
			System.out.println("0 0 0 0");
		}
		System.out.println();

		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
			// 4의 배수일때
			if (i % 4 == 0) {
				System.out.println();
			}
		}
		System.out.println();

		// 0-10 의 누적합(합계 구하기)
		int sum = 0; // 이전 값을 기억시키는 변수
		for (int i = 0; i < 11; i++) {
			sum = sum + i; // 기억값 = 이전기억값 + 현재값
		}
		System.out.println("누적합 : " + sum);

		// 0-10 홀수의 합계, 짝수의 합계를 각각 구하자
		int even = 0; // 짝수의 합계 저장
		int odd = 0; // 홀수의 합계 저장

		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				even = even + i;
			} else {
				odd = odd + i;
			}
		}
		System.out.println("짝수의 합 : " + even);
		System.out.println("홀수의 합 : " + odd);

		// 7! (7 * 6 * 5 * 4 * 3 * 2 * 1 )의 합은?
		int mul = 1;
		for (int i = 7; i > 0; i--) {
			mul = mul * i; // 누적값 = 이전값 * 현재값
		}

		// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오
	}
}

package com.ict.day05;

public class Ex03 {
	public static void main(String[] args) {
		// 중첩 for문 : for문 안에 또 다른 for문이 존재하는 것

		for (int i = 0; i < 4; i++) {
			System.out.println("명령문1");
			for (int j = 0; j < 6; j++) {
				System.out.println("i=" + i + ", j=" + j);
			}
			System.out.println("명령문2");
		}
		System.out.println();
		System.out.println("구구단-1");
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j) + "  ");
			}
		}
		System.out.println("구구단-2");
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "  ");
			}
			System.out.println();
		}
		System.out.println("구구단-3");
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "  ");
			}
			System.out.println();
		}

		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}

		// 1 0 0 0
		// 0 1 0 0
		// 0 0 1 0
		// 0 0 0 1
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}

	}
}

package com.ict.day05;

public class Ex04 {
	public static void main(String[] args) {
		// while 문 : for문과 같은 반복문
		// 형식1)
		// 초기식 또는 현재변수
		// while(조건식){
		// 조건식이 참일때 실행;
		// 조건식이 참일때 실행;
		// 증감식;
		// }
		// * while의 끝을 만나면 조건식으로 이동

		// 0-10 출력
		int k1 = 0;
		while (k1 < 11) {
			System.out.println(k1);
			k1++;
		}
		System.out.println();

		// 10-20 까지 짝수만 출력
		int k2 = 10;
		while (k2 < 21) {
			if (k2 % 2 == 0) {
				System.out.println(k2);
			}
			k2++;
		}

		// 7단 출력
		int k3 = 1;
		while (k3 < 10) {
			System.out.println(" 7 * " + k3 + "=" + (7 * k3));
			k3++;
		}

	}
}

package com.ict.day05;

public class Ex05 {
	public static void main(String[] args) {
		// while 문 : for문과 같은 반복문
		// 형식2)
		// 초기식 또는 현재변수
		// while(true){
		// if(빠져나갈 조건) break;
		// 실행할 내용 ;
		// 증감식;
		// }
		// * while의 끝을 만나면 조건식으로 이동

		// 0-10 까지 출력
		int k1 = 0;
		while (true) {
			if (k1 >= 11)
				break;
			System.out.println(k1);
			k1++;
		}
		System.out.println();

		// 10-20 까지 짝수만 출력
		int k2 = 10;
		while (true) {
			if (k2 >= 21)
				break;
			if (k2 % 2 == 0) {
				System.out.println(k2);
			}
			k2++;
		}

		// a - h 까지 출력하자
		char c1 = 'a';
		while (c1 < 'h' + 1) {
			System.out.println(c1);
			c1++;
		}

		char c2 = 'a';
		while (true) {
			if (c2 >= 'h' + 1)
				break;
			System.out.println(c2);
			c2++;
		}
	}
}

package com.ict.day05;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("숫자 입력 : ");
			int su = scan.nextInt();
			String result = "";
			if (su % 2 == 0) {
				result = "짝수";
			} else {
				result = "홀수";
			}
			System.out.println(su + "는 " + result + "입니다.");

			System.out.print("계속할까요? (1.yes, 2.no)  >> ");
			int res = scan.nextInt();
			if (res == 2)
				break;

		}
	}
}package com.ict.day06;

public class Ex01 {
	public static void main(String[] args) {
		// do ~ while문 : while문과 같은 반복문 (선 처리 후비교)
		// 형식) 초기식 ;
		// do{
		// 참일때 실행할 문장;
		// 참일때 실행할 문장;
		// 참일때 실행할 문장;
		// 증감식
		// } while(조건식);

		// 0-10까지 출력
		int k1 = 0;
		do {
			System.out.println(k1);
			k1++;
		} while (k1 < 11);
		System.out.println();

		// 0-10 짝수만 출력
		int k2 = 0;
		do {
			if (k2 % 2 == 0) {
				System.out.println(k2);
			}
			k2++;
		} while (k2 < 11);
	}
}package com.ict.day06;

public class Ex02 {
	public static void main(String[] args) {
		// break 와 continue
		// break: 현재 위치의 블록(for,while,switch)을 탈출할때 사용하는 예약어
		// continue : continue 문 이하 수행문을 포기하고 다음회차로 진행하는 예약어
		// for문인 경우는 증감식으로 이동, while문인 경우는 조건식으로 이동
		// 보통 if문과 함께 사용한다.

		// 1-10까지 출력
		for (int i = 1; i < 11; i++) {
			// 이스케이프문자(제어문자)
			// \n => 줄바꿈, \t => 탭, \' => ' , \" => "
			System.out.print(i + " ");
		}
		System.out.println();

		// 1-10까지 출력 6에서 break 사용
		for (int i = 1; i < 11; i++) {
			if (i == 6)
				break;
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if (i == 6)
				break;
		}
		System.out.println();

		// 1-10까지 출력 6에서 continue 사용
		for (int i = 1; i < 11; i++) {
			if (i == 6)
				continue;
			System.out.print(i + " ");
		}
		System.out.println();

		// 의미없음
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if (i == 6)
				continue;
		}
		System.out.println();

		// 1-10까지 짝수만 출력하자 (continue 이용)
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 1)
				continue;
			System.out.print(i + " ");
		}
		System.out.println();

	}
}

package com.ict.day06;

public class Ex03 {
	public static void main(String[] args) {
		// 다중 for문에서 break와 continue
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (i == 2)
					break;
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println();
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (j == 3)
					break;
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println();

		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (i == 2)
					continue;
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println();
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (j == 3)
					continue;
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println();

	}
}package com.ict.day06;

public class Ex04 {
	public static void main(String[] args) {
		// break와 break label
		// break : 현재 위치의 블록을 탈출
		// break label : 레이블이 지정한 블록을 탈출

		// 레이블지정 : 반복문 앞에 '이름' 붙이면 된다.

		// 1-10 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 1-10 출력 (break)
		for (int i = 1; i < 11; i++) {
			if (i == 6)
				break;
			System.out.print(i + " ");
		}
		System.out.println();

		// 1-10 출력 (break label)
		// 반복문 앞에 label이름뒤 : 붙인다.
		// for문에는 break label를 붙일 이유가 없다.
		exit: for (int i = 1; i < 11; i++) {
			if (i == 6)
				break exit;
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("다중 for문 break label 사용하기 ");

		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println();

		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (i == 2)
					break;
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println();

		exit: for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (i == 2)
					break exit;
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println();

	}
}

package com.ict.day06;

public class Ex05 {
	public static void main(String[] args) {
		// continue와 continue label
		// continue : continue 이하 수행문을 포기하고 해당 for문의 증감식으로 이동
		// continue label :continue 이하 수행문을 포기하고, 레이블이 있는 반복문의 증감식으로 이동

		// 1-10까지 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 1; i < 11; i++) {
			if (i == 6)
				continue;
			System.out.print(i + " ");
		}
		System.out.println();

		esc: for (int i = 1; i < 11; i++) {
			if (i == 6)
				continue esc;
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("다중 for문에서 continue label 사용");

		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println();

		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (i == 2)
					continue;
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println();

		esc: for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (i == 2)
					continue esc;
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println();

	}
}

package com.ict.day06;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		esc: while (true) {
			// 숫자를 받아서 홀수인지, 짝수인지 출력하자
			System.out.print("숫자 입력 : ");
			int su = scan.nextInt();
			String res = "";
			if (su % 2 == 0) {
				res = "짝수";
			} else {
				res = "홀수";
			}
			System.out.println(su + "는 " + res + "입니다.");

			while (true) {
				System.out.print("계속할까요?(1.yes, 2.no) >> ");
				int result = scan.nextInt();
				if (result == 1)
					continue esc;
				if (result == 2)
					break esc;

				System.out.println("제대로 입력하세요");
			} // 안쪽 while
		} // 밖 while
		System.out.println("수고하셨습니다.");

	}
}

package com.ict.day06;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 전체횟수, 짝수횟수, 퍼센트(소수점 첫째자리까지)
		int count = 0; // 전체 횟수
		int even = 0; // 짝수 횟수
		esc: while (true) {
			count++;
			System.out.print("숫자 입력 : ");
			int su = scan.nextInt();
			String result = "";
			if (su % 2 == 0) {
				even++;
				result = "짝수";
			} else {
				result = "홀수";
			}
			System.out.println(su + "는 " + result + " 입니다.");
			while (true) {
				System.out.print("계속할까요?(1.yes, 2.no) >> ");
				int res = scan.nextInt();
				if (res == 1)
					continue esc;
				if (res == 2)
					break esc;

				System.out.println("제대로 입력하세요");
			} // 안 while
		} // 밖 while
		System.out.println("수고 하셨습니다.");
		double per = (even / (count * 1.0)) * 100;

		System.out.println("전체 횟수 : " + count);
		System.out.println("짝수 횟수 : " + even);
		System.out.println("퍼센트 : " + ((int) (per * 100) / 100.0) + "%");

	}
}

package com.ict.day06;

public class Ex08 {
	public static void main(String[] args) {
		String str = "ICT 인재개발원 5강의장";

		// 1.charAt(int index) : char
		// 위치정보(index, 0부터 시작)가 숫자로 들어오면 해당 위치에 존재하는 문자을 반환한다.

		char c1 = str.charAt(7);
		System.out.println(c1);

		str = "대한민국 I Love You 1004 ♥";
		// str의 모든 글자를 대문자를 만들자 (소문자는 대문자에 -32)

		// 해당 문자의 위치정보를 가지고 하나씩 꺼내서 검사 할 수 있다.
		for (int i = 0; i < str.length(); i++) {
			char c2 = str.charAt(i);
			if (c2 >= 'a' && c2 <= 'z') {
				c2 = (char) (c2 - 32);
			}
			System.out.print(c2);
		}
		System.out.println();

		// 2.concat(String str) : String
		// 입력된 문자열을 현재문자열과 합친다. ("문자열" + "문자열" 과 같은 결과)
		String s1 = "대한민국";
		String s2 = s1.concat("KOREA");
		System.out.println(s2);

		String s3 = " KOREA";
		String s4 = s1.concat(s3);
		System.out.println(s4);

		// 3.contains(CharSequence s) : boolean
		// CharSequence는 char 값를 순서대로 읽을 수 있다.
		// 지금은 String 이라고 생각하자.
		// String을 넣어주면 해당 문자열에 입력된 String이 존재하면 true, 존재하지 않으면 fasle

		String s5 = "nojm73@gmail.com";
		boolean res = s5.contains("@");
		// boolean res = s5.contains('@'); // char는 사용 못함
		System.out.println("res = " + res);
		System.out.println("결과 = " + s5.contains(".com"));
		System.out.println("결과 = " + s5.contains(".COM")); // 대소문자 구분한다.

		// 4. equals(Object anObject) : boolean
		// 입력된 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자 구별한다.)
		// 5. equalsIgnoreCase(String anotherString) : boolean
		// 입력된 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자 구별 안한다.)
		// ** 문자열과 문자열을 같다고 비교할때는 == 를 사용하지 않다.

		String s6 = "Korea";
		String s7 = "KOREA";

		if (s6.equals(s7)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}

		if (s6.equalsIgnoreCase(s7)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}

		// 6. format(String format, Object... args) : static String
		// 형식을 지정하고 형식에 맞춰서 문자열 생성
		String s8 = "한국 ICT 인재 개발원";

		// %s 문자열
		String s9 = String.format("@@ %s !! 화이팅", s8);
		System.out.println(s9);

		// %30s 30자리 차지하는 문자열 (남은 자리는 비워둔다.) 오른쪽 정렬
		String s10 = String.format("%30s", s8);
		System.out.println(s10);

		// -는 왼쪽 정렬이 된다.
		String s11 = String.format("%-30s", s8);
		System.out.println(s11);

		String s12 = String.format("%6s !!", s8);
		System.out.println(s12);

		// %d 정수형식
		int k1 = 2134;
		String s13 = String.format("%d &&", k1);
		System.out.println(s13);

		String s14 = String.format("%5d @@", k1);
		System.out.println(s14);

		String s15 = String.format("%-5d @@", k1);
		System.out.println(s15);

		// %f 실수형식 지정
		double s16 = 123.445678;
		String s17 = String.format("%f", s16);
		System.out.println(s17);

		String s18 = String.format("%.1f", s16);
		System.out.println(s18);

		String s19 = String.format("%.4f", s16);
		System.out.println(s19);

		// 7. getBytes() : byte[]
		// 해당 문자열을 byte[]로 변환 시킨다.
		// 보통 입/출력할 때 사용한다. ( 대소문자, 숫자 가능, 영어이외에 글자는 안됨)
		// 나중에 [] 배열을 배운 후에 한다.

		// 8. indexOf(int ch), indexOf(String str) : int
		// 입력된 문자(ch), 문자열(str)의 위치값을 알려준다.
		// 문자나 문자열이 없으면 -1 반환

		String h1 = "BufferedReader";
		int h2 = h1.indexOf('R');
		System.out.println(h2);

		h2 = h1.indexOf("er");
		System.out.println(h2);

		h2 = h1.indexOf("err");
		System.out.println(h2);

		// 9. indexOf(int ch, int fromIndex), indexOf(String str, int fromIndex) : int
		// fromIndex는 시작 위치를 말한다.
		// 2번째 , 3번째 문자나 글자를 찾기 위함

		// 두번째 e를 찾아라 ( 우선, 첫번째 e를 찾아라 )
		int h3 = h1.indexOf('e'); // 4
		System.out.println(h3);

		int h4 = h1.indexOf('e', h3 + 1);
		System.out.println(h4);

		// 10. lastIndexOf(int ch), lastIndexOf(String str) : int
		// 마지막 문자나 문자열을 찾을 때 사용
		int h5 = h1.lastIndexOf('e');
		System.out.println(h5);

		// 11. length() : int
		// 문자열의 길이를 구한다. (1 부터 시작한다.)

		String str1 = "Hello";
		System.out.println("길이 : " + str1.length());

		// 12. replace(char oldChar, char newChar) : String
		// replace(CharSequence target, CharSequence replacement) : String
		// 지금은 replace(String oldString, String newString) : String : String
		// 새로운 문자나 문자열을 받아서 치환(바꾸기)한다.

		String str2 = "대한민국";
		String str3 = str2.replace('민', '民');
		System.out.println(str3);

		String str4 = str2.replace("민", "민 ♥ ");
		System.out.println(str4);

		// 13. isEmpty() : boolean
		// 해당 문자열이 비어 있으면 true, 내용이 있으면 false;
		String str5 = "대한민국";
		System.out.println(str5.isEmpty());

		String str6 = "";
		System.out.println(str6.isEmpty());

		// 오류발생 : Exception
		// String str7 = null;
		// System.out.println(str7.isEmpty());

		// 14. split(String regex) : String[]
		// split(String regex, int limit) : String[]
		// 배열 배운 이후에 나중에 한다.

		// 15. substring(int beginIndex) : String
		// 입력된 시작위치 부터 끝까지 문자열 추출

		// substring(int beginIndex, int endIndex) : String
		// 입력된 시작위치 부터 입력된 끝위치 전까지 문자열 추출(끝위치는 포함하지 않는다.)
		// endIndex - beginIndex = 추출할 문자의 갯수

		String t1 = "010-9732-9110";
		String t2 = t1.substring(4);
		System.out.println(t2); // 9732-9110

		t2 = t1.substring(9);
		System.out.println(t2); // 9110
		t2 = t1.substring(t1.lastIndexOf('-') + 1);
		System.out.println(t2); // 9110

		String t3 = t1.substring(4, 8);
		System.out.println(t3);

		// 010-7777-9999 => 010-7777-****, 010-****-9999
		String t4 = "010-6787-9110";
		String t5 = "****";
		System.out.println(t4.replace(t4.substring(9), t5));
		System.out.println(t4.replace(t4.substring(4, 8), t5));

		// 16. toLowerCase() : String => 해당 문자열을 모두 소문자로 변경
		// 17. toUpperCase() : String => 해당 문자열 모두 대문자로 변경

		String t6 = "대한민국 I Love You @ 1004";
		System.out.println(t6.toLowerCase());
		System.out.println(t6.toUpperCase());

		// 18. toString : String
		// 모든 클래스의 toString : 모든 객체(클래스)에서 사용가능.
		// 객체(클래스)가 가지고 있는 정보나 값(데이터)들을
		// 문자열로 만들어서 반환하는 메서드
		// String 의 toString은 문자열 자체를 반환
		String t7 = "java 17 자바 17";
		String t8 = t7.toString();
		System.out.println(t7);
		System.out.println(t8);

		// 19. trim() : String
		// 해당 문자열의 앞, 뒤, 공백 제거, 중간 공백은 제거하지 않는다.
		String t9 = "  java 자바 JAVA  ";
		String t10 = t9.trim(); // "java 자바 JAVA"

		System.out.println(t9);
		System.out.println(t9.length());
		System.out.println(t10);
		System.out.println(t10.length());

		// 20. startsWith(String prefix) : boolean => 주어진 문자열로 시작하는지 검색
		// startsWith(String prefix, int toffset) : boolean => 주어진 문자열로 시작하는지 검색
		// toffset = > 시작 위치
		// endsWith(String suffix) : boolean => 주어진 문자열로 끝나는지 검색

		boolean b1 = t10.startsWith("java"); // true
		System.out.println(b1);

		boolean b2 = t10.startsWith("JAVA"); // false
		System.out.println(b2);

		boolean b3 = t10.startsWith("자바", 5);
		System.out.println(b3);

		boolean b4 = t10.endsWith("JAVA"); // true
		System.out.println(b4);
		System.out.println();

		// 21. valueOf(기본자료형) : static String
		// 어떤 기본 자료형이든지 String으로 변경 시킴 ( 기본자료형 + "")
		boolean bo1 = true;
		char ch1 = 'c';
		int num1 = 34;
		long num2 = 37L;
		float num3 = 3.1572f;
		double num4 = 3654.1241;

		// 자료형 + 1 = 실제로 덧셈을 한다.
		// System.out.println(bo1+1);
		System.out.println(ch1 + 1);
		System.out.println((char) (ch1 + 1));
		System.out.println(num1 + 1);
		System.out.println(num2 + 1);
		System.out.println(num3 + 1);
		System.out.println(num4 + 1);

		System.out.println(String.valueOf(bo1) + 1);
		System.out.println(String.valueOf(ch1) + 1);
		System.out.println(String.valueOf(num1) + 1);
		System.out.println(String.valueOf(num2) + 1);
		System.out.println(String.valueOf(num3) + 1);
		System.out.println(String.valueOf(num4) + 1);

		System.out.println();
		System.out.println(bo1 + "1");
		System.out.println(ch1 + "1");
		System.out.println(num1 + "1");
		System.out.println(num2 + "1");
		System.out.println(num3 + "1");
		System.out.println(num4 + "1");

		// 22. Wrapper 클래스
		// 기본 자료형의 형태를 가진 문자열을 해당 자료형으로 변경 시키는 클래스들
		// 기본 자료형을 객체로 만들 때 사용하는 클래스

		// 22-1. "true", "false" 문자열을 기본자료형인 boolean형으로 변경 : Boolean.parseBoolean(String
		// s);
		// "true", "false" => true, false
		// "true"를 제외한 문자열이면 => false

		String msg = "true";
		boolean msg2 = Boolean.parseBoolean(msg); // "true" => true
		System.out.println(msg + 1);
		// 실제 boolean형으로 변경했으므로 덧셈 계산을 할 수 없다.
		// System.out.println(msg2 + 1); //

		msg2 = Boolean.parseBoolean("가나다");
		System.out.println(msg2);

		// 22-2. "10", "124" 문자열을 기본자료형 int 형으로 변경 : Integer.parseInt(String s);
		msg = "124";
		int msg3 = Integer.parseInt(msg);
		System.out.println(msg + 10); // 12410
		System.out.println(msg3 + 10); // 134

		// 22-3. 문자열을 기본자료형인 long형으로 변경 : Long.parseLong();
		// "숫자" => OK, "숫자L" => err

		msg = "12345612312";
		// int 형의 범위를 벗어나서 L를 붙어야 한다.
		long msg4 = 12345612312L;
		// long msg5 = 1234L;
		// long msg6 = 1234;

		long msg5 = Long.parseLong(msg);
		System.out.println(msg5 + 1);

		// 22-3. 문자열을 float로 변경 : Float.parseFloat();
		// "숫자f" => ok;
		// 되도록 이면 double ,
		msg = "32.14f";
		float msg6 = Float.parseFloat(msg);
		System.out.println(msg6 + 10);

		// 22-4. 문자열을 double 변경 : Double.parseDouble();
		msg = "3.17598";
		double msg7 = Double.parseDouble(msg);
		System.out.println(msg7 + 10);

		// 22-5. Character.parseCharacter() 는 존재 하지 않는다.
		// 즉 문자열을 char로 변경하는 클래스는 존재하지 않는다.
		// 그러나, String의 charAt() 사용하면 char로 만들수 있다.
		msg = "A";
		char msg8 = msg.charAt(0);
		System.out.println(msg + 1); // A1
		System.out.println(msg8 + 1); //
		System.out.println((char) (msg8 + 1)); //

		// 23. 배열을 배우 후 하자
		// String.getBytes() : byte[]
		// String.toCharArray() : char[]
		// split(String regex) : String[]
		// split(String regex, int limit) : String[]
	}
}

package com.ict.day07;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		esc: while (true) {
			System.out.print("숫자 입력 : ");
			String su = scan.next();
			// 숫자가 아니 것을 넣으면 오류 발생 (나중에 try ~ catch 처리)
			int s1 = Integer.parseInt(su);

			String res = "";
			if (s1 % 2 == 0) {
				res = "짝수";
			} else {
				res = "홀수";
			}
			System.out.println(su + "는 " + res + "입니다.");

			while (true) {
				System.out.println("계속할까요(y/n)");
				String msg = scan.next();
				// String에서는 같다를 == 사용하면 안됨
				// equals() => 대소문자를 구별,
				// equalsIgnoreCase() => 대소문자를 구별하지 않음
				if (msg.equalsIgnoreCase("y")) {
					continue esc;
				}
				if (msg.equalsIgnoreCase("n")) {
					break esc;
				}
				System.out.println("제대로 입력하세요");
			} // 안 while
		} // 밖 while
		System.out.println("수고하셨습니다.");

	}
}

package com.ict.day07;

public class Ex02 {
	public static void main(String[] args) {
		// 배열 : 같은 자료형의 데이터들을 한 곳에 모아둔 묶음
		// ** 같은 자료형이어야 한다.
		// 생성할 때 크기를 지정해야 된다. (지정하지 않으면 생성 안됨)
		// 한번 지정한 크기는 변경이 안됨
		// 배열 안에 데이터를 가져오기 위해서는 일반적으로 for문을 사용

		// 배열 생성 순서 : 선언 => 생성 => 초기화(데이터 저장)
		// 1. 선언 : 자료형 이름[]; 또는 자료형[] 이름;
		int su[]; // int[] su;

		// 2. 생성 : 이름 = new 자료형[배열크기=갯수]
		// new 예약어 : 메모리에 데이터를 저장할 공간를 만들어달라
		// => 인스턴스, 객체생성
		su = new int[4];

		// 3. 데이터 저장 : 이름[index = 위치값 = 0부터시작]
		// 데이터는 같은 자료형이어야 한다.(프로모션 가능 : 작은자료형이 큰자료형으로 변경)

		su[0] = 100;
		su[1] = 'a'; // 프로모션
		// su[2] = 3.14 ;
		su[2] = (int) (3.14); // 디모션
		su[3] = 100;

		su[2] = 107;

		// 배열 크기보다 크면
		// su[4] = 107 ; //실행 하면 오류 발생 (run time 오류)

		// 배열 호출 하면 주소(생성ID)가 출력
		System.out.println(su);
		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		System.out.println(su[3]);
		System.out.println();

		// 배열의 출력할때는 보통 for문 사용
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
	}
}

package com.ict.day07;

public class Ex03 {
	public static void main(String[] args) {
		// 선언
		// char[] ch;

		// 생성
		// ch = new char[4];

		// 선언과 생성을 한번에
		char[] ch = new char[4];
		// 초기값 넣기
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 65; // 0-65535 까지는 가능

		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}

		// 선언과 생성과 초기값 넣기를 한번에
		char[] ch2 = { 'j', 'a', 'v', 97 };
		int[] k2 = { 100, 200, 300, 'a' };
		double[] d2 = { 7.15, 7.16, 7.0, 7 };
		// 자료형 클래스 이므로 참조자료형 배열 (객체형 배열)
		String[] s1 = { "홍길동", "이길동", "고길동", "박길동" };

		for (int i = 0; i < ch2.length; i++) {
			System.out.println(ch2[i]);
		}

	}
}

package com.ict.day07;

import java.util.Arrays;
import java.util.Collections;

public class Ex04 {
	public static void main(String[] args) {
		// Arrays 클래스 : 배열을 다루기 위한 다양한 메서드가 포함 되어 있는 클래스

		int[] arr = new int[100];
		// 초기화
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 5;
			System.out.println("arr[" + i + "] = " + (i * 5));
		}
		// binarySearch(배열,찾을값) : 해당 배열에서 값을 검색 한 후 에 있는 위치 값을 반환
		int res = Arrays.binarySearch(arr, 10);
		System.out.println("결과 : " + res);

		// copyOf(배열, 새로만든 배열의길이 );
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = Arrays.copyOf(arr1, 3);

		System.out.println("arr2");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();

		int[] arr3 = Arrays.copyOf(arr1, 10);
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		System.out.println();

		// copyOfRange("배열", 시작위치, 끝위치(포함안함))
		int[] arr4 = Arrays.copyOfRange(arr1, 2, 4);
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}

		System.out.println();

		// fill(배열, 초기값) : 해방 배열의 초기값을 지정
		int[] arr5 = new int[10];
		Arrays.fill(arr5, 3);
		for (int i = 0; i < arr5.length; i++) {
			System.out.println(arr5[i]);
		}
		System.out.println();

		// sort(배열) : 해당 배열을 오름차순 정렬
		int[] arr6 = { 7, 4, 3, 1, 5, 6, 2 };
		Arrays.sort(arr6);
		System.out.println("arr6 오름차순");
		for (int i = 0; i < arr6.length; i++) {
			System.out.println(arr6[i]);
		}
		System.out.println();

		// 오름차순 후 끝에서부터 가져오기
		System.out.println("오름차순을 내림차순으로 출력");
		for (int i = arr6.length - 1; i >= 0; i--) {
			System.out.println(arr6[i]);
		}

		System.out.println("Collections 사용해서 내림차순 만듦");
		// 내림차순
		// ** 주의사항 : int 자료형 => Integer 클래스
		Integer[] arr7 = { 7, 4, 3, 1, 5, 6, 2 };
		Arrays.sort(arr7, Collections.reverseOrder());
		for (int i = 0; i < arr7.length; i++) {
			System.out.println(arr7[i]);
		}

		System.out.println("문자열 정렬 : 숫자, 키보드특수, 대문자, 소문자, 한글");
		String[] arr8 = { "Mango", "Apple", "apple", "7", "mango", "1", "banana", "Banana", "@", "가나다", "나바사" };
		Arrays.sort(arr8);
		for (int i = 0; i < arr8.length; i++) {
			System.out.println(arr8[i]);
		}

		// Arrays.asList() : 배열을 리스트라는 컬렉션으로 변경할 때 사용
		// List의 toArray() : 리스트를 배열로 변경할 때 사용

	}
}

package com.ict.day07;

import java.util.Iterator;

public class Ex05 {
	public static void main(String[] args) {
		// String 클래스
		// String.getBytes() : byte[]
		// String.toCharArray() : char[]
		// split(String regex) : String[]
		// split(String regex, int limit) : String[]

		// 1. String.getBytes() : byte[]
		// 해당 문자열을 byte[]로 변환시킨다.
		// 보통 입출력에 사용(대문자,소문자,숫자, 영어이외에는 안됨)
		String s1 = "java 대한 JAVA";
		byte[] b1 = s1.getBytes();
		for (int i = 0; i < b1.length; i++) {
			System.out.println(b1[i]);
		}
		System.out.println();

		char[] c1 = s1.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			System.out.println(c1[i]);
		}
		System.out.println();

		// 2. split(String regex) : String[]
		// split(String regex, int limit) : String[]
		// String regex => 구분자(나눌기준),
		// int limit => 나눌 배열의크기

		String s2 = "사과, 딸기 망고, 오렌지, 두리안 용과";
		String[] s3 = s2.split(",");
		for (int i = 0; i < s3.length; i++) {
			System.out.println(s3[i]);
		}
		System.out.println();

		String[] s4 = s2.split(" ");
		for (int i = 0; i < s4.length; i++) {
			System.out.println(s4[i]);
		}
		System.out.println();

		// 배열공간이 모자르면 마지막 배열공간에 나머지가 모두 들어간다.
		String[] s5 = s2.split(" ", 3);
		for (int i = 0; i < s5.length; i++) {
			System.out.println(s5[i]);
		}
		System.out.println();

		// 배열공간을 남게 지정하면 최대한 사용하고 나머지 공간은 삭제된다.
		String[] s6 = s2.split(" ", 15);
		for (int i = 0; i < s6.length; i++) {
			System.out.println(s6[i] + " 먹기");
		}

	}
}

package com.ict.day07;

public class Ex06 {
	public static void main(String[] args) {
		// 배열 정렬하기
		int[] su = { 3, 4, 9, 8, 2, 1, 7, 10, 5, 6 };
		// 자리 변경을 위한 임시 변수
		int tmp = 0;
		for (int i = 0; i < su.length - 1; i++) {
			for (int j = i + 1; j < su.length; j++) {
				// System.out.println("i=" + i +", j=" + j);
				// i > j => 오름, i < j => 내림
				if (su[i] > su[j]) {
					// 자리변경
					tmp = su[i];
					su[i] = su[j];
					su[j] = tmp;
				}

			}
		}

		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		System.out.println();
	}
}

package com.ict.day07;

public class Ex07 {
	public static void main(String[] args) {
		// 순위 구하기
		// 1. 모든 사람의 순위를 1등으로 초기값 부여
		// 2. 모든 사람과 비교해야 된다. (자기자신 제외)
		// 3. 나(i) 보다 남(j)이 크면 내 순위을 증가 시킨다.

		int[] su = { 90, 80, 70, 95, 65, 85, 75 };
		int[] rank = { 1, 1, 1, 1, 1, 1, 1 };

		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su.length; j++) {
				// 자기 자신 제외
				if (su[i] == su[j])
					continue;
				if (su[i] < su[j]) {
					rank[i]++;
				}
			}
		}

		for (int i = 0; i < rank.length; i++) {
			System.out.println(rank[i]);
		}
		System.out.println();
	}
}package com.ict.day07;

public class Ex08 {
	public static void main(String[] args) {
		String[] name = { "홍", "김", "이", "박", "고" };
		int[] kor = { 80, 90, 80, 70, 100 };
		int[] eng = { 85, 95, 95, 75, 100 };
		int[] math = { 100, 100, 80, 70, 100 };

		int[] sum = { 0, 0, 0, 0, 0 };
		// 소수점 첫째자리까지 구하자
		double[] avg = { 0.0, 0.0, 0.0, 0.0, 0.0 };
		String[] hak = { "", "", "", "", "" };
		int[] rank = { 1, 1, 1, 1, 1 };

		// 총점, 평균, 학점 구하기
		for (int i = 0; i < rank.length; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int) (sum[i] / 3.0 * 10) / 10.0;
			if (avg[i] >= 90) {
				hak[i] = "A학점";
			} else if (avg[i] >= 80) {
				hak[i] = "B학점";
			} else if (avg[i] >= 70) {
				hak[i] = "C학점";
			} else {
				hak[i] = "F학점";
			}
		}
		// 순위 구하기
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (sum[i] == sum[j])
					continue;
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}

		// 출력
		for (int i = 0; i < rank.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(hak[i] + "\t");
			System.out.print(rank[i] + "\n");
		}
	}
}

package com.ict.day07;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// String[] name = new String[5];
		String[] name = { "", "", "", "", "" };
		int[] kor = { 0, 0, 0, 0, 0 };
		int[] eng = { 0, 0, 0, 0, 0 };
		int[] math = { 0, 0, 0, 0, 0 };
		int[] sum = { 0, 0, 0, 0, 0 };
		double[] avg = { 0.0, 0.0, 0.0, 0.0, 0.0 };
		String[] hak = { "", "", "", "", "" };
		int[] rank = { 1, 1, 1, 1, 1 };

		// 입력 받기
		for (int i = 0; i < rank.length; i++) {
			System.out.print("이름 : ");
			name[i] = scan.next();

			System.out.print("국어 : ");
			kor[i] = scan.nextInt();

			System.out.print("영어 : ");
			eng[i] = scan.nextInt();

			System.out.print("수학 : ");
			math[i] = scan.nextInt();

			// 총점, 평균, 학점 구하자.
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int) (sum[i] / 3.0 * 10) / 10.0;
			if (avg[i] >= 90) {
				hak[i] = "A학점";
			} else if (avg[i] >= 80) {
				hak[i] = "B학점";
			} else if (avg[i] >= 70) {
				hak[i] = "C학점";
			} else {
				hak[i] = "F학점";
			}
		}

		// 순위는 구하자 (값이 채워진 상태에서 )
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (sum[i] == sum[j])
					continue;
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		// 출력
		System.out.println("이  름\t총  점\t평  균\t학  점\t순  위");
		for (int i = 0; i < rank.length; i++) {
			System.out.print(name[i] + " \t");
			System.out.print(sum[i] + " \t");
			System.out.print(avg[i] + " \t");
			System.out.print(hak[i] + " \t");
			System.out.print(rank[i] + " \n");
		}

	}
}

package com.ict.day07;

import java.util.Arrays;

public class Ex10 {
	public static void main(String[] args) {
		// 해당 배열에서 가장 큰 값과 가장 작은 값을 구하자
		int[] su = { -10, 0, 10, 25, -90, 95 };

		// Arrays.sort 오름차순 정렬한다.
		// 인덱스값이 0 이 가장 작은 것 , 인덱스값이 su.length-1 이 가장 큰값을 가지고 있다.
		Arrays.sort(su);

		System.out.println("가장 작은값 : " + su[0]);
		System.out.println("가장 큰값 : " + su[su.length - 1]);
	}
}package com.ict.day08;

public class Ex01 {
	public static void main(String[] args) {
		// 다차원 배열 : 1차원 배열이 여러개 모인 것
		// 종류 : 기본자료형 배열, 객체형 배열(참조자료형배열 = 클래스가 배열)
		// 고정길이 배열, 가변길이 배열
		// 고정길이 배열
		// 1. 선언 : 자료형[][] 이름; 또는 자료형 이름[][];
		int[][] su;

		// 2. 생성 : 이름 = new 자료형[1차원배열크기][1차원배열이 참조는 배열의 크기]
		su = new int[2][3];

		// 3. 데이터 저장
		su[0][0] = 10;
		su[0][1] = 20;
		su[0][2] = 30;

		su[1][0] = 100;
		su[1][1] = 200;
		su[1][2] = 300;

		// 주소확인
		System.out.println(su);
		System.out.println(su[0]);
		System.out.println(su[1]);

		// 출력
		System.out.println(su[0][0]);
		System.out.println(su[0][1]);
		System.out.println(su[0][2]);

		System.out.println(su[1][0]);
		System.out.println(su[1][1]);
		System.out.println(su[1][2]);
		System.out.println();

		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
		}

	}
}

package com.ict.day08;

public class Ex02 {
	public static void main(String[] args) {
		// 선언과 생성을 하나로
		// 자료형[][] 이름 = new 자료형[1차원배열 수][1차원배열이 참조하는 배열의 수]
		System.out.println("고정길이 일때만 사용");
		char[][] ch = new char[3][2];
		ch[0][0] = 'a';
		ch[0][1] = 'A';

		ch[1][0] = 'b';
		ch[1][1] = 'B';

		ch[2][0] = 'c';
		ch[2][1] = 'C';

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.println(ch[i][j]);
			}
		}
		System.out.println();
		System.out.println("고정길이, 가변길이 모두 사용");
		int[][] su = new int[3][2];

		int[] k1 = { 10, 20 };
		int[] k2 = { 100, 200 };
		int[] k3 = { 1000, 2000 };

		su[0] = k1;
		su[1] = k2;
		su[2] = k3;

		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
		}
		System.out.println();

		// 선언과 생성, 데이터 저장을 한번에 처리
		// int[] num = {100,200,300};
		int[][] num = { { 1, 2 }, { 10, 20 }, { 100, 200 } };

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println(num[i][j]);
			}
		}

	}
}

package com.ict.day08;

public class Ex03 {
	public static void main(String[] args) {
		// 가변길이
		// 선언 : 자료형[][] 이름; 또는 자료형 이름[][];
		int[][] su;

		// 생성 : 이름 = new 자료형[1차원배열의 수][]
		su = new int[3][];

		// 초기값 : 고정길이에 사용하는 초기값은 사용 불가 => 실행 오류 발생
//			su[0][0] = 10;
//			su[0][1] = 20;
//			
//			su[1][0] = 100;
//			su[1][1] = 200;
//			
//			su[2][0] = 1000;
//			su[2][1] = 2000;

		// 가변길이 배열은 1차원배열을 여러개 만들어서 참조하는 방법을 사용
		int[] k1 = { 10, 20 };
		int[] k2 = { 100, 200, 300, 400, 500 };
		int[] k3 = { 100, 200, 300 };

		su[0] = k1;
		su[1] = k2;
		su[2] = k3;

		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
			System.out.println();
		}

		// 선언과 생성을 한번에
		char[][] ch = new char[4][];

		char[] c1 = { 'j', 'a', 'v', 'a' };
		char[] c2 = { 'j', 's', 'p' };
		char[] c3 = { 's', 'p', 'r', 'i', 'n', 'g' };
		char[] c4 = { 'r', 'e', 'a', 'c', 't' };

		ch[0] = c1;
		ch[1] = c2;
		ch[2] = c3;
		ch[3] = c4;

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}
	}
}

package com.ict.day08;

public class Ex04 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		// 번호, 총점, 평균, 학점, 순위
		int[] p1 = { 1, 270, 90, 'A', 1 };
		int[] p2 = { 2, 210, 70, 'C', 1 };
		int[] p3 = { 3, 180, 60, 'F', 1 };
		int[] p4 = { 4, 300, 100, 'A', 1 };
		int[] p5 = { 5, 285, 90, 'A', 1 };

		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		arr[4] = p5;

		// 순위를 구해보자
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				// 각 배열의 총점을 비교하자
				if (arr[i][1] < arr[j][1]) {
					arr[i][4]++;
				}
			}
		}

		// 정렬 하기 위해 임시 배열 만들기
		int[] tmp = new int[5];

		// 정렬
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i][4] > arr[j][4]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 3) {
					System.out.print((char) (arr[i][j]) + "\t");
				} else {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}

	}
}package com.ict.day08;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 학생 수 :
		System.out.print("학생 수 : ");
		int su = scan.nextInt();
		double[][] arr = new double[su][8];

		for (int i = 0; i < arr.length; i++) {
			// 한사람의 정보를 담고 있는 배열
			double[] p = new double[8];

			System.out.print("번호 : ");
			p[0] = scan.nextInt();

			System.out.print("국어 : ");
			p[1] = scan.nextInt();

			System.out.print("영어 : ");
			p[2] = scan.nextInt();

			System.out.print("수학 : ");
			p[3] = scan.nextInt();

			p[4] = p[1] + p[2] + p[3];

			p[5] = (int) (p[4] / 3.0 * 10) / 10.0;

			if (p[5] >= 90) {
				p[6] = 'A';
			} else if (p[5] >= 80) {
				p[6] = 'B';
			} else if (p[5] >= 70) {
				p[6] = 'C';
			} else {
				p[6] = 'F';
			}
			// 순위의 초기값은 무조건 1이다.
			p[7] = 1;
			// ** 다차원배열에 넣기
			arr[i] = p;
		}
		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				if (arr[i][4] < arr[j][4]) {
					arr[i][7]++;
				}
			}
		}
		// 정렬
		// 임시저장할 배열
		double[] tmp = new double[8];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i][7] > arr[j][7]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		// 출력
		System.out.println("번호\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// 국어, 영어, 수학 출력에서 제외
				if (j == 1 || j == 2 || j == 3)
					continue;

				// 평균 이므로 double
				if (j == 5) {
					System.out.print(arr[i][j] + "\t");
					// 학점은 char
				} else if (j == 6) {
					System.out.print((char) (arr[i][j]) + "\t");
				} else {
					System.out.print((int) (arr[i][j]) + "\t");
				}
			}
			System.out.println();
		}

	}
}package com.ict.day08;

public class Ex06 {
	/*
	 * 클래스 1. 정의 : 객체(오브젝트, Object)를 만들기 위한 모든 정보를 가지고 있는 파일(설계도면 , 거푸집 등으로 표현) 2.
	 * 클래스가 가지고 있는 것 - 멤버 필드 : 데이터(변수와 상수) , 속성 - 멤버 메소드 : 기능 , 동작 - 생성자 = 클래스가 객체로
	 * 생성될때 한번 호출된다. 클래스 이름 = 파일 이름 = 저장 이름 = 생성자 이름 3. 클래스 구조 : 헤더, 멤버필드, 멤버메서드,
	 * 생성자 1) 헤더 : [접근제한자] [클래스종류] class 클래스이름{} 가) 접근제한자 : 클래스, 멤버필드, 멤버메서드, 생성자 모두
	 * 맨 앞에 사용 가능 (생략 가능) 외부에서 접근할 수 있는 권한의 단계를 말함 - public : 누구나 다 접근가능 - private :
	 * 외부에서는 절대 접근 불가, 내부멤버(클래스안에 있는 멤버필드와 메서드)끼는 접근가능 - 생략(default) : 같은 패키지에서만 접근
	 * 가능 - protected : 같은패키지에서 접근 가능, 다른패키지일 때는 상속관계에서만 가능 나) 클래스종류 : 일반적인 클래스는
	 * 생략한다. 특정 클래스에 해당하는 클래스에게만 예약어를 사용( final, abstract,...) 다) class : 클래스임을 나타내는
	 * 예약어 라) 클래스이름 : 클래스 이름 = 파일 이름 = 저장 이름 = 생성자 이름 첫글자는 대문자, 두 단어 이상일때는 단어 첫글자들은
	 * 대문자 숫자는 중간이나 뒤에 사용, 공백문자 사용 불가 4. 멤버필드 : 데이터, 속성, 상태값, 특징 1) 변수 : 언제든지 변할 수
	 * 있는 속성, 상태값, 데이터 2) 상수 : 한번 지정하면 절대로 변경할 수 없는 데이터, 속성, 상태값 5. 멤버메서드 : 동작, 기능 -
	 * 해당 메서드를 호출하면 해당 메서드 안에 존재한 **내용이 실행된다. - 내용이 실행 된 후 **내용이 끝나면 호출한 곳으로 되돌아 간다.
	 * - 메서드가 다른 메서드를 호출할 수 있다.
	 * 
	 * 1)메서드 구성 [접근제한자][메서드종류] 반환형 메서드이름([인자 또는 매개변수]){ 실행내용 } 가) 접근제한자는 클래스 설명에서의
	 * 접근제한자와 같다 나) 메서드 종류 : 일반적인 메서드는 이 부분 생략한다. 특정메서드 일때 해당 예약어 사용 (static 예약어) 다)
	 * 반환형 : 해당 메서드가 실행이 끝나면 호출한 곳으로 되돌아 간다. 되돌아 갈때 정보를 가지고 갈 수 있는데 이때 이 정보의 자료형을
	 * 말한다. 만약에 정보를 가지고 가지 않을 때는 void라는 예약어를 사용한다.
	 * 
	 * // 메인 메서드 : 해당 메서드를 실행한 후에 호출한 JVM 에게는 되돌아 가는데 아무것도 가져가지 않는다. public static
	 * void main(String[] args) { 라) 메서드이름 : 첫글자 소문자, 두 단어이상 일때는 단어 첫 글자들은 대문자
	 * ([인자=매개변수])앞에 이름 붙는다. 마) 인자 = 매개변수 : 메서드가 실행할 때 필요한 정보를 외부에서 받기 위한 통로 메서드이름이
	 * 같아도 인자 수나 인자 자료형이 다른 다른 메서드 취급한다. 오버로딩(중복정의) : 클래스 안에 같은 이름을 가진 메서드가 여러개 정의
	 * 되어 있는 것 6. 생성자 : 클래스가 객체로 만들어질때 한번 호출된다. 1) 목적 : 멤버필드(변수,상수)의 초기값을 지정하는 것이 목적
	 * 2) 형식 : 클래스이름과 생성자 이름은 같다. 메서드와 다른점은 반환형이 없다. [접근제한자] 생성자이름(=클래스이름)([인자]){
	 * 실행내용 } public class Ex06 이때 생성자는 [접근제한자]Ex06([인자]){} 인자가 없는 생성자를 "기본생성자"라고
	 * 한다. => Ex06(){} 생성자도 오버로딩이 가능하다. 즉, 하나의 클래스안에 여러개의 생성자가 존재할 수 있다. 3) 생성자 없이
	 * 클래스를 객체로 생성하면 기본생성자를 호출해서 객체를 만든다. 4) 모든 클래스는 생성자를 가지고 있다.
	 * 
	 * 5) 클래스를 이용해서 객체를 만드는 방법 Scanner scan = new Scanner(System.in); 클래스 참조변수 = 객체를
	 * 만들기위한 예약어 생성자
	 * 
	 * new 예약어를 사용하면 무조건 heap 메모리에 사용영역을 만든다. 즉, 인스턴스, 객체 생성을 의미한다.
	 * 
	 * 7. 클래스를 객체로 만든 후 멤버필드와 멤버 메서드에 접근하는 방법 : 참조변수.멤버필드 , 참조변수.멤버메서드() (단, 접근제한자를
	 * 확인하자)
	 * 
	 * 8. static과 instance : 멤버필드, 멤버메서드에 공통으로 해당 되는 사항 1) instance(인스턴스) : 객체 생성 -
	 * 인스턴스필드, 인스턴스메서드 : 객체 생성할때 같이 생성되는 필드와 메서드를 말한다. - 일반적인 클래스의 멤버필드나 멤버메서드는 모두
	 * 인스턴스이다. - 호출방법 : 참조변수.멤버필드, 참조변수.멤버메서드() - heap 메모리에 만들어진다. 2) static - 객체
	 * 생성과 상관없이 미리 만들어진 멤버필드와 멤버메서드 - 반드시 static 이라는 예약어를 사용한다. - 객체 생성과 상관없이 호출 가능
	 * - 호출방법 : 클래스이름.멤버필드, 클래스이름.멤버메서드 - System.out , Math.max()
	 * 
	 * 
	 * 지역변수 또는 메서드 인자에 만들어진 변수는 해당 메서드가 실행 될때 만들어진다. 객체 생성할때는 만들어지지 않는다.
	 * 
	 */

}

package com.ict.day09;

public class Ex01 {
	// 클래스 : 멤버필드, 멤버메소드, 생성자
	// 멤버필드 : 데이터, 상태값, 속성, 특징
	// 변수 : 언제든지 변할 수 있는 상태값,
	// 상수 : 한번지정되면 변경할 수 없는 상태값, final

	// 인스턴스 변수와 상수는 클래스가 객체로 생성될때 함께 생성되는 변수와 상수
	// 호출 ; 참조변수.멤버필드, 참조변수.멤머메서드

	// static 변수와 상수는 객체 생성과 상관없이 먼저 만들어져있는 변수와 상수이다. (static 표시가 있음)
	// 호출 : 클래스이름.멤버필드, 클래스이름.멤버메서드

	String name = "홍길동"; // 인스턴스 변수
	int kor = 80; // 인스턴스 변수
	static int eng = 85; // static 변수
	final int MATH = 90; // 인스턴스 상수
	static final int COMPUTER = 95; // static 상수

}package com.ict.day09;

public class Ex02 {
	public static void main(String[] args) {
		// Ex01 클래스에 static 변수와 상수가 있다.
		// 객체 생성 없이 호출 할 수 있다.
		int k1 = Ex01.eng;
		int k2 = Ex01.COMPUTER;
		System.out.println("eng : " + k1);
		System.out.println("com : " + k2);

		// Ex01 클래스를 객체로 만들자
		// 해당 클래스에 생성자가 없으면 무조건 기본생성자 만든다.
		// 클래스이름() => 인자가 없는 생성자를 기본생성자라고 한다.
		// Ex01 t = new 생성자([인자]);
		Ex01 t = new Ex01();
		System.out.println(t);
		System.out.println(t.name);
		System.out.println(t.kor);
		System.out.println(t.MATH);
		System.out.println();

		System.out.println("eng : " + k1);
		System.out.println("com : " + k2);
		System.out.println();

		System.out.println(t.eng);
		System.out.println(t.COMPUTER);

		// 변수와 상수
		// 변수이므로 데이터 변경 가능
		t.kor = 90;
		System.out.println(t.kor);

		// 상수이므로 데이터를 변경할 수 없다.
		// t.MATH = 100;

	}
}

package com.ict.day09;

public class Ex03_Math {
	public static void main(String[] args) {
		// Math 클래스 주요메서드
		// : 수학에서 자주 사용하는 상수들과 static 함수들을 미리 구현해 놓은 클래스

		// 상수 : E , PI
		System.out.println(Math.E); // 자연 로그의 밑 값 2.718.....
		System.out.println(Math.PI); // 원주율 3.14.....

		// 메서드 모두 static이다.
		// 생성자는 없다. => 객체 생성으로 할 수없다. Math.메서드() 로 접근가능하다.

		// 1. random() : 0.0 ~ 1.0 미만의 임의의 난수 발생
		System.out.println(Math.random());
		int k1 = (int) (Math.random()); // 무조건 0;
		int k2 = (int) (Math.random() * 10); // 0-9 ;
		int k3 = (int) (Math.random() * 3); // 0-2 ;

		// 2. ceil() : 올림, round() : 반올림, floor가 버림
		System.out.println("ceil : 가장 큰 정수");
		System.out.println(Math.ceil(10.0)); // 10
		System.out.println(Math.ceil(10.1231)); // 11
		System.out.println(Math.ceil(-10.0)); // -10
		System.out.println(Math.ceil(-10.1231)); // -10

		System.out.println("floor : 가장  작은");
		System.out.println(Math.floor(10.0)); // 10
		System.out.println(Math.floor(10.984)); // 10
		System.out.println(Math.floor(-10.0)); // -10
		System.out.println(Math.floor(-10.984)); // -11

		System.out.println("round : 반올림(소수점 첫째자리기준)");
		System.out.println(Math.round(10.0)); // 10
		System.out.println(Math.round(10.4)); // 10
		System.out.println(Math.round(10.5)); // 11

		// abs() : 절대값 (양수 -> 양수, 음수 -> 양수)
		System.out.println("abs : 절대값");
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		System.out.println(Math.abs(-10.1231));

		// max(수1, 수2) : 큰 값 , min(수1, 수2) : 작은값
		System.out.println(Math.max(15, 15.0009));
		System.out.println(Math.min(15, 15.0009));
	}
}

package com.ict.day09;

public class Ex04 {
	// 인스턴스 필드
	String name = "홍길동";
	int kor = 80;
	int eng = 95;
	int math = 85;
	int total = 0;

	// 메서드() : 기능, 동작
	// ** 해당 메서드를 호출하면 실행 후 호출한 곳으로 되돌아 간다.
	// 메서드 형식 : [접근제한자][메서드종류] 반환형 메서드이름([인자]) { 실행할 내용 }
	// 일반 메서드는 메서드종류를 생략한다.
	// 접근제한자 일반적으로 public를 사용한다.
	// ** 반환형 : 호출한 곳으로 되돌아갈때 가지고 가는 데이터의 자료형
	// 데이터가 없는 경우는 void라는 예약어를 사용
	// 반환형이 있는 메서드 맨 마지막 줄에는 return 예약어를 반드시 사용

	// 인스턴스 메서드
	public void play01() {
		// System.out.println(2);
		total = kor + eng + math;
		// System.out.println(3);
	}

	public void play02() {
		int sum = kor + eng + math;
	}

	public int play03() {
		int sum = kor + eng + math;
		return sum;
	}

	public int play04() {
		total = kor + eng + math;
		return total;

	}
}

package com.ict.day09;

public class Ex05 {
	public static void main(String[] args) {
		// Ex04 클래스를 객체로 만들어야
		// Ex04가 가지고 있는 필드와 메서드를 사용할 수 있다.

		// Ex04 클래스를 객체로 만들기
		Ex04 t = new Ex04();

		System.out.println(t.name);

		// Ex04 에 있는 play01메소드를 호출하자
		// play01이 void 이기 때문에 데이터를 가져오지는 않는다.
		// System.out.println(1);
		System.out.println(t.total);
		t.play01();
		System.out.println(t.total);
		// System.out.println(4);

		t.play02();
		// System.out.println(t.sum);

		int k = t.play03();
		System.out.println(k);
	}
}package com.ict.day09;

public class Ex06 {
	String name = "홍길동";
	static int kor = 80;
	static int eng = 95;
	static int math = 95;
	int total = 0;

	// static 메서드
	public static void play01() {
		// static 메서드가 전역변수를 사용하기 위해서는 전역변수 static
		// 지역변수는 static을 사용할 수 없다.
		int sum = kor + eng + math;

		// System.out.println(name);
		System.out.println(kor);
		System.out.println(sum);
	}

	public static int play02() {
		int sum = kor + eng + math;
		return sum;
	}
}package com.ict.day09;

public class Ex07 {
	public static void main(String[] args) {
		// static 객체 생성과 상관없이 호출 가능
		// 호출방법 ; 클래스이름.멤버필드, 클래스이름.멤버메서드
		System.out.println(Ex06.kor);
		System.out.println(Ex06.eng);
		System.out.println(Ex06.math);

		// 메서드도 같다
		Ex06.play01();

		int k = Ex06.play02();
		System.out.println(k);
	}
}package com.ict.day09;

public class Ex08 {
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";

	// 외부에서 이름받아서 이름넣기
	// 외부데이터는 메서드의 인자를 통해서 받는다.
	// 메서드이름([인자]) { 실행 내용}
	// 인자 = > 자료형 변수
	public void play01(String k1) {
		name = k1;
	}

	// 총점 = kor + eng + math ;
	public void play02(int k1, int k2, int k3) {
		sum = k1 + k2 + k3;
	}

	// 평균
	public void play03() {
		avg = (int) (sum / 3.0 * 10) / 10.0;
	}

	// 학점
	public void play04() {
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		}
	}

	// 출력하기
	public void play05() {
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + hak);
	}

}

package com.ict.day09;

public class Ex09 {
	public static void main(String[] args) {
		Ex08 t = new Ex08();

		// 출력하기
		t.play05();
		System.out.println();

		t.play01("홍길동");
		t.play02(90, 80, 95);
		t.play03();
		t.play04();
		t.play05();
	}
}package com.ict.day09;

public class Ex10 {
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";

	public void play(String k1, int kor, int eng, int math) {
		name = k1;
		sum = kor + eng + math;
		avg = (int) (sum / 3.0 * 10) / 10.0;
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		}

		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + hak);
	}
}package com.ict.day09;

public class Ex11 {
	public static void main(String[] args) {
		Ex10 t = new Ex10();
		t.play("고길동", 90, 70, 75);
	}
}package com.ict.day09;

public class Ex12 {
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";

	public void play02(String k1, int kor, int eng, int math) {
		name = k1;
		sum = kor + eng + math;
		// 메서드는 다른 메서드를 호출 할 수 있다.
		play03();
	}

	public void play03() {
		avg = (int) (sum / 3.0 * 10) / 10.0;
		play04();
	}

	public void play04() {
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		}
		play05();
	}

	// 출력하기
	public void play05() {
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + hak);
	}
}package com.ict.day09;

public class Ex13 {
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";

	public void play02(String k1, int kor, int eng, int math) {
		name = k1;
		sum = kor + eng + math;
		// 메서드는 다른 메서드를 호출 할 수 있다.
		play03();
		play04();
		play05();
	}

	public void play03() {
		avg = (int) (sum / 3.0 * 10) / 10.0;
	}

	public void play04() {
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		}
	}

	// 출력하기
	public void play05() {
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + hak);
	}
}package com.ict.day09;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Ex12 t1 = new Ex12();
		t1.play02("일지매", 80, 85, 85);

		Ex13 t2 = new Ex13();
		t2.play02("임꺽정", 100, 95, 95);

		System.out.println();

		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scan.next();

		System.out.print("국어 : ");
		int kor = scan.nextInt();

		System.out.print("영어 : ");
		int eng = scan.nextInt();

		System.out.print("수학 : ");
		int math = scan.nextInt();

		t2.play02(name, kor, eng, math);

	}
}

package com.ict.day09;

public class Ex15 {
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";

	// 반환형이 있는 메서드
	public String play01(String k1) {
		name = k1;
		return name;
	}

	public int play02(int kor, int eng, int math) {
		int total = kor + eng + math;
		return total;
	}

	public int play03(int kor, int eng, int math) {
		sum = kor + eng + math;
		return sum;
	}
}package com.ict.day09;

public class Ex16 {
	public static void main(String[] args) {
		Ex15 t = new Ex15();

		String name = t.play01("둘리");
		System.out.println("name : " + name);
		System.out.println(t.name);

		int res = t.play02(90, 90, 90);
		System.out.println("res : " + res);
		System.out.println(t.sum);

		int res2 = t.play03(80, 80, 80);
		System.out.println("res2 : " + res2);
		System.out.println(t.sum);

	}
}package com.ict.day09;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 첫번째 숫자 :
		System.out.print("첫번째 숫자 : ");
		int k1 = scan.nextInt();

		// 두번째 숫자 :
		System.out.print("두번째 숫자 : ");
		int k2 = scan.nextInt();

		// 연산자 : +, -, *, /
		System.out.print("연산자 : +, -, *, /  >> ");
		String str = scan.next();

		Ex17 t = new Ex17();
		switch (str) {
		case "+":
			t.plus(k1, k2);
			System.out.println(k1 + str + k2 + "=" + t.res);
			break;
		case "-":
			t.sub(k1, k2);
			System.out.println(k1 + str + k2 + "=" + t.res);
			break;
		case "*":
			int k = t.mul(k1, k2);
			System.out.println(k1 + str + k2 + "=" + k);
			break;
		case "/":
			double s = t.div(k1, k2);
			System.out.println(k1 + str + k2 + "=" + s);
			break;

		}

		// 출력 : 숫자 연산자 숫자 = 결과
	}
}
package com.ict.day09;

public class Ex17 {
	String name;
	int age;
	double result;
	int res;

	public void plus(int k1, int k2) {
		res = k1 + k2;
	}

	public void sub(int k1, int k2) {
		res = k1 - k2;
	}

	public int mul(int k1, int k2) {
		res = k1 * k2;
		return res;
	}

	public double div(int k1, int k2) {
		result = (int) ((k1 * 1.0) / k2 * 10) / 10.0;
		return result;
	}
}

}
