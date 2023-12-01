package com.doc;

import java.util.Scanner;

public class PigeonTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		for(int i=1; i<=9; i++) {
		
			System.out.printf("%d x %d = %d \n",num,i,num*i);
			
		}
	}

}
