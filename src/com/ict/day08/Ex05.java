package com.ict.day08;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//학생수
		System.out.print("학생 수 : ");
		int su = scan.nextInt();
		double[][] arr = new double [su][8];
		
		for(int i = 0; i<arr.length; i++) {
			double[] p = new double[8];
			System.out.print("번호 : ");
			p[0] = scan.nextInt();
			System.out.print("국어 : ");
			p[1] = scan.nextInt();
			System.out.print("영어 : ");
			p[2] = scan.nextInt();
			System.out.print("수학 : ");
			p[3] = scan.nextInt();
			
			p[4]=p[1]+p[2]+p[3];
			
			p[5]=(int)(p[4]/3.0*10)/10.0;
			
			if(p[5]>=90) {
				p[6] = 'A';
			}
			else if(p[5]>=80) {
				p[6] = 'B';
			}
			else if(p[5]>=70) {
				p[6] = 'C';
			}
			else {
				p[6] = 'F';
			}
			p[7]=1;
			//**다차원배열에 넣기
			arr[i]=p;
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				//국어 영어 수학 출력에서 제외
				if(j==1||j==2||j==3)continue;
				if(j==5) {
					System.out.print(arr[i][j]+"\t");
				}
				else if(j==6) {
					System.out.print((char)(arr[i][j]) + "\t");
				}
				else {
					System.out.print((int)(arr[i][j]) + "\t");
					
				}
				
					
				
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
