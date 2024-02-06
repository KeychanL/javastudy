package com.ict.day05;

public class Ex02 {
public static void main(String[] args) {
	//for문 : 정해진 규칙에 따라 실행문을 반복 처리 한다.
	//        조건식이 참일때, 거짓이면 실행하지 않음
	//형식)for(초기식;조건식;증감식){
	//         조건식이 참일때 실행할 문장;
	//         조건식이 참일때 실행할 문장;
    //        }
	
	// 1. 포문을 만나면 초기식에 간다.
	// 2. 초기식 가지고 조건식 간다.
	// 3. 조건식이 참이면 실행, 거짓이면 실행하지 않음
	// 4. 참일때 실행하다가 포문의 끝을 만나면 다시 증감식으로 간다
	// 5. 증감식에서 증가하거나 감소 후 다시 조건식에 간다.
	// 6. 조건식에서 참이면 실행 거짓이면 실행하지 않음

	//자바에서는 블록안에서 변수를 만들고 선언하면 해당 블록에서만 사용 가능
	//해당 블록을 벗어나면 변수는 사라진다.
	//포문의 초기식에서 변수를 만들어 사용한다.
	//초기식에서 만든 변수는 포문 밖에서는 사용할 수 없다.
	
	for (int i = 0; i < 10; i++) {
		System.out.println(i);
		System.out.println("hi");
		System.out.println("안녕하세요");
		
	}
	//for문에서 만든 변수는 for문 밖에서 사용 불가
	//System.out.println(i);
	//0-10 출력
	
	for (int j = 10; j < 21; j=j+2) {
		System.out.println(j);
	}
	for (int q = 11; q < 20; q=q+2) {
		System.out.println(q);
	}
	for (int w = 1; w < 10; w++) {
		int e = 5*w;
		System.out.println("5*"+w+"="+e);
	}
	System.out.println("10-20 짝수만 출력");
	for(int i =10; i < 21; i++) {
	   if(i%2==0) {
		   System.out.println(i);
	   }
}
	System.out.println("10-20 홀수만 출력");
	for(int r =10; r < 21; r++) {
	   if(r%2==1) {
		   System.out.println(r);
	   }
	   // 0000
	   // 0000
	   // 0000
	   // 0000
	   
}
	int sum =0;
	for(int a = 0; a<11; a++) {
		sum = sum + a;
	}
		System.out.println(sum);
		
		//0-10 홀수의 합계, 짝수의 합계를 각각 구하자
		int sum1 =0;
		for(int s = 1; s<10; s=s+2) {
			sum1 = sum1 + s;
		}
			System.out.println(sum1);
			
			int sum2 =0;
			for(int d = 0; d<11; d=d+2) {
				sum2 = sum2 + d;
			}
				System.out.println(sum2);		
		//7!(7*6*5*4*3*2*1)
				
		int g = 1;
		for (int f = 1; f<8; f++) {
			g = g*f;//누적값=이전값*현재값 
			}
		System.out.println(g);
		}
	}
	//1 -2 +3 -4~ 몇까지 더해야 총합이 100이상되는가~
	
		
		
	


