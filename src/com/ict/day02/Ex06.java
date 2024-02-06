package com.ict.day02;

public class Ex06 {
	public static void main(String[] args) {
		//형변환 : 자동형변환 강제형변환
		//자동 형 변환 = 프로모션 : 작은 자료형이 큰 자료형을 변환하는 것 (저장하는 것)
		int s1 = 10;
		long s2 = s1;
		long s3 = 10;
		
		//강제형변환 = 디모션 : 큰 자료형이 작은 자료형으로 변환할때 오류가 발생하여서 강제로 변경시키는 방법 ( 데이터가 손실될 가능성이 있다.)		
	double d1 = 35.14 ;
	int d2 = (int) d1;
	
	float f1 = (float)(5426.142) ;
	//자동형변환
	int k1 = 'a';
	//char가 0~65536사이의 값은 받을 수있다.
	char k2 = 105 ;
	
	int k3 = 105;
	char k4 = (char)(k3);
	
	
	
	System.out.println(d1);
	System.out.println(d2);
	System.out.println(f1);
	System.out.println(k1);
	System.out.println(k4);
	
	}

}
