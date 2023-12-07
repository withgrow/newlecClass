package exam1204;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.Arrays;
import java.util.Scanner;

public class DoraemonBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int bookNumber = 0;

		System.out.println("책의 갯수를 입력하세요");
		bookNumber = scan.nextInt();
		scan.nextLine();
		
		
		String[] book = new String[bookNumber * 2];
		System.out.println("책들을 입력하세요");
		
		for (int i = 0; i < bookNumber; i++) {
			
		book[i] = scan.nextLine();
		
		}

		for (int i = 0; i < book.length; i++) {
			System.out.println(book[i]);
		}

	}
	

}
