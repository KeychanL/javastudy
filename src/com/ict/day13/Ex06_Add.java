package com.ict.day13;

public class Ex06_Add {
  public double plus(double s1, double s2);
}
interface Ex07_Sub{
	public double minus(double s1, double s2);
}

abstract class Ex07_Oper{
	public abstract double mul(double s1, double s2);
	public abstract double div(double s1, double s2);
	
}
//위의 인터페이스와 추상클래스 상속 받자
class Ex09_Calc extends Ex08_Oper implements Ex06_Add, Ex07_Sub{
	
}