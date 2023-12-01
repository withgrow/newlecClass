package com.doc;

import java.util.Scanner;

public class OrderManagement {
	public static void main(String[] args) {

		System.out.println("주문 상태는 ? (숫자 입력 1~5)");
		Scanner scan = new Scanner(System.in);
		int state = scan.nextInt();
		switch (state) {
			case 1: {		
			System.out.println("주문 접수");
			break;
			}
		
			case 2: {
			System.out.println("결제 완료");
			break;
			}
			
			case 3: {
			System.out.println("배송중");
			break;
			}
			
			case 4: {
			System.out.println("배송 완료");
			}
		
			case 5 :{
			System.out.println("주문 취소");
			break;
			}
		
		
		}
		
		
	}
}
