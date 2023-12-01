package com.doc;

import java.util.Scanner;

public class MembershipManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("회원 등급을 입력하세요 (bronze, silver, gold)");
		Scanner scan = new Scanner(System.in);
		String grade = scan.next();

		System.out.println("상품의 가격을 입력하세요");

		double price = scan.nextInt();

		switch (grade) {
		case "bronze": {

			price = price * 0.98;
			System.out.printf("할인된 가격은 %f 입니다", price);
			break;
		}
		case "silver": {
			price = price * 0.97;
			System.out.printf("할인된 가격은 %f 입니다", price);
			break;
		}
		case "gold": {
			price = price * 0.95;
			System.out.printf("할인된 가격은 %f 입니다", price);
			break;
		}

		}

	}
}
