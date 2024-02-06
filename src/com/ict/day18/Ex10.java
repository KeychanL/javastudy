package com.ict.day18;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex10 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		Stream<Integer> stream1 = numbers.stream();
		Optional<Integer> sum = stream1.reduce((i, j) -> Integer.sum(i, j));
		System.out.println(sum);

		int[] num = { 10, 20, 30, 40, 50 };
		IntStream intStream = IntStream.of(num);
		int total = intStream.sum();
		System.out.println(total);
		
		Stream<Integer> numbers3 = Stream.of{1,2,3,4,5,6,7,8,9,10};
		numbers3.reduce((x,y)->x+y);
		System.out.println(total2);
	}

}
