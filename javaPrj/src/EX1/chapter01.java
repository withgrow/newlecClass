package EX1;

public class chapter01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// TODO Auto-generated method stub

				// 정수형 변수 ‘계란의 개수'를 선언하세요. 당연히 변수명은 영문이에요. 미래의 내가 봐도 쉽고, 남이 봐도 쉬운 좋은 변수명으로 고민하여 작성해주세요
					int eggNumber;
					
				// 계란의 개수에 10을 대입(할당) 해주세요
					eggNumber = 10;
					
					
				//	eggNumber = 3000000000; 
					// int형 자료형 값의 범위를 초과함. 그래서 long 형으로 자료형을 수정필요
							
					
					
				// 사과의 개수를 나타내는 정수형 변수를 선언해주세요
					int appleNumber;
				
				// 사과의 개수에 15를 대입하세요
					appleNumber=15;
					
				// 사과 한 개의 가격을 나타내는 실수형 변수를 선언하고, 1.5로 초기화하세요	
					double applePrice = 1.5;
				
				// 사과 30개가 추가로 입고되었어요!  산술 연산자를 사용하여 사과의 개수에 더해주세요
					appleNumber +=30;
					System.out.println("사과의 개수 = " + appleNumber);
				
				
				// 최대 속도를 나타내는 정수형 변수를 선언하고 값 240을 대입해보세요
					int maxSpeed = 240;
				
					
				// 값 3.14159265359를 변수 pi에 할당해주세요.
					double pi =3.14159265359;
					
				// float floatPi에 pi를 형변환하여 할당해보세요
					float fioatPi = (float)pi;
				
				// 정수형 변수 a에 5를 대입하고 출력하세요
					int a =5;
					System.out.println(a);
				
				// 정수형 변수 b에 a의 값을 대입한 후 b를 출력하세요
					int b = a;
					System.out.println(b);
				
				// 논리형 변수 isTrue에 참을 대입하세요
					boolean isTrue = true;
				
				// 변수 isFalse에 변수 isTrue와 부정연산자(!)와를 사용하여 false를 대입 후 확인해보세요
					boolean isFalse = !isTrue;
					System.out.println(isFalse);
				
				// 논리형 변수 isOdd에 거짓을 대입하세요
					boolean isOdd = false;
				
					
				// 변수 사탕 개수를 선언하여 33개를 대입하세요. 사탕 17개를 먹었다면 남은 사탕의 수를 계산하세요
					int candyNumber = 33;
					candyNumber-=17;
					System.out.println("사탕 남은 갯수 (33-17) = "+candyNumber);
				
				
				// 정수형 변수 x, y, temp를 선언해주세요. x와 y에 각각 10과 20을 대입하고, 
				//이들을 서로 바꾸어 출력하세요. 즉, x에 10, y에 20을 대입했지만, temp를 사용하여 서로 바꾼후, x 는 20, y는 10을 출력해보세요
					int x, y, temp;
					x=10; y=20;
					System.out.println("변경 후 x = "+x+ ",y = "+ y);
					temp = x;
					x= y;
					y=temp;
					System.out.println("변경 후 x = "+x+ ",y = "+ y);
				
				// 정수형 변수 positiveNumber의 값은 3이에요. 이 변수를 이용하여 변수 negativeNumber에 음수로 변환하여 대입해주세요
					int positiveNumber = 3;
					int negativeNumber = -positiveNumber;
					System.out.println("negativeNumber = " +negativeNumber);
					
				// 정수형 변수 number에 15를 대입하고, number에 5를 더한 후 결과를 출력하세요
					int number =15;
					number+=5;
					System.out.println("number+5 = "+ number);
					
				// 정수형 변수 total에 0을 대입하고, 여기에 1부터 10까지 숫자를 차례대로 더한 후 결과 55가 나오게 출력하세요. 	
					int total = 0;
					total = 1+2+3+4+5+6+7+8+9+10;
					System.out.println("0~10 더하기 = "+ total);	
				
					
				// 문자형 변수 c에 Q를 대입하고 출력하세요
					char c ='Q';
					System.out.println("c = "+ c);
					
				// 성적을 나타내는 문자형 변수를 선언하고, 성적 A를 출력하세요
					char grade= 'A';
					System.out.println("성적 = "+ grade);
					
					
				// 정수형 두 변수 m과 n에 각각 40과 30을 대입한 후, 두 변수의 합을 출력하세요
					int m=40, n=30;
					System.out.println("m+n = "+(m+n));
					
				// 뉴렉 지구에는 자동차의 바퀴가 5개에요. 234대의 자동차가 있다면, 총 바퀴의 수가 몇개인지 계산하여 출력해보세요
					int carWheel = 5;
					System.out.println("바퀴의 수 = "+ 234*carWheel);

					
				// 실수형 변수 radius에 7을 대입하고, 원의 둘레(2 * π * radius)를 계산하여 변수 result에 대입 후  출력하세요. 
				//(π는 자바에서 제공하는 Math.PI를 사용하기 or 3.14를 사용하기)
					double radeius = 7;
					double result = radeius *2* Math.PI;
					System.out.println("result = " + result);
					
					

				// 정수형 변수 height와 width에 각각 5와 10을 대입하고, 사각형의 면적을 계산하여 출력하세요
					int height=5 , width = 10;
					System.out.println("사각혁의 면적 = "+height*width);
				
					
				// 정수형 변수 count에 0을 대입하고, 1씩 증가시키면서 10까지 출력하세요	
					int count = 0;
					count++;
					System.out.println("count = " +count);
					count++;
					System.out.println("count = " +count);
					count++;
					System.out.println("count = " +count);
					count++;
					System.out.println("count = " +count);
					count++;
					System.out.println("count = " +count);
					count++;
					System.out.println("count = " +count);
					count++;
					System.out.println("count = " +count);
					count++;
					System.out.println("count = " +count);
					count++;
					System.out.println("count = " +count);
					count++;
					System.out.println("count = " +count);
			
			// 아인슈타인은 1879년생인데요. 아인슈타인이 지금까지 살아왔다면 몇살인지 한국식 나이로 계산하여 출력하세요
				System.out.println("아이슈타인의 한국식 나이 = "+ (2023 - 1879 + 1)+"세");
				
			// 증감연산자를 이용하여 초기값이 0인 변수 count를 2로 바꿔보세요
				count = 0;
				count++;
				count++;
				System.out.println("count = " + count);
				
			
			
				//// 다음 코드는 왜 안되는걸까요? 10초만 생각해보고 넘어가봅시다
				////=> resultNumber 가 중괄호 안에 있어서 ??
			
			
			
			
			
			
			// 뉴렉이는 7250원짜리 사탕 candyPrice를 지불금액 paidAmount으로 10000원을 냈어요. 거스름돈을 출력해주세요
				int candyPrice = 7250;
				int paidAmount =10000;
				System.out.println("뉴렉이의 거스름돈 = "+ (paidAmount - candyPrice));
			
			
			
			
			/* 다음 출력 결과를 예상해보세요
				int myNumber = 5;
		    	System.out.println( --myNumber + 3); //  답 : 7
		  
			
				
			/* 뉴렉처 계산기는 초를 시간과 분으로 변환해주는 계산기에요. 변수 seconds에 86400을 대입하고, 
			이를 시간과 분으로 변환하여 각각 출력하세요 ???*/
				long seconds = 86400;
				long min = 86400 / 60;
				long hour = min / 60;
				System.out.println("second = "+seconds + ", min = "+min+" ,hour = "+hour);
			
			
			
			// 뉴렉이는 일수를 넣으면 주와 남은 일을 계산해주는 프로그램을 만드려고해요. 변수 days에 365를 대입하고, 이를 주(weeks)와 남은 일(days)로 변환하여 출력하세요
				int days = 365;
				int weeks = days /7;
				days = days % 7;
				System.out.println("남은 주 = "+ weeks + ", 남은 일 = " +days);

				
				
			// 변수 byteSize에 1024를 대입하고, 이를 킬로바이트(KB) 단위로 변환하여 출력하세요 (출력 변수명은 kilobytes)		
				int byteSize = 1024;
				int kilobytes = byteSize/1024;
				System.out.println(kilobytes +"KB");
			
				
				
				
				
			// 변수 distance에 150.5를 대입하고, 이를 미터(m) 단위로 변환하여 출력하세요. 150.5는 cm 단위에요
				double  distance = 150.5;
				System.out.println("distance m단위 = "+ distance/100 +"m");
				
				
				
						
				
			// 다음 연산을 덧셈 연산이 우선이 되도록 수정해주세요
			    int result2 = 5 + 5 * 2;
			    result2 = (5+5)*2;
			    System.out.println("result2 = "+ result2);
			
			    
			    

			 // 고등학생 뉴렉이는 1학기 중간고사부터 2학기 기말고사까지의 시험 성적의 평균을 내려고해요. 뉴렉이를 도와주세요!
			    int  score1 = 74, score2 = 95, score3 = 80, score4 = 100;
			    double avg;
			    avg = (score1+score2+score3+score4) / 4.0;
			    System.out.println("뉴렉이 평균 점수 = " +avg);
	}

}
