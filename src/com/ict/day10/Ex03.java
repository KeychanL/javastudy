package com.ict.day10;

public class Ex03 {
//오버로딩(중복정의) : 한 클래스안에서 같은 이름의 가진 메서드가 여러개 정의되어있는것
	//반드시 인자의 자료형이나 개수가 달라야 한다.
	public double plus(int s1, int s2) {
		double sum = s1 + s2;
		return sum;
	}
	public double plus(double s1, int s2) {
		double sum = s1 + s2;
		return sum;
	}
	public double plus(int s1, double s2) {
		double sum = s1 + s2;
		return sum;
	}
	public double plus(double s1, double s2) {
		double sum=s1 + s2;
		return sum;
	}
	public double plus(String s1, String s2) {
		double k1=Double.parseDouble(s1);
		double k2=Double.parseDouble(s1);
		double sum = k1 + k2;
		return sum;
	}
	public double plus(String s1, int s2) {
		double k1=Double.parseDouble(s1);
		double sum = k1 + s2;
		return sum;
	}
	public double plus(int s1, String s2) {
		double k1=Double.parseDouble(s2);
		double sum = plus(s1, k1);
		return sum;
	}
}
