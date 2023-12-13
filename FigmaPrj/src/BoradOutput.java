import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;

public class BoradOutput {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		//게시글 불러오기

		FileInputStream fis = new FileInputStream("C:\\Users\\hi\\git\\newlecClass\\FigmaPrj\\src\\res\\board.txt");
		Scanner scan = new Scanner(fis);
		
	
		
		
		//게시글 쓰기 
		FileOutputStream fos = new FileOutputStream("C:\\Users\\hi\\git\\newlecClass\\FigmaPrj\\src\\board2.txt");
		PrintStream pis = new PrintStream(fos);
		Scanner scan2 = new Scanner(System.in);
		
		boolean a =true;
		while(a) {
			String nickname;
		do {
		System.out.println("닉네임 입력");
		nickname = scan2.nextLine();
		}
		while(nickname.equals("") || nickname==null);
		
		System.out.println("제목입력");
		String title = scan2.nextLine();
		System.out.println("내용입력");
		String content = scan2.nextLine();
		pis.printf("%s,", nickname);
		pis.printf("%s,",title);
		pis.printf("%s \n", content);
		
		
		}
		
	}

}
