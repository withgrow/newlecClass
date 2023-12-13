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
			FileInputStream fis = new FileInputStream("C:\\Users\\oneto\\git\\newlecClass\\FigmaPrj\\src\\board2.txt");
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
		FileInputStream fis = new FileInputStream("C:\\Users\\oneto\\git\\newlecClass\\FigmaPrj\\src\\board2.txt");
		Scanner scan = new Scanner(fis);

		String[] str = new String[countBoard + 50];
		{
			
			while (scan.hasNextLine()) {

				str[i] = scan.nextLine();
				i++;
			}

		}
		
		{// 게시판 파일 로드해서 새로운 파일에 쓰기

			

			FileOutputStream fos = new FileOutputStream("C:\\Users\\oneto\\git\\newlecClass\\FigmaPrj\\src\\board2.txt");
			PrintStream ps = new PrintStream(fos);
	
			
			Scanner scan2 = new Scanner(System.in);  //사용자입력
			boolean a = true;
			while (a) {
				String nickname;
				do {
					System.out.println("닉네임 입력");
					nickname = scan2.nextLine();
					str[i] = nickname;
					i++;
					if(nickname.equals("q")) {
						break;
					}
				} while (nickname.equals("") || nickname == null);

			
				System.out.println("제목입력");
				str[i]= scan2.nextLine();
				i++;
				
				System.out.println("내용입력");
				str[i] = scan2.nextLine();
				i++;
				for(int x=0; x<str.length; x++) {
					
					
		
				}
			}
		
		
		
		}
		
}}
