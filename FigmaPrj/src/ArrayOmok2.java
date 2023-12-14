

import java.awt.desktop.PrintFilesEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.channels.IllegalChannelGroupException;
import java.sql.SQLTransactionRollbackException;
import java.util.Arrays;
import java.util.Scanner;

import javax.net.ssl.CertPathTrustManagerParameters;
import javax.security.auth.callback.ConfirmationCallback;
import javax.xml.transform.Templates;

public class ArrayOmok2 {

	public static void main(String[] args) throws FileNotFoundException {
		Omok[] omoks;
		int count = 0;

		char[][] board = null;
		int turn = 0;  //흑백 순서 -> 이게 짝수면 흑, 홀수면 백
		char blac = '●';
		char white = '○';
		int WIDTH = 0, HEIGHT = 0;

		int firstGame = 0;

		System.out.println("1.불러오기, 2.새로하기 ");
		Scanner scan3 = new Scanner(System.in);
		int firstinput = scan3.nextInt();

		switch (firstinput) {
		case 1: {

			{ // 불러오기 //case1

				FileInputStream fis = new FileInputStream("E:\\hong\\workspace\\JavaProject\\res\\saveOmok.txt");
				Scanner scan = new Scanner(fis);

				HEIGHT = Integer.parseInt(scan.nextLine());
				WIDTH = Integer.parseInt(scan.nextLine());
				char board2[][] = new char[HEIGHT][WIDTH];
				board = board2;
				for (int i = 0; i < HEIGHT; i++) {
					for (int j = 0; j < WIDTH; j++) {
						String what = scan.nextLine();
						
						board[i][j] = what.charAt(0);

					}
				}
			}
			break;
			
			
		} // case1
		case 2:

			// case2
			Scanner scan = new Scanner(System.in);

			System.out.print("행의 개수를 입력하세요 : ");
			HEIGHT = scan.nextInt();
			System.out.print("열의 개수를 입력하세요 : ");
			WIDTH = scan.nextInt();

			board = new char[HEIGHT][WIDTH];
			omoks = new Omok[WIDTH * HEIGHT];

		{
			for (int y = 0; y < HEIGHT; y++) {

				for (int x = 0; x < WIDTH; x++) {

					if (y == 0 && x == 0) {
						board[y][x] = '┌';
					} else if (y == 0 && x == WIDTH - 1) {
						board[y][x] = '┐';

					} else if (y == 0) {
						board[y][x] = '┬';
					}

					else if (y == HEIGHT - 1 && x == 0) {
						board[y][x] = '└';
					} else if (y == HEIGHT - 1 && x == WIDTH - 1) {
						board[y][x] = '┘';
					}

					else if (x == 0) {
						board[y][x] = '├';

					} else if (x == WIDTH - 1) {
						board[y][x] = '┤';
					} else if (y == HEIGHT - 1) {
						board[y][x] = '┴';
					} else {
						board[y][x] = '┼';
					}
				}

			}
		} // casse2
		
		
		}
		// 판출력
		for (int y = 0; y < HEIGHT; y++) {

			for (int x = 0; x < WIDTH; x++) {
				System.out.print(board[y][x]);

			}
			System.out.println();
		}

		boolean change = true;
		while (change) {

			Scanner scan = new Scanner(System.in);
			Omok omok = new Omok();

			System.out.print("x좌표를입력하세요 : ");
			int inputX = scan.nextInt();
			System.out.print("y좌표를입력하세요 : ");
			int inputY = scan.nextInt();

			if (board[inputY][inputX] == '●') {
				System.out.println("중복");
				continue;				
			} else if (board[inputY][inputX] == '○') {
				System.out.println("중복");
				continue;
			}
			if (turn % 2 == 0) {
				board[inputY][inputX] = blac;
			} else {
				board[inputY][inputX] = white;

			}
			turn++;
			// board 출력

			for (int y = 0; y < HEIGHT; y++) {

				for (int x = 0; x < WIDTH; x++) {
					System.out.print(board[y][x]);

				}
				System.out.println();
			}

			if (turn % 2 == 0) {
				System.out.println("1.저장하고 계속하기, 2.종료하기");
				int input = scan.nextInt();
				switch (input) {
				case 1: {
					// 파일저장
					FileOutputStream fos = new FileOutputStream("E:\\hong\\workspace\\JavaProject\\res\\saveOmok.txt");
					PrintStream ps = new PrintStream(fos);
					ps.printf("%d\n", HEIGHT);
					ps.printf("%d\n", WIDTH);
					for (int i = 0; i < board.length; i++) {
						for (int j = 0; j < board[i].length; j++) {

							ps.printf("%c\n", board[i][j]);
						}
					}
					break;
				}

				case 2: {
					System.exit(input);

				}

				}
			}
		}

	}
}