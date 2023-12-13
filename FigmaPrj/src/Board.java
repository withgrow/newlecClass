import java.io.CharArrayReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.FileSystemAlreadyExistsException;
import java.util.Arrays;
import java.util.Scanner;

import javax.print.CancelablePrintJob;
import javax.swing.SortingFocusTraversalPolicy;

public class Board {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int num = 0;
		String name;
		String title;
		String content;
		int recommendNum = 0;
		int countBoard = 0;

		// 게시글 카운트 갯수 세기
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\hi\\git\\newlecClass\\FigmaPrj\\src\\res\\board.txt");
			Scanner scan = new Scanner(fis);

			scan.nextLine();
			while (scan.hasNextLine()) {
				countBoard++;
				scan.nextLine();
			}
			scan.close();
			fis.close();

		}

		{// 게시판 파일 로드해서 새로운 파일에 쓰기

			FileInputStream fis = new FileInputStream("C:\\Users\\hi\\git\\newlecClass\\FigmaPrj\\src\\res\\board.txt");
			Scanner scan = new Scanner(fis);

			FileOutputStream fos = new FileOutputStream("C:\\Users\\hi\\git\\newlecClass\\FigmaPrj\\src\\board2.txt");
			PrintStream ps = new PrintStream(fos);
			while (scan.hasNextLine()) {
				String p = scan.nextLine();
				ps.printf("%s\n", p);
			}
			Scanner scan2 = new Scanner(System.in);

			boolean a = true;
			while (a) {
				String nickname;
				do {
					System.out.println("닉네임 입력");
					nickname = scan2.nextLine();
				} while (nickname.equals("") || nickname == null);

				System.out.println("제목입력");
				String title2 = scan2.nextLine();
				System.out.println("내용입력");
				String content2 = scan2.nextLine();
				ps.printf("%s,", nickname);
				ps.printf("%s,", title2);
				ps.printf("%s \n", content2);

			}

//		{
//			// 게시판 추천수 합 구하는것 
//			FileInputStream fis = new FileInputStream("C:\\Users\\hi\\git\\newlecClass\\FigmaPrj\\src\\res\\board.csv");
//			Scanner scan = new Scanner(fis);
//			scan.nextLine();
//			
//			for (int i = 0; i < countBoard; i++) {
//
//				String str = scan.nextLine();
//				// 순번,닉네임,제목,내용,추천수
//				String[] arr = str.split(",");
//
//				int reNum = Integer.parseInt(arr[4]);
//
//			}
//		
//		
//		}
//		
//
//		{//계시판 검색
//			FileInputStream fis = new FileInputStream("C:\\Users\\hi\\git\\newlecClass\\FigmaPrj\\src\\res\\board.csv");
//			Scanner scan = new Scanner(fis);
//			scan.nextLine();
//			Scanner scan2 = new Scanner(System.in);
//			
//			
//			System.out.println("제목을 검색하세요 ");
//			String findText = scan2.nextLine();
//			
//			while(scan.hasNextLine()) {
//				String text = scan.nextLine();
//				
//				String[] arr = text.split(",");
//				
//				if(arr[2].contains(findText)) {
//					System.out.println("제목:"+arr[2]);
//					System.out.println("내용:"+arr[3]);
//				}	
//			}
//			
//			fis.close();
//		}
		}

	}
}