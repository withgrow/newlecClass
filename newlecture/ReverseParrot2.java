package class1205.exam;

import java.awt.Image;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseParrot2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 뉴렉이네 앵무새는 문장을 말하면 거꾸로 말하는 독특한 앵무새에요.

		// “안녕 앵무야?”라는 문장을 말하면, “앵무야? 안녕"이라 말하고,
		// 0 1 2 3 4 5 6 .. 3456 201
		// “막내야 오늘 점심이 뭐냐?”라는 문장을 말하면, “뭐냐? 점심이 오늘 막내야"라 말해요.

		Scanner scan = new Scanner(System.in);
		System.out.println("sentense");
		String str = scan.nextLine();

		String[] arr = str.split(" ");

		System.out.println(arr.length);
		for (int i = arr.length - 1; i > -1; i--) {
			if (arr.length != 0) {
				System.out.print(arr[i]);
				System.out.print(" ");
			}
		}

	}

}
