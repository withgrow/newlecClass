package com.doc;

public class WhileLoopBasic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// do-while문을 이용하여 1부터 100중 홀수만 출력하는 프로그램을 작성하세
		int i = 0;
		do {
			i++;
			if (i%2 == 1) {
				System.out.println(i);
			}

		} while (i<100);
	}

}