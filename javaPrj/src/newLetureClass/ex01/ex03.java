package newLetureClass.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int kor1;
		int kor2;
		int kor3;
		int total;
		float avg;
		// -------성적입력----------------------------
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\hi\\git\\newlecClass\\javaPrj\\res\\grad.txt");

			Scanner scan = new Scanner(fis);

			kor1 = scan.nextInt();
			kor2 = scan.nextInt();
			kor3 = scan.nextInt();

			scan.close();
			fis.close();

		}

		total = kor1 + kor2 + kor3;
		avg = (float) total / 3;
		// ------성적출력----------------------------

		{

			System.out.println("┌────────────────┐");
			System.out.println("│     성적출력      |");
			System.out.println("└────────────────┘");

			System.out.printf("국어1 : %d \n", kor1);
			System.out.printf("국어2 : %d \n", kor2);
			System.out.printf("국어3 : %d \n,", kor3);
			System.out.println("=================");
			System.out.printf("총점 : %d \n", total);
			System.out.printf("평균 : %.2f \n", avg);
		}

//------------------성적 입력---------------
		{
			System.out.println("┌────────────────┐");
			System.out.println("│     성적입력      │");
			System.out.println("└────────────────┘");

			Scanner scan = new Scanner(System.in);

			do {
				System.out.print("kor1 : ");
				kor1 = scan.nextInt();

				if (0 > kor1 || kor1 > 100) {
					System.out.println("성적1은 0부터 100까지 입력가능합니다.");
				}
			} while (0 > kor1 || kor1 > 100);

			do {
				System.out.print("kor2 : ");
				kor2 = scan.nextInt();

				if (0 > kor2 || kor2 > 100) {
					System.out.println("성적2은 0부터 100까지 입력가능합니다.");
				}
			} while (0 > kor2 || kor2 > 100);

			do {
				System.out.print("kor3 : ");
				kor3 = scan.nextInt();

				if (0 > kor3 || kor3 > 100) {
					System.out.println("성적은 0부터 100까지 입력가능합니다.");
				}
			} while (0 > kor3 || kor3 > 100);

			total = kor1 + kor2 + kor3;
			avg = (float) total / 3;
			System.out.printf("국어1 : %d \n", kor1);
			System.out.printf("국어2 : %d \n", kor2);
			System.out.printf("국어3 : %d \n,", kor3);
			System.out.println("=================");
			System.out.printf("총점 : %d \n", total);
			System.out.printf("평균 : %.2f \n", avg);

		}
		{

			FileOutputStream fos = new FileOutputStream("C:\\Users\\hi\\git\\newlecClass\\javaPrj\\res\\grad.txt");
			PrintStream ps2 = new PrintStream(fos);
			ps2.printf("%d %d %d", kor1, kor2, kor3);

			ps2.close(); // 닫아주기
			fos.close();
		}

	}
}
