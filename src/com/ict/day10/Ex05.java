package com.ict.day10;

//저장하는 관점에서 보면 변수는 1개저장 후 삭제 그래서 배열을 쓰
public class Ex05 {
	
	String name = "";
	int kor = 0;
	int eng = 0;
	int math = 0;
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	int rank = 1;
	
	//1. 총점, 평균, 학점을 구하는 메서드를 각각 만들어서 각각호출
	//2. 하나의 메서드에 총점 평균 학점을 구할 수 있다.
	//3. 총점 평균 학점을 구하는 메서드를 각각 만들어서 총점 => 평균=>학점
	
	//한번에 처리하자
	public void process(String n, int k1, int k2, int k3) {
		name = n;
		kor = k1;
		eng = k2;
		math = k3;
		sum = kor + eng +math;
		avg =(int)((sum)/3.0*10)/10.0;
		if(avg>=90) {
			hak = "A학점";
		}
		else if(avg>=80) {
			hak = "B학점";
		}
		else if(avg>=70) {
			hak = "C학점";
		}
		else {
			hak = "F학점";
		}
		
			
				
	}

}
