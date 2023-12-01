package com.doc;

public class WhileLoopBasic4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while문을 이용하여 1부터 100까지 짝수의 합을 출력하는 프로그램을 작성하세요
		int i = 0;
		int sum = 0;
		while (i < 100) {
			i++;
			
			if (i % 2 == 0) {
				sum = sum + i;

			}
			

		}
		System.out.println(sum);
	}
}