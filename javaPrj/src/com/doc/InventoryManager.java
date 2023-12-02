package com.doc;


import java.util.Scanner;

public class InventoryManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("상품 종류의 총 개수를 입력하세요:");
		int prductNmuber = scan.nextInt();
		
		System.out.print("재고 부족 기준 수량을 입력하세요:");
		int stockLackNumber = scan.nextInt();
		
		for(int i=0; i<prductNmuber; i++) {
			
			System.out.print("상품 이름을 입력하세요:");
			String prductName = scan.next();
			
			System.out.print("현재 상품 수량을 입력하세요:");
			int number = scan.nextInt();
			if(stockLackNumber>= number) {
				System.out.println(prductName +" 상품을 발주했습니다.");
			}
			else {
				System.out.println(prductName+" 상품은 재고의 여유가 충분합니다.");
			}
			System.out.println("재고 관리를 종료합니다. ");
		}
	}

}
