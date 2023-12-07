package class1205.exam;

import java.util.Scanner;

public class Gdfg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("숫자입력");
		Scanner p = new Scanner(System.in);
		
		int k = p.nextInt();
		int s=0;
		String a1 = " ";
		String a2 = " ";
		String a3 = " ";
		String a4 	=" ";
		
		 s = k/10000;  //1    몫
		 a1 +=s;
		 
		 k = k%10000;		//나머지
		 
	
		
		 s= k/1000;
		 k= k%1000;
		 a2 +=s;
		 

		
		 
		 s= k/100;
		 k = k%100;
		 a3+=s;
		 
		 s= k/10;
		 k = k%10;
		 a4+=s;

System.out.print(k + a4+ a3+ a2+ a1);
		
		
		
		
//		System.out.println(12345/10000);  //몫
//		System.out.println(12345%10000);	//나머지
//		
//		
//		System.out.println(2345/1000);
//		System.out.println(2345%1000);
//		
//		System.out.println(345/100);
//		System.out.println(345%100);
//		
//		System.out.println(45/10);
//		System.out.println(45%10);   
//		
	}

}
