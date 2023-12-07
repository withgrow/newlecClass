package class1205.exam;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Cl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        exam e = new exam();
		
		e.input(e);
		e.print(e);
		
	}



	
}



class exam{
	
	int kor;
	int math;
	int eng;
	
	
	public  void input(exam e) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("국어성적입력");
		e.kor = scan.nextInt();
		System.out.println("영어성적입력");
		e.eng = scan.nextInt();
		System.out.println("수학성적입력");
		e.math = scan.nextInt();
	}
		public void print(exam e) {
			// TODO Auto-generated method stub
			System.out.println("<<성적출력>>");
			System.out.printf("국어 %d", e.kor);
			System.out.printf("영어 %d", e.eng);
			System.out.printf("수학 %d", e.math);
			int total = e.kor+e.eng+e.math;
			float avg = (float)total/3;
			System.out.printf("합계 : %d",total);
			System.out.printf("평균 : %f",avg);
		}
	}
	

	
