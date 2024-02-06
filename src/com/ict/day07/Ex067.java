package com.ict.day07;

public class Ex067 {
public static void main(String[] args) {
	//배열 정렬하기
	int[] su = {3, 4, 9, 8, 2, 1, 7, 10, 5, 6};
	for(int i =0; i<su.length-1; i++) {
		for(int j =0; j<su.length-i-1; j++) {
			if(su[j]>su[j+1]) {
				int temp = su[j];
				su[j]=su[j+1];
				su[j+1] = temp;
				
				
			}
			
		}
	}
	for (int i = 0; i < su.length; i++) {
        System.out.print(su[i] + " ");
}
}
}
