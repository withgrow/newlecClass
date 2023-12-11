import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Board {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		int num = 0;
		String name;
		String title;
		String content;
		int recommendNum=0;
		int countBoard = 0;

		
		//카운트 갯수 세기
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\hi\\git\\newlecClass\\FigmaPrj\\src\\res\\board.csv");
			Scanner scan = new Scanner(fis);
			
			scan.nextLine();
			while(scan.hasNextLine()) {
				countBoard++;
				scan.nextLine();
			}
			
			
			
			
		}
		
		//파일 읽기
	
	
		FileInputStream fis = new FileInputStream("C:\\Users\\hi\\git\\newlecClass\\FigmaPrj\\src\\res\\board.csv");
		Scanner scan = new Scanner(fis);
		scan.nextLine();
		
		{
	
		for (int i = 0; i < countBoard; i++) {
			
			String str = scan.nextLine();
			// 순번,닉네임,제목,내용,추천수
			String[] arr =  str.split(",");
			
			int reNum = Integer.parseInt(arr[4]);
			
		}
		}

	}

}
