package class1205.exam;

import java.util.Scanner;

public class GH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("행을입력하세요");
		int row = scan.nextInt()+1;
		
		System.out.println("열을 입력하세요");
		int cul = scan.nextInt()+1;
		
		for(int i=0; i<row; i++) {
			for(int j = 0; j<cul; j++) {
				if(i==0&&j==0) {
					System.out.print("┌");
				}
				else if(i==0 &&j==cul-1) {
					System.out.println("┐");
				}
				else if(i==row-1&& j==0) {
					System.out.print("└");
				}
				else if(i==row-1&& j==cul-1) {
					System.out.print("┘");
				}
				
				else if(i==0) {
					System.out.print("┬");
				}
				else if(i==row-1) {
					System.out.print("┴");
				}
				
				else if( j==0) {
					System.out.print("├");
				}
				
				else if(j>=cul-1) {
					System.out.println("┤");
				}
				else {
					System.out.print("┼");
				}

			}
			
			
		}
	}

}
