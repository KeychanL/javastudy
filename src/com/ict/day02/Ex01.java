package com.ict.day02;

public class Ex01 {
	public static void main(String[] args) {
		// 주석 : 컴파일러는 무시하고 사람에게만 보이는 줄(해당코딩의 설명글을 적는 줄)
		// 논리형 : boolean으로 사용, true 또는 false를 말한다.
		// 변수는 데이터 하나를 저장하는 영역이다.
		// 가장 최신의 데이터만 남는다.
		// 변수에 10이 저장되어있다가 20을 저장하면 10을 지우고 20이 저장된다.
		// 변수 앞에 어떤 데이터를 저장할 수 있는지 표시
		// 변수와 상수는 데이터 하나를 저장하는 영역이다.
		// 논리형을 변수에 기억시키는 방법
		// boolean 변수이름 ; (선언)
		// 데이터가 변수에 저장된다 라는 뜻
		// boolean형에서 사용할 수 있는 데이터는 true, 또는 false 이다.
		// 변수이름 = 데이터(표현범위) ; (저장=기억=대입)

		boolean b1;
		b1 = true;
		// 변수를 호출하면 변수안에 있는 데이터가 나온다.
		System.out.println(b1);
		// false를 다시 b1에 저장하자
		b1 = false;
		System.out.println(b1);

		// 다른 변수 b2 만들기
		// 자료형(boolean) 변수이름 = 데이터 ;
		// 선언과 저장을 한번에
		boolean b2 = true;
		System.out.println(b2);
		b2 = false;
		System.out.println(b2);

		// boolean은 true false 이외에는 오류 발생
		boolean b3 = 10;

	}
}
