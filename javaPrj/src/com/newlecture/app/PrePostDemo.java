package com.newlecture.app;

public class PrePostDemo {

	public static void main(String[] args) {
		
		int i =3;
		i++;
		System.out.println(i); //4
		
		++i;
		System.out.println(i); //5
		
		System.out.println(++i); //6
		
		System.out.println(i++); //6
		
		System.out.println(i); //7
		
		System.out.println();
		int j = 2;
		/* 4
		System.out.println(j+++ 2);
		*/
		System.out.println(++j +2);
		
		int x = 3;
		System.out.println(x != 3);
//		System.out.println(x<=2 || x>=4);
//		System.out.println(!(x>=2 && x<=4));

	}

}
