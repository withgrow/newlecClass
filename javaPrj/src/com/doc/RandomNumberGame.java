package com.doc;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int randomNumber = rand.nextInt(10) + 1;

		boolean p = true;
		Scanner scan = new Scanner(System.in);
		System.out.println(randomNumber);
		while (p) {
			System.out.println("숫자를 입력하세요");
			int number = scan.nextInt();

			if (randomNumber > number) {
				System.out.println("그것보다는 크다");
			} else if (randomNumber < number) {
				System.out.println("그것보다는 작다");
			} else if (randomNumber == number) {
				System.out.println("정답이다");
				p = false;
			}
		}
	}
}
