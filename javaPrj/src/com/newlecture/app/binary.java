package com.newlecture.app;

public class binary {

	public static void main(String[] args) {
		
		 int a = 32;
	        
	        //숫자를 2진수,8진수,16진수 형태의 문자열로 변환
	        String bin = Integer.toBinaryString(a);
	        String oct = Integer.toOctalString(a);
	        String hex = Integer.toHexString(a);
	 
	        System.out.println("int -> 문자열 이진수 : " + bin);
	        System.out.println("int -> 문자열 8진수  : " + oct);
	        System.out.println("int -> 문자열 16진수 : " + hex);
	        System.out.println();
	        
	        // 문자열 2,8,16진수를 숫자로 변환
	        System.out.println("문자열 이진수 -> int : " + Integer.valueOf(bin, 2));
	        System.out.println("문자열 8진수  -> int : " + Integer.valueOf(oct, 8));
	        System.out.println("문자열 16진수 -> int : " + Integer.valueOf(hex, 16));
	        System.out.println();
	        
	        //2진수, 8진수, 16진수 리터럴, 각 진수를 표현하는 접미사는 대소문자 가리지 않음.
	        int binLiteral = 0b0010_0000; //2진수 리터럴 (자바7버전 부터 지원)
	        int octLiteral = 0_0000_0040; //8진수 리터럴
	        
	        int hexLiteral = 0x0000_0020; //16진수 리터럴
	                
	        System.out.println("binLiteral:" +binLiteral); //10, 10진수로 출력 
	        System.out.println("octLiteral:" +octLiteral); //10, 10진수로 출력
	        System.out.println("hexLiteral:" +hexLiteral); //10, 10진수로 출력

	}

}
