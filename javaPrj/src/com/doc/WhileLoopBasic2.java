package com.doc;

public class WhileLoopBasic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//while문을 이용하여 1부터 100중 짝수만 출력하는 프로그램을 작성하세요

		int i=0;
		while (i<101) {
			i++;
			if(i%2==0) {
				System.out.println(i);
			}
			
			
		}
	}

}
