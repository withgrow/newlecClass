import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.SecurityPermission;
import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("회원가입");
		
		

		{
			System.out.println("사진등록");

			FileInputStream fis = new FileInputStream("C:\\Users\\hi\\git\\newlecClass\\FigmaPrj\\src\\res\\dog.jpg");
			FileOutputStream fos = new FileOutputStream(
					"C:\\Users\\hi\\git\\newlecClass\\FigmaPrj\\src\\res\\dogCopy.jpg");

			while (true) {
				int date = fis.read();
				fos.write(date);
				if (date == -1)
					break;
			}

			fos.close();
			fis.close();
		} // 사진등록

		Scanner scan = new Scanner(System.in);
		{
			System.out.print("이메일 : ");
			String signEmail = scan.nextLine();

			System.out.println("PW : ");
			String signPw = scan.nextLine();

			System.out.print("생년월일(ex.1996.03.23 : ");
			String signBirthday = scan.nextLine();

			String MBTI;

			System.out.println("MBTI : (1.ESFJ, 2.INFJ, 3.ESFP, 4.ISFJ....., 미등록 ");
			int mbtiNum = scan.nextInt();
			if (mbtiNum == 1) {
				MBTI = "ESFJ";
			} else if (mbtiNum == 2) {
				MBTI = "INFJ";
			} else if (mbtiNum == 3) {
				MBTI = "ESFP";
			} else if (mbtiNum == 4) {
				MBTI = "ISFJ";
			} else {
				MBTI = "미등록";
			}

			System.out.print("인생 책 : ");
			String likeBook = scan.nextLine();

			boolean[] preference = new boolean[12];
			System.out.println("1.인문, 2.교양, 3.소설/시/희곡, 4.과학, 5.경영/경제, 6.사회/정치, 7.건강, 8.IT, 9.수험서 자격증, 10.자기계발, 11.추리");

			for (int i = 0; i < preference.length; i++) {
				System.out.println(i + ": true / false");
				boolean op = scan.nextBoolean();
				if (op == true) {
					preference[i] = true;
				} else {
					preference[i] = false;
				}
			}

		}
	}

}
