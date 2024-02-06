package com.ict.day18;

import java.util.stream.IntStream;

public class Ex06 {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,1,2,3,4,5,1,2,3};
	
	IntStream intStream1 = IntStream.of(arr);
	intStream1.forEach(i->System.out.print(i+ " "));
	System.out.println();
	
	IntStream intStream2 = IntStream.of(arr);
	intStream2.distinct().forEach(i->System.out.print(i+ " "));
	System.out.println();
	
	IntStream intStream3 = IntStream.range(0,10);//마지막 포함안함
	intStream3.filter(i->i%2==0).forEach(i->System.out.print(i+ " "));
	System.out.println();
	
	IntStream intStream4 = IntStream.rangeClosed(0,10);//마지막 포함
	intStream4.limit(3).forEach(i->System.out.print(i+ " "));
	System.out.println();
	
	
}
}
