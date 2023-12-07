package class1205.exam;

import java.util.Scanner;

public class ExtractDomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 뉴렉이네 쇼핑몰은 이메일 회원가입을 지원해요

		// 뉴렉이는 어떤 사이트(도메인)의 회원들이 쇼핑몰을 이용하는지 데이터를 수집하려해요

		// 뉴렉이를 도와 사용자 이메일의 도메인을 추출하는 프로그램을 작성해주세요

		// 입력 : newlec@newlecture.com
		// 출력 : newlecture.com

		// 입력 : tom@never.io

		// 출력 : never.io
		Scanner scan = new Scanner(System.in);
		System.out.println("이메일을 입력하세요");
		String email = scan.nextLine();
		
		System.out.println(email.substring(email.indexOf('@')+1));
		
		
	}

}
