package exam1204;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class HotelNewlexian2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 호텔 뉴렉시안이 개발자 뉴렉이에게 추가적인 요구사항을 주었어요.

		// 클라이언트의 요구사항을 보고 구현해주세요

		// * 객실 예약 시스템이 필요해졌어요.

		// * 객실 수를 입력하고, 객실 번호를 입력하면 예약 가능한지 확인하고,

		// 예약을 진행하는 프로그램을 만들어주세요
		Scanner scan = new Scanner(System.in);
		System.out.println("Newlexian Version: 0.0.2");
		System.out.println("객실 갯수를 입력하세요");
		int roomNumber = scan.nextInt();
		int res = 0;
		String yesno;

		boolean[] arr = new boolean[roomNumber];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = true;
		} // 배열초기화 true

		while (true) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == false) {
					yesno = "예약불가";
				} else {
					yesno = "예약가능";
				}
				System.out.printf("%d : %s\n", i + 1, yesno);
			}

			System.out.print("몇번 방을 예약하시겠습니까? (0을 입력하면 종료됩니다) : ");
			res = scan.nextInt();

			if (res == 0) { // 종료
				System.out.println("종료합니다");

				return;
			}

			if (arr[res - 1] == true) {
				System.out.printf("%d번 방이 예약 되었습니다. \n", res);

				arr[res - 1] = false;
			}

			else {
				System.out.printf("%d 번방은 예약이 불가능 합니다 다시 입력해주세요 \n", res);
				do {
					res = scan.nextInt();
					if (arr[res - 1] == false) {
						System.out.println("다시입력해주세요");
					}

				} while (!(arr[res - 1] == true));
				arr[res - 1] = false;
				System.out.printf("%d번 방이 예약 되었습니다. \n", res);
				System.out.println();

			}

		}

	}
}
