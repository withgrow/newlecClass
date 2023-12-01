package newLetureClass.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.Scanner;

import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class ex03break {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int kor1 = 0;
		int kor2 = 0;
		int kor3 = 0;
		boolean run =true;
		while (run) {

			int menu;
			int total;
			float avg;
			{
				Scanner scan = new Scanner(System.in);
				System.out.println("┌────────────────┐");
				System.out.println("│     메인메뉴  　　 │");
				System.out.println("└────────────────┘");

				System.out.println("1.성적 입력");
				System.out.println("2.성적 출력");
				System.out.println("3.성적 읽어오기");
				System.out.println("4.성적저장하기");
				System.out.println("5.종료");
				System.out.print("선택> ");

				menu = scan.nextInt();

			}

			// -------성적로드----------------------------

			switch (menu) {
			case 3: {

				FileInputStream fis = new FileInputStream("C:\\Users\\hi\\git\\newlecClass\\javaPrj\\res\\grad.txt");

				Scanner scan = new Scanner(fis);

				kor1 = scan.nextInt();
				kor2 = scan.nextInt();
				kor3 = scan.nextInt();
				System.out.println("읽어왔습니다.");
				scan.close();
				fis.close();
				break;
			}

			// ------성적출력----------------------------
			case 2: {
				System.out.println("");
				System.out.println("");
				total = kor1 + kor2 + kor3;
				avg = (float) total / 3;
				total = kor1 + kor2 + kor3;
				avg = (float) total / 3;

				System.out.println("┌────────────────┐");
				System.out.println("│     성적출력  　　 │　");
				System.out.println("└────────────────┘");
				System.out.printf("국어1 : %d \n", kor1);
				System.out.printf("국어2 : %d \n", kor2);
				System.out.printf("국어3 : %d \n", kor3);

				System.out.printf("총점 : %d \n", total);
				System.out.printf("평균 : %.2f \n", avg);
				System.out.println("==================");
				break;
			}

//------------------성적 입력---------------
			case 1: {
				System.out.println("┌────────────────┐");
				System.out.println("│     성적입력  　　 │ ");
				System.out.println("└────────────────┘");

				Scanner scan = new Scanner(System.in);
				System.out.print("kor1 : ");
				kor1 = scan.nextInt();

				System.out.print("kor2 : ");
				kor2 = scan.nextInt();

				System.out.print("kor3 : ");
				kor3 = scan.nextInt();

				System.out.printf("국어1 : %d \n", kor1);
				System.out.printf("국어2 : %d \n", kor2);
				System.out.printf("국어3 : %d \n", kor3);
				total = kor1 + kor2 + kor3;
				avg = (float) total / 3;
				System.out.printf("총점 : %d \n", total);
				System.out.printf("평균 : %.2f \n", avg);
				System.out.println("==================");
				break;
			}

			case 4: {

				FileOutputStream fos = new FileOutputStream("C:\\Users\\hi\\git\\newlecClass\\javaPrj\\res\\grad.txt");
				PrintStream ps2 = new PrintStream(fos);
				ps2.printf("%d %d %d", kor1, kor2, kor3);

				ps2.close(); // 닫아주기
				fos.close();
				break;
			}

			case 5: {
				System.out.println("종료");
				run=false;
				break;

			}

			default: {
				System.out.println("해당 메뉴는 존재하지 않습니다");
				System.out.println("메뉴로 돌아가시려면 아무키나 입력하세요");
				System.in.read();
			}

			}

		}
	}
}
