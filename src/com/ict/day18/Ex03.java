package com.ict.day18;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex03 {
	public static void main(String[] args) {
		// 스트림 생성 : 기본 자료형 배열로부터 스트림 생성하기
		// IntStream, DoubleStream, LongStream

		// IntStream<T> Stream.of(int... values)//가변인자
		// IntStream<T> Stream.of(int[])
		// IntStream<T> Arrays.stream(int[])
		// IntStream<T> Arrays.stream(int[], 시작 index, 끝index (포함X)

		Integer[] inttegerArr = { 1, 2, 3, 4, 5 };
		Stream<Integer> integerStream = Arrays.stream(inttegerArr);
		//메소드 참조
		// integerStream.forEach(System.out::print);
		integerStream.forEach(i -> System.out.print(i));
		System.out.println();
	}
}
