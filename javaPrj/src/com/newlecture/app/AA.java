package com.newlecture.app;

import java.util.Scanner;

public class AA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner test = new Scanner(System.in);
		int count = 0;
		int com;

		while (count <= 30) {
			com = (int) (Math.random() * 3) + 1;

			System.out.println("현재 숫자: " + count);
			System.out.println("1. 1UP , 2. 2UP , 3. 3UP");
			System.out.print("선택: ");
			int test2 = test.nextInt();
			
			if (test2 == 1 && com == 1) {
				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\"");
				count += 1;
				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\"");
				count += com;
			} else if (test2 == 1 && com == 2) {
				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\"");
				count += 1;
				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\"");
				count += com;
			} else if (test2 == 1 && com == 3) {
				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\"");
				count += 1;
				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\" " + "\"" + (count + 3) + "\"");
				count += com;
				
			} else if (test2 == 2 && com == 1) {
				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\"");
				count += 2;
				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\"");
				count += com;

			} else if (test2 == 2 && com == 2) {
				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\"");
				count += 2;
				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\"");
				count += com;
			} else if (test2 == 2 && com == 3) {
				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\"");
				count += 2;
				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\" " + "\"" + (count + 3) + "\"");
				count += com;

			} else if (test2 == 3 && com == 1) {
				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\" " + "\"" + (count + 3) + "\"");
				count += 3;
				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\"");
				count += com;
			} else if (test2 == 3 && com == 2) {
				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\" " + "\"" + (count + 3) + "\"");
				count += 3;
				System.out.println("컴퓨터가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\"");
				count += com;
			} else if (test2 == 3 && com == 3) {
				if(count==31) {
				System.out.println("내가 호명한 숫자 \"" + (count + 1) + "\" \"" + (count + 2) + "\" " + "\"" + (count + 3) + "\"");
				count += com;
				break;
				}
				count += 3;
				if(count==31) {
				System.out.println("컴퓨터가 호명한 숫자 \"" + (count) + "\" \"" );
				count += com;
				break;
				}
			}
			
		}
		System.out.println("게임종료");

	}

}
