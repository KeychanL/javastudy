package com.ict.day14;

//추상클래스
abstract class Ex05 {
	int data = 1000;
	public abstract void printData();
}
class Ex05_Test extends Ex05{
	
	@Override
	public void printData() {
		System.out.println("data1 : " + (data+100));
	}
	

}
class Ex05_Test2{
	//상속받지 않고 바로 객체 생성
	Ex05 t1 = new Ex05() {
		
		@Override
		public void printData() {
			System.out.println("data2 : " + (data+100));// TODO Auto-generated method stub
			
		}
	};
}