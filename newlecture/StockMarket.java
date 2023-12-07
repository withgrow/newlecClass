package exam1204;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class StockMarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 뉴렉이는 숨겨진 주식의 고수에요.

		// 기업 뉴렉슬라의 일 주식 가격을 수집한 뉴렉이는 가장 주식 가격의 변동이 큰 날을 찾으려해요.

		// 뉴렉이를 도와 가장 변동이 큰 날과, 변동된 값을 출력해주세요.
		// Java에서는 Math.abs로 절대값을 구할 수 있다고해요
//
//		출력:
//		가장 큰 가격 변동이 일어난 날: 3일 (4일로 나와도 무관)
//
//		변동값: 60

		int[] prices = { 120, 140, 180, 240, 220, 205, 180 };
		int index = 0;
		int max = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			int k = Math.abs(prices[i] - prices[i + 1]);
			if (k > max) {
				max = k;

			}
			if (max == k) {
				index = i;
			}
		}
		System.out.printf("가장 가격 변동이 일어난 날 : %d 일 \n", index + 1);
		System.out.println("변동값 = " + max);
		

	}

}
