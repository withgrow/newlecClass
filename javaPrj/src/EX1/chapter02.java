package EX1;

public class chapter02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		
				//1.정수형 변수 a, b가 있습니다. 각각 값이 10과 20일때, a가 b보다 큰지 비교해보세요.
					int a = 10, b = 20;
					System.out.println("[a=10, b=20] a>b  ? = " + (a>b));
					
				
				//2.뉴렉이의 키는 180cm에요. 뉴렉이의 키가 170 이상인지 출력해보세요
					double newLecki = 180;
					System.out.println("뉴렉이 키가 170cm 이상인가요? " + (newLecki>=170));
				
				
				
				
				//3.뉴렉이의 나이는 13살이에요. 뉴렉이가 성인(20세 이상)인지 출력해보세요
					int newLecAge = 13;
					System.out.println("뉴렉이는 성인(20세 이상)인가요? "+ (newLecAge>=20));
				
					
					
				//4.변수 x와 y의 값은 5인데요. x와 y가 같은지 비교하여 출력해보세요
					int x =5, y = 5;
					System.out.println("x=y ? "+(x==y));
				
				
				// 시험 성적이 50보다 크고 100보다 작은지 출력해보세요
				   int testScore = 83;
				   System.out.println("시험 성적이 50보다 크고 100보다 작은지 ?"+((50<testScore)&&(testScore<100)));


				// 변수 a1가 b1보다 크고 c보다 작은지 출력해보세요
				   int a1 = 3, b1 = 7, c = 11;
				   System.out.println("변수 a1가 b1보다 크고 c보다 작은지? "+ ((a1>b1)&&(a1<c)));

				// a1가 1보다 작거나 5보다 큰지 출력해보세요
				   System.out.println("a1가 1보다 작거나 5보다 큰지 ? "+ (1>a1 || a1>5));
				   
				// c가 10보다 크면서 15보다 작은지 출력해보세요
				   System.out.println("c가 10보다 크면서 15보다 작은지 ? "+(10<c && c<15));

				   
				   
				   
				// 다음 그림을 코드로 보기 좋게 작성해주세요
				   // => (33<=num && num<50)
				   
				   
				   
				   
				   
				// 만약 온도가 100도 이상이라면 “끓음"을 출력해보세요
				   int temperature = 101;
				   if(temperature>=100) {
					   System.out.println("끓음");
				   }
				   
				   

				   
				// number가 짝수라면 “짝수"를 출력해보세요
				   int number = 24;
				   if(number%2==0) {
				     System.out.println("짝수");
				   }

				   
				   
				   
				// 만약 나이가 65세 이상이라면 “은퇴"를 출력해보세요
				   int age=65;
				   if(age>=65) {
					   System.out.println("은퇴");
				   }
				   
				   
				   
				// 비가 온다면 “우산을 쓰기”를 출력해보세요
				   boolean isRaining = true;   
				   if(isRaining==true) {
					   System.out.println("우산을 쓰기");
				   }
				  
				   
				   
				   
				// 정수형 변수 day가 6, 7이라면 “주말입니다"를 출력해보세요
				   int day=0;
				   if((day==6)||(day==7)) {
					   System.out.println("주말입니다");
				   }else
				   {
					   System.out.println("x");		   }
			
				   
				   
				// 만약 배가 고프고 식사 시간이라면 “식사시간이다!”를 출력해보세요
				   boolean isHungry = true;
				   boolean isMealTime = false;
				   if((isMealTime == true)&&(isHungry==true)) {
					   System.out.println("식사시간이다!");
				   }
				   
				   
				   
				// 정수형 변수 score에 85를 대입하고, 만약 score가 80 이상이면 "합격"을 출력하세요
				  int score = 85;
				  if(score>=80) {
					  System.out.println("합격");
				  }
				  
				  
				  
				// 만약 score가 80이상이고, 90미만이면 문자형 변수 grade에 B를 대입해주세요
				  char grade;
				 if((score>=80)&&(score<90)) {
					 grade = 'B';
				 }
	}

}
