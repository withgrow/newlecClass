package com.doc;

import java.util.Scanner;


public class HotelNewlexian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Newlexian Version: 0.0.1");
		System.out.println("현재 최대 3개의 객실만 관리할 수 있습니다");
		Scanner scan = new Scanner(System.in);
		int deluxeRoomY = 0;
		int deluxeRoomN = 0;
		int standardRoomY = 0;
		int standardRoomN = 0;

		for (int i = 0; i < 3; i++) {
			System.out.print("객실 번호를 입력하세요 : ");
			int roomNumber = scan.nextInt();

			System.out.print("예약 상태를 입력하세요 (Y/N) : ");
			String roomState = scan.next();
			if (roomNumber % 2 != 0 && roomState.equals("y")) {

				deluxeRoomY++;
			} else if (roomNumber % 2 != 0 || roomState.equals("N")) {
				deluxeRoomN++;
			}

			if (roomNumber % 2 == 0 && roomState.equals("y")) {

				standardRoomY++;
			} else if (roomNumber % 2 == 0 || roomState.equals("N")) {
				standardRoomN++;
			}

		}
		System.out.println();
		System.out.println("<스탠다드 룸>");
		System.out.println("예약된 객실 수 : " + standardRoomY);
		System.out.println("예약되지 않은 객실 수 : " + standardRoomN);
		System.out.println();
		System.out.println("<디럭스 룸>");
		System.out.println("예약된 객실 수 : " + deluxeRoomY);
		System.out.println("예약되지 않은 객실 수 : " + deluxeRoomN);

	}

}
