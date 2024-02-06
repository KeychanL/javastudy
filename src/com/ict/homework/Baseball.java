package com.ict.homework;

import java.util.Random;
import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		int strike = 0;
		int ball = 0;

		Random random = new Random();

		int randomNumber = random.nextInt(10);

		int[] arr = new int[3];
		arr[0] = random.nextInt(10);

        do {
            arr[1] = random.nextInt(10);
        } while (arr[1] == arr[0]); // arr[1]이 arr[0]과 다르도록 보장

        do {
            arr[2] = random.nextInt(10);
        } while (arr[2] == arr[0] || arr[2] == arr[1]);
        
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        
        
		Scanner scan = new Scanner(System.in);
		System.out.print("1번구 : ");
		int n1 = scan.nextInt();
		System.out.print("2번구 : ");
		int n2 = scan.nextInt();
		System.out.print("3번구 : ");
		int n3 = scan.nextInt();

		if (n1 == arr[0]) {
			System.out.println("1번구 스트라이크!");
			strike++;
		

		}
	}
}