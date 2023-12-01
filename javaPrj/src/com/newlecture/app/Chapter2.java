package com.newlecture.app;

public class Chapter2 {

	public static void main(String[] args) {
	
		//a가b보다 큰가?
		int a = 10;
		int b = 20;
		System.out.println(a > b);
		
		//키가 170 이상이냐?
		int height = 180;
		System.out.println(height >= 170);
	
		//성인이냐?
		int age = 13;
		System.out.println(age >= 20);
		
		//둘이 같냐?
		int x=5;
		int y=5;
		System.out.println(x==y);
		
		//50보다 크고 100보다 작냐?
		int testScore = 83;
		System.out.println(50 < testScore || testScore < 100);
		
		//변수 a가b보다 크고c보다 작은지 출력
		int a1=3 , b1=7 , c1=11;
		System.out.println(a1 > b1 && a1 < c1 );
		System.out.println(1 > a1 || 5 < a1);
		System.out.println(c1 > 10 && c1 < 15);
		
		// 33<=num<50
		int num1 = 35;
		int num2 = 49;
		System.out.println(33 <= num1 && num1 <50);
		System.out.println(33 <= num2 && num2 <50);
		
		//만약 온도가 100도 이상이라면 "끓음"을 출력.
		int temperature = 101;
		
		if(temperature > 100) {
			System.out.println("끓음");
		}
		
		//number이 짝수라면 "짝수"를 출력
		int number = 24;
		
		if(number % 2 == 0) {
			System.out.println("짝수");
		}
		
		//만약 나이가 65세 이상이라면 "은퇴"를 출력.
		int age1 = 65;
		
		if(age1 >= 65) {
			System.out.println("은퇴");
		}
		
		//비가 온다면 "우산을 쓰기"를 출력해보세요
		boolean isRaining = true;
		if(isRaining == true) {
			System.out.println("우산을 쓰기");
		}
		
		//만약 배가 고프스 식사 시간이라면 "식사시간이다!"를 출력
		boolean isHungry = true;
		boolean isMealtime = true;
		
		if(isHungry ==true && isMealtime ==true) {
			System.out.println("식사시간이다!!");
			
		}
		
		//정수형 변수 score에 85 점을 대입, 80 이상이면 합격
		int score = 80;
		if(score >= 80) {
			System.out.println("합격");
		}
		 {
			System.out.println("불합격");
		}
		
		//80이상 90미만이면 grade에 b를 대입
		if(80 <= score && score < 90) {
			char grade = 'B';
			System.out.println(grade);
		}


	}

}
