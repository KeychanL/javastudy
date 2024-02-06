package com.ict.day18;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ex11 {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("딸기", "바나나", "멜론", "수박");
        //naturalOrder() : 기본정렬을 뜻한다.
		Optional<String> o_min = str.stream().min(Comparator.naturalOrder());
		Optional<String> o_max = str.stream().max(Comparator.naturalOrder());
        //findAny : 요소 중 하나의 요소를 반환
		Optional<String> o_findAny = str.stream().findAny();
		//findFirst : 요소중 첫번째 요소 반환
		Optional<String> o_findFirst = str.stream().findAny();
System.out.println(o_min.get());
System.out.println(o_max.get());
System.out.println(o_findFirst.get());
System.out.println(o_findAny.get());
	}
}
