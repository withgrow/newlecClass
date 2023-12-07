package class1205.exam;

public class Omok1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 제어구조 복습

		// 제어구조만 이용하여 다음 오목판을 콘솔에 출력하세요.

		// 단, 배열을 사용하지마세요

//		 ┌┬┬┬┬┬┬┬┬┐
//
//		 ├┼┼┼┼┼┼┼┼┤
//
//		 ├┼┼┼┼┼┼┼┼┤
//
//		 ├┼┼┼┼┼┼┼┼┤
//
//		 ├┼┼┼┼┼┼┼┼┤
//
//		 ├┼┼┼┼┼┼┼┼┤
//
//		 ├┼┼┼┼┼┼┼┼┤
//
//		 ├┼┼┼┼┼┼┼┼┤
//
//		 ├┼┼┼┼┼┼┼┼┤
//
//		 └┴┴┴┴┴┴┴┴
	
		for (int i = 0; i < 10; i++) {
			
			for (int j = 0; j < 10; j++) {
				boolean t = i >= 1 && i <= 8;
				if (i == 0 && j == 0) {
					System.out.print("┌");

				}

				else if (i == 0 && j == 9) {
					System.out.println("┐");
				}

				else if (i == 9 && j == 0) {
					System.out.print("└");
				} else if (i == 9 && j == 9) {
					System.out.print("┘");
				} else if (i == 0) {
					System.out.print("┬");
				} else if (i == 9) {
					System.out.print("┴");
				} else if (j == 0) {
					System.out.print("├");

				} 
				 else if (j == 9 ) {
					System.out.println("┤");
				}else  {
					System.out.print("┼");
				}

			}

		}


	}

}
