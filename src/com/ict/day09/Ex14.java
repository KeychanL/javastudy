package com.ict.day09;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Ex12 t1 = new Ex12();
		t1.play02("일지매", 80, 86,64);
		
		Ex13 t2 = new Ex13();
		t2.play02("이지매", 100, 95, 85);
	
		
		Scanner scan = new Scanner(System.in);
				System.out.print("이름 : ");
				String name = scan.next();
				
				System.out.print("국어 : ");
			    int s1 = scan.nextInt();
				
				System.out.print("영어 : ");
				int s2 = scan.nextInt();
				
				System.out.print("수학 : ");
				int s3 = scan.nextInt();
				
				Ex13 t3 = new Ex13();
				t3.play02(name, s1, s2, s3);	
				
				
				
			
	}

}
