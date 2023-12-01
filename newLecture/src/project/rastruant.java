package project;

import java.util.Scanner;

public class rastruant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // TODO Auto-generated method stub
	      Scanner p = new Scanner(System.in);

	      // 가게정보
	      String storeName = "강식당";
	      int money = 100000;

	      // 아르바이트
	      int personPee = 5000;

	      // 재료정보
	      int meetCost = 900;
	      int vegtableCost = 500;
	      int fruitCost = 800;

	      // 음식정보
	      String kimchi = "김치찌개";
	      int kimchiCost = 5000;
	      int kimchiFee = meetCost * 2 + vegtableCost * 2;
	      // 김치2, 두부1, 파1, 고기1

	      String gukbab = "국밥";
	      int gukbabCost = 6000;
	      int gukbabFee = meetCost * 3 + vegtableCost * 1;

	      // 고기1 파1

	      String jaeyuk = "제육덮밥";
	      int jaeyukCost = 7000;
	      int jaeyukFee = meetCost * 3 + vegtableCost * 2 + fruitCost * 2;
	      // 고기2 , 파1, 양파1

	      
	      int kimchiNumber = 0;
	      int gukbabNumber = 0;
	      int jaeyukNumber = 0;
	      int choice = 0;
	      // 손님정보
	      // 김치찌개 주문 -> 파1 김치 ++ .
	      int sumCost = 0;
	      
	      while (true) {
	         System.out.println("1.장사하기 2.정산하기");
	         int input = p.nextInt();
	         if (input == 1) {
	            System.out.println("============메뉴판============");
	            int human = (int) (Math.random() * 5 + 1);
	            for (int i = 0; i < human; i++) {
	            
	               
	               System.out.println("1)김치찌개, 2)돼지국밥, 3)제육덮밥   4)추가주문  5)주문끝 6)안시킴" + "  <손님 : '" + (human - i) + "'명");
	               choice = p.nextInt();

	               if (choice == 1) {
	                  System.out.println("김치찌개 주문");
	                  kimchiNumber++;

	               }  if (choice == 2) {
	                  System.out.println("돼지국밥 주문");
	                  gukbabNumber++;
	               }  if(choice==3){
	                  System.out.println("제육덮밥 주문");
	                  jaeyukNumber++;
	               }
	                if(choice==4) {
	                  System.out.println("추가주문 시스템");
	                  human++;
	                  System.out.println("1)김치찌개, 2)돼지국밥, 3)제육덮밥  ");
	                  int addFood=p.nextInt();
	               
	                  if(addFood ==1) {
	                     kimchiNumber++;
	                  }
	                   if(addFood==2) {
	                     gukbabNumber++;
	                  }
	                   {
	                     jaeyukNumber++;
	                  }
	                  
	               }
	                if(choice==5) {
	                  System.out.println("주문끝");
	                  break;
	               }
	                 {
	                  System.out.println("주문 X");
	                  
	               }

	            }
	            human = (int) (Math.random() * 5 + 1);
	            int kimchiSum = kimchiCost * kimchiNumber;
	            int gukbabSum = gukbabCost * gukbabNumber;
	            int jaeyukSum = jaeyukCost * jaeyukNumber;
	            int sum = jaeyukSum + gukbabSum + kimchiSum;
	            money += sum;
	            System.out.println("김치찌개 :" + kimchiNumber + "개," + "돼지국밥 :" + gukbabNumber + "개," + "제육덮밥 : "
	                  + jaeyukNumber + "개 주문 하였습니다.");
	            System.out.println("총 합계는 =" + sum + "원 입니다!");
	            sum=0;
	            kimchiNumber=0;
	            gukbabNumber=0;
	            jaeyukNumber=0;
	         sumCost = kimchiFee + jaeyukFee + gukbabFee;
	            /*
	             * int input = p.nextInt(); if(input==1) {
	             * 
	             * i1nt customNumber = (int)(Math.random()*5+1);
	             * System.out.println("게임을 시작합니다.");
	             * System.out.println("영업을 개시하려면 1번을 선택해 주세요");
	             * 
	             * System.out.println("손님들의 주문 목록"); }
	             */

	         
	            
	         
	         }

	         if (input == 2) {

	            System.out.println("수익 =" + money);
	            System.out.println("비용 =" + sumCost);
	            System.out.println("정산금액 =" + (money - sumCost));
	         }
	      }

	}

}
