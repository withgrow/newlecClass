

import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.zip.ZipEntry;

public class AppString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "아이유";
		String name2 = "아이유";
		System.out.println(name1 == name2);

		String name3 = new String("아이유");
		System.out.println(name1 == name3);

		System.out.println(name2.equals(name3));
		System.out.println(name1 == "아이유");

		String k = "phtot.jpg";
		System.out.println(k.indexOf("."));
		System.out.println(k.substring(0, 3));
		int number = k.indexOf('.');

		System.out.println(k.substring(0, number));

		System.out.println(k.substring(0, k.length() - 4));
		System.out.println("======================");

		// 파일명에 z가 포함되어있는지 유무를 확인해주세요 ;
		// 만약에 z문자가 없으면 '없음' 있따면 '있음'

		String k3 = "fgfge";
		System.out.println(k3.indexOf('z'));

		System.out.println("므ㅜㄴ자입력");
		Scanner scan = new Scanner(System.in);
		String b = scan.nextLine();

		if (b.indexOf('z') == -1) {
			System.out.println("z가 없습니다");
		} else {
			System.out.println("z가 있습니다");
		}

		System.out.println(b.indexOf('z') != -1 ? "z가 있습니다" : "z가 없습니다");

		int ex = 0;
		
		
		
		

		for (int i = 0; i < b.length(); i++) {  // z 갯수세기

			char c = b.charAt(i);

			if (c == 'z') {
				ex++;
			}

		}
		System.out.println(ex);
	}
}

