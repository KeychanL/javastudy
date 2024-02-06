package com.ict.day15;

public class Ex05 {
public static void main(String[] args) {
	//배열 6 자리 채우기(중복안됨)
	int[] arr = new int[6];
	
	for(int i = 0; i<6; i ++) {
		int su = (int)(Math.random()*10);
		arr[i] = su;
		for(int j = 0; j < arr.length; j++) {
			if(i==0) continue;
		}
	}
	for(int i = 0; i < arr.length; i++) {
		System.out.println(arr[i] + " ");
	}
	System.out.println();
}
}
