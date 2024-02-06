package com.ict.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex05 {
	public static void main(String[] args) {
		//ArrayList를 스트림으로
		List<String>sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(i->System.out.print(i + " "));
		System.out.println();
		
		//중간처리 ; 정렬 => sorted
		Stream<String> stream2 = sList.stream();
		stream2.sorted();
		
		Stream<String>stream4 = Stream.of(new String[] {"bb", "a", "CC", "dd", "BB", "aaa"});
		stream4.sorted().forEach(i->System.out.print(i + " "));
		System.out.println();
		
		Stream<String> stream6 =
				Stream.of(new String[] {"bb", "a", "0", "라", "CC", "3", "dd", "BB", "aaa", "가"});
		stream6.sorted(String.CASE_INSENSITIVE_ORDER).forEach(i->System.out.print(i + " "));
		System.out.println();
				
				
		}

}

