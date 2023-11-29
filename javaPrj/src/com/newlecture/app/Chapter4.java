package com.newlecture.app;

import java.util.Scanner;

public class Chapter4 {

	public static void main(String[] args) {

		
		while(true) {
		
		System.out.println("1부터 100사이의 성적을 입력해주세요");
		System.out.println("만약 그만 하고 싶으시면 101을 써주세요.");
		
		
		
		Scanner 입력도구 = new Scanner(System.in);
		int input = 입력도구.nextInt();
		char grade;
		
		if(input == 101) {
			break;
		}

		
		  if(input >=0 && input <= 100) {
			 
			  /*
		   if (input >= 90) {
			   grade = 'A';
			   
		   }else if(input >= 80) {
			   grade = 'B';
		   }else if(input >= 70) {
			   grade = 'C';
		   }else  {
			   grade = 'F';
		   }
			   */
			  
				   if (input < 70) {
					   grade = 'F';
				   }
				   else if (input >= 70 && input < 80) {
					   grade = 'C';
				   }
				   else if (input >= 80 && input < 90) {
					   grade = 'B';
				   }
				   else { grade = 'A';}
				   
				   System.out.println(grade);
				   
		  }
		    else
		    	{
			   System.out.println("잘못된 정보입니다 다시 입력해주세요.");
		   }
		}
		  
		   
		   

		  
	}

}
