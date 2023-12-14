import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

public class AHAH {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int countBoard = 0;

		{
			FileInputStream fis = new FileInputStream("C:\\Users\\oneto\\git\\newlecClass\\FigmaPrj\\src\\res\\a2.txt");
			Scanner scan = new Scanner(fis);

			scan.nextLine();
			while (scan.hasNextLine()) {

				countBoard++;
				scan.nextLine();
			}
			scan.close();
			fis.close();

		}

		int i = 0;
		FileInputStream fis = new FileInputStream("C:\\Users\\oneto\\git\\newlecClass\\FigmaPrj\\src\\res\\a2.txt");
		Scanner scan = new Scanner(fis);

		String[] str = new String[countBoard + 50];
		{

			while (scan.hasNextLine()) {

				str[i] = scan.nextLine();
				i++;
			}

		}

		{// 게시판 파일 로드해서 새로운 파일에 쓰기

			FileOutputStream fos = new FileOutputStream(
					"C:\\Users\\oneto\\git\\newlecClass\\FigmaPrj\\src\\res\\a2.txt");
			PrintStream ps = new PrintStream(fos);

			Scanner scan2 = new Scanner(System.in); // 사용자입력
			int input = scan2.nextInt();
			switch (input) {
			case 1: {

				boolean a = true;
				int t = 1;
				while (a) {

					String nickname;
					do {

						System.out.println("닉네임 입력");
						nickname = scan2.nextLine() + ",";
						str[i] = nickname;

						if (nickname.equals("q1")) {
							break;
						}
					} while (nickname.equals("") || nickname == null);

					System.out.println("제목입력");
					str[i] += scan2.nextLine() + ",";

					System.out.println("내용입력");
					str[i] += scan2.nextLine();
					countBoard++;
					i++;
					if (t == 1) {
						for (int y = 0; y < i; y++) {
							ps.printf("%s\n", str[y]);

							t++;
						}
						countBoard++;
						continue;
					}

					for (int x = countBoard - 1; x < countBoard; x++) {

						ps.printf("%s\n", str[x]);

					}

					ps.close();
					fos.close();
				}
				break;
			}

			case 2:

			{//계시판 검색
			FileInputStream fis3 = new FileInputStream("C:\\Users\\hi\\git\\newlecClass\\FigmaPrj\\src\\res\\board.csv");
			Scanner scan3 = new Scanner(fis);
			scan.nextLine();
			Scanner scan4 = new Scanner(System.in);
			
			
			System.out.println("제목을 검색하세요 ");
			String findText = scan2.nextLine();
			
			while(scan.hasNextLine()) {
				String text = scan.nextLine();
				
				String[] arr = text.split(",");
				
				if(arr[2].contains(findText)) {
					System.out.println("제목:"+arr[2]);
					System.out.println("내용:"+arr[3]);
				}	
			}
			
			fis.close();
		}

			}
		}

	}
}
