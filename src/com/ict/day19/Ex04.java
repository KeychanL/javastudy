package com.ict.day19;

import java.util.stream.IntStream;

public class Ex04 {
	public static void main(String[] args) {
		System.out.println("직접처리");
		IntStream.range(0, 100).forEach(i->System.out.println(i));
		
		System.out.println("병렬처리");
		IntStream.range(0, 100).parallel().forEach(i->System.out.println(i));
		
		System.out.println();
		
		System.out.println("직접처리");
		System.out.println(IntStream.rangeClosed(0, 10).sum());
		
		System.out.println("병렬처리");
		System.out.println(IntStream.rangeClosed(0, 10).parallel().sum());
	}

}
