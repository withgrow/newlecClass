

import java.util.Scanner;

public class array2App {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Omok[] omoks;
		int count = 0;

		System.out.println("행을입력하세요");
		final int HEIGHT = scan.nextInt() + 1;

		System.out.println("열을 입력하세요");
		final int WIDTH = scan.nextInt() + 1;

		omoks = new Omok[WIDTH * HEIGHT];

		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++) {

				if (i == 0 && j == 0) {
					System.out.print("┌");
				} else if (i == 0 && j == WIDTH - 1) {
					System.out.println("┐");
				} else if (i == WIDTH - 1 && j == 0) {
					System.out.print("└");
				} else if (i == WIDTH - 1 && j == WIDTH - 1) {
					System.out.print("┘");
				}

				else if (i == 0) {
					System.out.print("┬");
				}

				else if (i == WIDTH - 1) {
					System.out.print("┴");
				}

				else if (j == 0) {
					System.out.print("├");
				}

				else if (j >= WIDTH - 1) {
					System.out.println("┤");
				}
				//
				else {
					System.out.print("┼");
				}

			}

		}
		System.out.println();
		// 오목입력

	
			
			int x, y;
			

			Omok omok = new Omok(); //값 집어 넣기 위한 객체 생성
			System.out.println("x좌표입력");
			x = scan.nextInt();
			
			System.out.println("y좌표입력");
			y = scan.nextInt();
			
			omok.x = x;		
			omok.y = y;
			omoks[count++] = omok; //객체배열 인덱스 마다 값 입력된 객체 가리키게함 
		
			
			
			
			
			
			// 입력받고 다시출력
			for (int i = 0; i < HEIGHT; i++) {
				for (int j = 0; j < WIDTH; j++) {

				if(j==omoks[0].x && i==omoks[0].y)	{
					System.out.print("○");
				}
					
				else if (i == 0 && j == 0) {
						System.out.print("┌");
					} else if (i == 0 && j == WIDTH - 1) {
						System.out.println("┐");
					} else if (i == WIDTH - 1 && j == 0) {
						System.out.print("└");
					} else if (i == WIDTH - 1 && j == WIDTH - 1) {
						System.out.print("┘");
					}

					else if (i == 0) {
						System.out.print("┬");
					}

					else if (i == WIDTH - 1) {
						System.out.print("┴");
					}

					else if (j == 0) {
						System.out.print("├");
					}

					else if (j >= WIDTH - 1) {
						System.out.println("┤");
					}
					//
					else {
						System.out.print("┼");
					}

				}

			}
		
	}
}
