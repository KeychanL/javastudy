package com.ict.day17;

public class Ex08 {
/*함수형 프로그래밍과 람다식
 * 메서드와 함수 차이  : 클래스 안에 존재하는 함수를 메서드라고 하고 별도로 만들 수 있는 함수를 함수 펑션이라고 함
 * 함수형 프로그래밍 : 함수의 구현과 호출만으로 프로그램을 만들 수 있는 프로그래밍 방식을 말한다
 * 람다식 : 함수형 프로그래밍에서 사용하는 방식으로
 * -코드가 매우 간결해짐
 * -컬렉션 요소를 필터링 또는 매핑을 쉽게 하는 요소(스트림)
 * 람다식 -> 매개변수를 가진 코드블록->익명 구현 객체
 * 람다식 형식) : ([매개변수]) -> {실행문};
 * 
 * 일반 메서드 --> 람다식 : 1)반환형과 이름 삭제, 2)([매개변수]) -> {}
 * int add(int x, int y){          (int x, int y) -> {
 *                                 return x+y;
 * return x + y;
 * }
 * 1.매개 변수 자료형과 괄호 생략하기
 * -매개변수의 자료형은 생략할 수 잇다
 * (x,y) -> {return x+y;}
 * -만약에 매개변수가 하나이면 () 생략할 수 있다.
 * x->{return x+y;}
 * 2. 중괄호 생략하기
 * -중괄호의 구현부분이 한 문장인 경우 중괄호 생략할 수 있다.
 * (return문은 중괄호 생략 안됨)
 * (x,y)->{return x+y}
 * x->{returnx +10;}
 * (x,y) - > x+y;
 * x->x+10;
 * 3.return 생략하기
 * 
 */
}