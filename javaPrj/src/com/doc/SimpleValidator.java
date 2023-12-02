package com.doc;

import java.util.Scanner;

public class SimpleValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean p = true;
		int number = 0;
		System.out.println("1을 입력해");
		while (p) {
		
		number = scan.nextInt();
		
		if(number ==1 ) {
			System.out.println("잘했어");
			p=false;
		}
		else {
			System.out.println("1을 입력해");
		}
			
		}
	}

}
