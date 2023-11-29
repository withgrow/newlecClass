package com.newlecture.app;

public class Chapter1 {

	public static void main(String[] args) {
		//계란의 갯수 선언
		long eggNum;
		
		//계란의 개수에 10을 할당
		eggNum = 10;
		System.out.println(eggNum);
		
		//계란에 갯수에 3,000,000,000
		// int의 2,147,483,647 까지이기 떄문에 ennNum을 long으로 형변환 시켜준다
		eggNum = 3_000_000_000l;
		System.out.println(eggNum);
		
		//사과의 갯수 선언
		int appleNum;
		
		//사과의 갯수에 1를 대입
		appleNum = 15;
		
		//한개의 가격을 나타내는 실수형 변수 선언하고 1.5로 초기화
		float applePrice = 1.5f;
		
		//사과의 갯수 30개 입고
		appleNum += 30;
		System.out.println(appleNum);
		
		//최대 속도를 나타내는 정수형 변수 선언하고 값 240 대입
		int maxVelocity = 240;
		
		//Pi 문제
		double pi = 3.14159265359;
		System.out.println(pi);
		float floatPi = (float)pi;
		System.out.println(floatPi);
		
		
		//a와b문제
		int a = 5;
		System.out.println(a);
		int b =a;
		System.out.println(b);
		
		
		//논리형 변수
		boolean isTrue = true;
		System.out.println(isTrue);
		
		boolean isFalse = !isTrue;
		System.out.println(isFalse);
		
		boolean isOdd = false;
		
		// 사탕갯수 33 - 17 = 16
		int candyNum = 33;
		candyNum -= 17;
		System.out.println(candyNum);
		
		//정수형 변수 x,y,temp선언. x=10 y=20 -> x=20 y=10출력
		int x,y,temp;
		
		x=10;
		y=20;
		System.out.printf("%d %d \n" , x, y);
		
		temp = x;
		x = y;
		y = temp;
		System.out.printf("%d %d \n" , x, y);
		
		//정수형 변수 positiveNumber의 값은 3. 이 변수를 이용하여 변수 negativeNumber에 음수로 변환하여 대입.
		int positiveNumber = 3;
		int negativeNumber = -positiveNumber;
		System.out.println(negativeNumber);
		
		//정수형 변수 number에 15를 대입하고, number에 5를 더하셈
		int number = 15;
		number = number +5;
		System.out.println(number);
		
		//정수형 변수 total에 0을 대입하고, 1-10까지 숫자를 차례대로 더한 후 결과 55가 나오게 출력.
		int total = 0;
		total = total+1+2+3+4+5+6+7+8+9+10;
		System.out.println(total);
		/*
		for(int i=1; i<=10; i++) {
			total +=i;
		}
		System.out.println(total);
		*/
		
		//문자형 변수 c에 Q를 대입하고 출력하세요
		char c=  'Q';
		System.out.println(c);
		
		//성적 A출력
		char grade = 'A';
		System.out.println(grade);
		
		//정수형 두 변수 m과n에 각각 40과 30을 대입한 후, 두 변수의 합을 출력하세요
		int m = 40;
		int n = 30;
		
		System.out.println(m+n);
		
		// 자동차 바퀴5개 234대의 자동차 총바퀴몇?
		int wheel = 5;
		int car = 234;
		System.out.println(car * wheel);
		
		//원의 둘레 구하기
		float radius = 7.0f;
		float result = 2*(float)Math.PI*radius;
		System.out.println(result);
		
		//사각형의 면적 구하기
		int height = 5;
		int width = 10;
		System.out.println(height * width);
		
		//정수형 변수 count에 0을 대입하고 1씩 증가시키면서 10까지 출력
		int count =0;
		System.out.println(++count);
		System.out.println(++count);
		System.out.println(++count);
		System.out.println(++count);
		System.out.println(++count);
		System.out.println(++count);
		System.out.println(++count);
		System.out.println(++count);
		System.out.println(++count);
		System.out.println(++count);
		
		/*
		for(int i=0; i<10; i++) {
			count++;
		System.out.println(count);
		}
		*/
		
		//아인슈타인 나이계산
		int ain = 1879;
		System.out.println(2023 - ain);
		
		//증감연산자 이용
		int count1 = 0;
		count1 ++;
		count1 ++;
		System.out.println(count1);
		
		//다음 코드가 왜 안되는가
		//괄호로 닫혀 있어서 컴파일러가 resultNumber을 찾지 못함.
		int numberQ = 3;
		int numberW = 10;
		{int resultNumber = numberQ + numberW;
		System.out.println(resultNumber);}
		
		//7250짜리 사탕 candyPrice를 지불금액 paidAmount로 10000원 거스름돈은?
		int candyPrice = 7250;
		int paidAmount = 10000;
		
		System.out.println(paidAmount - candyPrice);
		
		//다음 출력결과를 예상해보시오 (7)
		int myNumber = 5;
		System.out.println(--myNumber +3);
		
		
		//초를 시간과 분으로 변환하여 출력
		float seconds = 86400f;
		float minute = seconds / 60;
		float hour = minute / 60;
		
		System.out.println(seconds);
		System.out.println(minute);
		System.out.println(hour);
		
		//일과 주를 변환하여 출력
		int days = 365;
		int weeks = days / 7;
		int leftDay = 365 %7;
		System.out.printf("주는 %d고, 남은 일은 %d이다. \n", weeks, leftDay);
		
		//변수 byteSize에 1024를 대입하고, 이를 킬로바이트 단위로 반환하여 출력.
		int byteSize = 1024;
		int kilobytes = byteSize / 1024;
		System.out.println(kilobytes);
		
		//변수 distance에 150.5를 대입하고, 이를 m단위로 변환
		float distance = 150.5f;
		float mitter = distance /100;
		System.out.println(mitter);
		
		//다음 연산을 덧셈 연산이 우선이 되도록 수정 (5+5)
		int result1 = (5+5)*2;
		System.out.println(result1);
		
		//평균내기 
		//나누는거 더블로 주는거 까먹지 말기
		int score1 = 74;
		int score2 = 95;
		int score3 = 80;
		int score4 = 100;
		float avg = (score1 + score2 + score3 + score4) / 4.0f;
		
		System.out.println(avg);
	}

}
