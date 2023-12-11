import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("위드books");
		
		System.out.print("이메일 : ");
		String email = scan.nextLine();
		
		System.out.println("PW : ");
		String pw = scan.nextLine();
		
		
		if (email.equals("") || pw.equals("")) {
			System.out.println("이메일 또는 비밀번호를 입력해주세요");
		}
		
//		else if(email.equals(x)&& pw.equals(y) ) {
//			System.out.println("로그인 성공");
//		}
//		
//		else {
//			System.out.println("이메일 또는 비밀번호를 확인해주세요");
//		}
		
	}


}
