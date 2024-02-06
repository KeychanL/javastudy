package com.ict.day07;

import java.util.Arrays;
import java.util.Collections;

public class Ex04 {
public static void main(String[] args) {
	//Array 클래스 : 배열을 다루기 위한 다양한 메서드가 포함되어 있는 클래스
	int [] arr = new int[100];
			//초기화
			for (int i=0; i<arr.length; i++) {
				arr[i] = i*5;
				System.out.println("arr[" + i + "]=" + (i*5));
				
			}
	//binarySearch(베열,찾을 값) : 해당 배열에서 값을 검색한 후 위치값에 있는 값을 반환
	int res=Arrays.binarySearch(arr, 10);
	System.out.println("결과: " + res);
	
	//
	int[] arr1 = {1,2,3,4,5};
	int[] arr2 = Arrays.copyOf(arr1, 3);
	
	System.out.println("arr2");
	for (int i = 0; i < arr2.length; i++) {
		System.out.println(arr2[i]);
	}
	
	int[] arr3 = Arrays.copyOf(arr1, 10);
	for (int i =0; i<arr3.length; i++) {
		System.out.println(arr3[i]);
	}
	System.out.println();
	
	//copyOfRange("배열", 시작위치, 끝위치(포함안함))
	int[] arr4 = Arrays.copyOfRange(arr1, 2, 4);
	for(int i = 0; i<arr4.length; i++) {
		System.out.println(arr4[i]);
	}
	System.out.println();
	int [] arr5 = new int[10];
	Arrays.fill(arr5, 3);
	for(int i=0; i<arr5.length; i++) {
		System.out.println(arr5[i]);
		
	}
	//sort(배열) : 해당 배열을 오름차순 정렬 
	int [] arr6 = {7, 4, 3, 1, 5, 6, 2};
	Arrays.sort(arr6);
	System.out.println("arr6 오름차순");
	for(int i =0; i<arr6.length; i++) {
		System.out.println(arr6[i]);
	}
	System.out.println();
	
	//오름차순에서 끝에서부터 가져오기
	System.out.println("오름차순을 내림차순으로 출력");
	for(int i =arr6.length-1; i>=0; i--) {
		System.out.println(arr6[i]);
	}
	//내림차순
	//주의사항 : int 자료형 ->Integer 클래스
	Integer[] arr7 = {7, 4, 3, 1, 5, 6, 2};
	Arrays.sort(arr7, Collections.reverseOrder());
	for(int i =0; i < arr7.length; i++) {
		System.out.println(arr7[i]);
}
	System.out.println("문자열 정렬 : 숫자, 키보드 특수, 대문자, 소문자, 한글");
	String[] arr8 = {"Mango", "Apple", "apple", "7", "mango", "1",
			"banana", "Banana", "@", "가나다", "하바사"};
	Arrays.sort(arr8);
	for(int i = 0; i<arr8.length; i++) {
		System.out.println(arr8[i]);
	}
	
	//Arrays.asList() : 배열을 리스트라는 컬렉션으로 변경할때 사용
	//List의 toArray() : 리스트를 배열로 만들어서 사용
	
	}
}