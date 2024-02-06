package com.ict.day05;
//for(int i =10; i < 21; i++) {
//	   if(i%2==0) {
//		   System.out.println(i);
	   
public class HW {
public static void main(String[] args) {
	//1 -2 +3 -4~ 몇까지 더해야 총합이 100이상되는가~
	int sum = 0;
	for(int i = 0; sum<=100; i++) {
		if(i%2==1) {
			sum = sum+ i;
		}
		else if(i%2==0) {
			sum=sum-i;
		}
		
			System.out.println(i);
	}

}
}



