package com.newlecture.app;

import java.util.Scanner;

public class scenario2 {

	public static void main(String[] args) {
		//가위 바위 보 게임
		
		for(int i=0; i <5; i++) {
		System.out.println("가위 바위 보를 해봅시다");
		System.out.println("1-3까지 입력하시오.1:가위 / 2: 바위 3: 보 입니다.");
		
		
		Scanner me = new Scanner(System.in);
		int input = me.nextInt();
		
		
		int com = (int)(Math.random()*3) +1; // 컴퓨터
		System.out.println(com);
		
		if(input == com) {
			System.out.println("비겼습니다.");
		}
		else if (input-com == -2 ||input-com ==1 || input-com ==1) {
			System.out.println("이겼습니다.");
		}else if (input-com == -1 || input-com ==2) {
			System.out.println("졌습니다.");
		}
		
		
		}
		

	}

}
