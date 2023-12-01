package com.doc;

import java.util.Scanner;

public class OrderManagement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	boolean p = true;
	Scanner scan = new Scanner(System.in);
	int price =0;
	int number =0;
	int choice =0;
	while(p) {
		System.out.print("상품 가격을 입력하세요. 0을 입력하면 종료됩니다 :");
		price = scan.nextInt();
		
		
		switch (price) {
		case 0: {
			p=false;
			continue;
			}
		}

		System.out.println("개수를 입력하세요:");
		number = scan.nextInt();
		
		float sum = number*price;
		int discountPrice = 30000;
		if(sum>=discountPrice) {
			System.out.println("(할인)총액은 : " + (double)((sum)*0.9));
			}
		else {
		System.out.println("현재총액 :"+sum);
		}
		
		}
	
	}

}
