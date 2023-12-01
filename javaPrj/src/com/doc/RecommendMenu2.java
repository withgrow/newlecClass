package com.doc;

import java.util.Scanner;

public class RecommendMenu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		boolean p = true;
		 while(p) {
			System.out.println("숫자를 입력하세요");
			int number = scan.nextInt();
			
		switch (number) {
		case 1: {
			
		System.out.println("떡뽁이");
		break;
		}
		case 2: {
			System.out.println("어묵");
			break;
			
		}
		case 3: {
			System.out.println("순대");
			break;
			
		}
		case 4: {
			System.out.println("튀김");
			break;
			
		}
		case 5: {
			System.out.println("핫도그");
			break;
			
		}
	
		case 6: {
			System.out.println("종료합니다");
			p =false;
		}
		
		}
			
			
			
		}
		
	}
	
	

}
