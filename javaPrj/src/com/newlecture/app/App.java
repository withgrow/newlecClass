package com.newlecture.app;

import com.newlecture.app.aa.AA;

public class App {

	public static void main(String[] args) {
		
/*		아아
		변수선언  */
		
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		
		
	
		
		// 0-100까지 변수 값 대입
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;
	
		total = kor1 + kor2 + kor3 ;
	//	avg =(float)(total/3); // 63.0
	//  avg =(float)(total/3.0); 63.333
		avg = total/ 3;
		
		//성적 계산 및 성적 출력
		System.out.printf("avg is %f\n", avg);
		
		avg = (float)(total/ 3.0f);
		System.out.printf("avg is %f\n", avg);
		
		
		System.out.printf("total is %d\n", total);
		
		AA aa;
		com.newlecture.app.bb.AA a1;

	}

}
