package newLetureClass.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import javax.lang.model.element.NestingKind;

public class exam1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String name1, name2, name3;
		int price1, price2, price3;

		
		// -----------------책정보저장
		{

			System.out.println("┌────────────────┐");
			System.out.println("│     책정보저장  　 │");
			System.out.println("└────────────────┘");
			FileInputStream fis = new FileInputStream("C:\\Users\\hi\\git\\newlecClass\\javaPrj\\res\\text5.txt");
			Scanner scan = new Scanner(fis);
			name1 = scan.next();
			name2 = scan.next();
			name3 = scan.next();

			
			price1 = scan.nextInt();
			price2 = scan.nextInt();
			price3 = scan.nextInt();

			scan.close();
			fis.close();
			System.out.println("<<신간 현재 책 목록>>");

			System.out.print("제목 :" + name1);
			System.out.print(",");
			System.out.print(name2);
			System.out.print(",");
			System.out.print(name3);
			System.out.println();

			System.out.print("가격 :");
			System.out.print(price1);
			System.out.print(",");
			System.out.print(price2);
			System.out.print(",");
			System.out.print(price3 + "\n");
			System.out.println("책 가격 합계 =" + (price1 + price2 + price3));
			System.out.println("책 가격 평균 =" + (float) (price1 + price2 + price3) / 3 + "\n");

		}

// -----------------책정보입력

		{
			System.out.println("┌────────────────┐");
			System.out.println("│     책정보입력  　 │");
			System.out.println("└────────────────┘");
			System.out.println("<<추가 할 책 입력>>");

			Scanner scan = new Scanner(System.in);
			System.out.print("1)추가 할 책 '제목' 입력 : ");
			name1 = scan.nextLine();
			System.out.print("1)추가 할 책 '가격' 입력 : ");
			price1 = scan.nextInt();
			if (price1 < 0) {
				System.out.println("0보다 큰 숫자 입력해주세요");
			}

			scan.nextLine();
			System.out.print("2)추가 할 책 '제목' 입력 : ");
			name2 = scan.nextLine();
			System.out.print("2)추가 할 책 '가격' 입력 : ");
			price2 = scan.nextInt();
			if (price2 < 0) {
				System.out.println("0보다 큰 숫자 입력해주세요");
			}

			scan.nextLine();

			System.out.print("3)추가 할 책 '제목' 입력 : ");
			name3 = scan.nextLine();
			System.out.print("3)추가 할 책 '가격' 입력 : ");
			price3 = scan.nextInt();
			if (price3 < 0) {
				System.out.println("0보다 큰 숫자 입력해주세요");
			}

		}

		// -----------------책정보출력
		{
			System.out.println("┌────────────────┐");
			System.out.println("│     책정보출력  　 │");
			System.out.println("└────────────────┘");

			FileOutputStream fos = new FileOutputStream("C:\\Users\\hi\\git\\newlecClass\\javaPrj\\res\\text5.txt");
			PrintStream pis = new PrintStream(fos);

			pis.printf("%s %s %s \n", name1, name2, name3); // \n 으로 개행하면 다음줄 부터 읽을수있음

			pis.printf("%d %d %d", price1, price2, price3);
			
		pis.flush();
		pis.close();
		fos.close();

		}
	}
}