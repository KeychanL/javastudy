package com.ict.day17;

public class Ex09_Main {
public static void main(String[] args) {
	Ex09 t1 = new Ex09() {
		@Override
		public int getMax(int num1, int num2) {
			int k ;
			if(num1>num2) {
				k=num1;
				}
			else {
				k=num2;
			}
			return k;
		}
	};
	Ex09 t2 = new Ex09();
	@Override
	public int getMax(int num1, int num2) {
		if(num1>num2) {
			return num1;
			
		}
		else {
			return num2;
			
		}
	}
	}; 
	
}
}