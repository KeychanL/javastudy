package com.ict.day05;

public class Ex99 {
public static void main(String[] args) {
	for(int i = 1; i<10; i++) {
		for(int j=1; j<10; j++) {
			System.out.println(i + "*" + j + "=" +i*j);
		}
		}
			
	for(int k = 1; k<10; k++) {
		for(int l=1; l<10; l++) {
			System.out.print(" " + k + "*" + l + "=" +k*l + " ");
		}
				System.out.println();
			}
		

	for (int l = 1; l <= 9; l++) {
	    for (int k = 1; k <= 9; k++) {
	        System.out.print(" " + k + "*" + l + "=" + (k * l) + " ");
	    }
	    System.out.println();
	}
	
	for(int k = 1; k<5; k++) {
		
		for(int l=1; l<5; l++) {
			if(k==l) {
				System.out.print(" 1 ");
			}
			else {
				System.out.print(" 0 ");
			}
		}
				System.out.println();
			}
	
	
	}

}

			
	
		



