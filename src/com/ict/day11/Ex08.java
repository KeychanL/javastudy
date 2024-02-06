package com.ict.day11;

import java.util.Scanner;



public class Ex08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생 수 : ");
		int su = scan.nextInt();

		// 학생 수 만큼 배열 크기를 만들자
		// 해당 배열안에는 클래스가 들어간다.
		// Ex05클래스로 만든 객체를 배열의 자료형으로 사용
		// 즉 해당 배열안에 EX05로 만든 객체의 주소만 존재
		Ex07[] arr = new Ex07[su];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("이름 : ");
			String name = scan.next();
			System.out.println("국어 : ");
			int kor = scan.nextInt();
			System.out.println("영어 : ");
			int eng = scan.nextInt();
			System.out.println("수학 : ");
			int math = scan.nextInt();

			Ex07 p = new Ex07(name, kor, eng, math);
			p.process();
			arr[i] = p;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				if (arr[i].sum < arr[j].sum) {
					arr[i].rank++;
				}
			}
		}
		Ex07 tmp = new Ex07();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].rank > arr[j].rank) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = arr[i];

				}
			}
		}
		// 출력
		System.out.println("이름\t총점\t평균\t학점\t랭크\t순위");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].name + "\t");
			System.out.println(arr[i].sum + "\t");
			System.out.println(arr[i].avg + "\t");
			System.out.println(arr[i].hak + "\t");
			System.out.println(arr[i].rank + "\t");

		}
	}
}
