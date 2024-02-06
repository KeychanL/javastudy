package com.ict.day15;

public class Ex01 {
/*
  제네릭과 컬렉션(자료구조)
  제네릭 : 컬렉션이 어떤 객체들로 이루어졌는지를 표시하는 객체 타입
  컬렉션 : 객체들을 모아서 저장관리하는 인터페이스를 말한다
  
  변수 : 하나의 데이터를 저장할 수 있는 공가
  배열 : 같은 종류의 자료형을 저장
        크기를 먼저 지정해야 한다. 변경이 안된다
        변수와 객체를 여러개 저장할 수 있다.
  클래스 : 배열은 같은 종류의 자료형을 저장하는 것이 불편해서 클래스에 저장하면 다양한 종류데이터를 저장할 수 있다
  컬렉션 : 다양한 종류의 데이터를 저장한 클래스를 하나의 객체로 만들고
        그 객체를 컬렉션에 저장한 후 관리까지 할 수 있는 인터페이스들이다
  형식) 컬렉션<제네릭>  
 API : <T> => 객체 타입(Type), <E> => 요소(Element), 컬렉션안에 존재하는 객체 하나하나를 뜻한다
 Map 형식 대응 <K,V>=> Key(키값), Value(데이터값)
 1:1 대응, **Key 호출하면 Value가 나온다
 최상위 컬렉션 Collection<E>, Map<K,V>
 Collection<E>를 상속받아서 인터페이스들 : Set<E>, List<E>, Queue<E>
 
 Collection의 주요 메서드
 add(E e) : boolean => 해당컬렉션에 인자로 받은 요소를 추가, 성공하면 true 실패하면 false
 addAll(Collection< ? extends E > c) : boolean
 => 특정 컬렉션에 있는 모든 요소들을 다른 컬렉션에 추가
 clear() : void => 모든 요소 제거
 contains(Object o) : boolean => 인자로 들어온 객체가 포함되어 있으면 true
 isEmpty() : boolean => 비어 있으면 true
 remove(Object o) : boolean => 인자로 들어온 객체만 삭제, 성공하면 true
 size() : int => 컬렉션 안에 존재하는 elements의 수
 toArray() : Object[] => 컬렉션을 배열로 만들어준다
            반대 개념 => Array.asList() => 배열을  ArrayList컬렉션으로 만들어준다
 *
 *
 *
 */
}
