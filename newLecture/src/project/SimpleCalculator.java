package project;

import java.io.StringReader;
import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("<<가위바위보 게입>>");
int win=0;
int Chance=0;
Scanner scan = new Scanner(System.in);

System.out.println("몇 판을 하고 싶으신가요??");
Chance = scan.nextInt();
	
for(int i=0; i<Chance; i++) {
System.out.println("가위, 바위, 보 를 입력하세요");
	String meAnser = scan.next();
	int comAnser = (int)(Math.random()*3+1);
	String comAnswer2;
	if(comAnser==1) {
		comAnswer2 = "가위";
	}
	else if(comAnser==2) {
		comAnswer2 = "바위";
	}
	else {
		comAnswer2 ="보";
	}
	System.out.println("컴퓨터 입력 = "+comAnswer2);
	if((meAnser.equals("가위") && comAnswer2.equals("보"))||
		(meAnser.equals("바위") && comAnswer2.equals("가위"))||
		(meAnser.equals("보") && comAnswer2.equals("바위")))
		
		{
		System.out.println("사용자가 이겼습니다.");
		win++;
	}
	else if((meAnser.equals("가위")&&comAnswer2.equals("가위"))||(meAnser.equals("바위")&&comAnswer2.equals("바위")) 
		||(meAnser.equals("보")&&comAnswer2.equals("보")))
		{
			System.out.println("비겼습니다");
	}
		else {
			System.out.println("졌습니다");
		}
}
System.out.println("판수 = " +Chance +"승리 = "+win);
System.out.println("승률 = "+(((float)win/Chance)*100)+"% 입니다");
//	
//	if(meAnser.equals("가위")) {
//		if(comAnswer2.equals("보")) {
//			System.out.println("사용자 이겼습니다");
//		}
//		else if(comAnswer2.equals("바위")) {
//			System.out.println("사용자가 졌습니다.");
//		}
//		else {
//			System.out.println("비겼습니다");
//		}
//	}
//	
//	if(meAnser.equals("바위")) {
//		if(comAnswer2.equals("보")) {
//			System.out.println("사용자가 졌습니다.");
//		}
//		else if(comAnswer2.equals("바위")) {
//			System.out.println("비겼습니다");
//		}
//		else {
//			System.out.println("사용자가 이겼습니다.");
//		}
//	}
//	if(meAnser.equals("보")) {
//		if(comAnswer2.equals("보")) {
//			System.out.println("비겼습니다");
//		}
//		else if(comAnswer2.equals("바위")) {
//			System.out.println("사용자가 이겼습니다");
//		}
//		else {
//			System.out.println("사용자가 졌습니다.");
//		}
//	}
	}
}