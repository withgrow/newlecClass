package com.doc;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import newLetureClass.ex01.ex02first;

public class ReverseParrot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
	int x = scan.nextInt();
	int e = x%10000;
	x = x /10000; 

	String k="";
	
	k+=x;
	int t;

	




	String k2 = "";
	x =e/1000;   
	e = e%1000;   
 
	k2+=x;

	

	String k3 ="";
	x= e/100;
	e = e % 100;
	k3+=x;
//	System.out.println(e); //45
//	System.out.println(x); //3
//	System.out.println(k3);
//	System.out.println("===");
	String k4 = "";
	x= e/10;
	e = e %10;
	k4+=x;


	System.out.print(e+k4+k3+k2+k);
	
	
	}

}
