package com.ict.day18;

import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex12 {
	public static void main(String[] args) {
		// collect : 스트림을 컬렉션으로 변환
		Stream<String> s = Stream.of("a", "b", "c", "b", "z");
		HashSet<String> set = s.collect(Collectors.toCollection(() -> new HashSet<String>()));
		set.add("h");
		set.add("w");
		System.out.println(set);

		// Map
		Stream<String> str = Stream.of("나", "우리", "너", "모두", "노래해요");
		Map<Integer, String> res02 = 
				str.collect(Collectors.toMap(i -> Integer.parseInt(i), j->j));
		System.out.println(res02);
	}
}
