package class1205.exam;

import java.io.InterruptedIOException;
import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열을 입력받아 영문 모음(a, e, i, o, u)의 개수를 출력하는 프로그램을 작성하세요

		// 입력: programing

		// 출력: 3

		// 입력: abc

		// 출력: 1
		
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String str = scan.next();
		
		for(int i=0; i<str.length(); i++) {
			
			if((str.charAt(i) == 'a') ||(str.charAt(i)=='e')||(str.charAt(i)=='o'||(str.charAt(i)=='u')||(str.charAt(i)=='i'))) {
			count++;
			}
			
		}
		
		System.out.println(count);
	}

}
