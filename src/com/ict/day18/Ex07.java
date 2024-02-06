package com.ict.day18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex07 {
	public static void main(String[] args) {
		// map, peek, flatMap

		// map() : 스트림 요소들을 변경한 새로운 스트림을 반환한다
		//         단일 스트림의 원소를 매핑시킨 후 매핑시킨 값을 다시 스트림으로 변환하는 중간 연산
		//         객체에서 원하는 원소를 추출하는 역할을 한다고 볼 수 있다
		Stream<String> stream = Stream.of("Java", "jsp", "spring", "jquery");
		stream.map(i -> i.toUpperCase()).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		List<Ex08>list = Arrays.asList(
				new Ex08("park", 20)
				new Ex08("kyung", 20)
				new Ex08("seok", 20)
				new Ex08("test man", 20)
				new Ex08("test woman", 45)
				);
		
		//이름만 추출
		Stream<String> stream2 = list.stream();
        stream2.map(i->i.getName())for () {
			
		}
	}
}
