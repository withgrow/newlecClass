package com.doc;

import java.util.Scanner;

public class LateManager {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("학생이름을 입력 하세요");
		String name = scan.nextLine();
		System.out.println("도착시간을 입력하세요(시간)");
		int hour = scan.nextInt();
		System.out.println("도착시간을 입력하세요(분)");
		int min = scan.nextInt();

		if (hour >= 9 && min >= 30) {
			System.out.println(name + "은 지각이에요");
		} else {
			System.out.println(name + "은 잘 왔네요");
		}
	}
}