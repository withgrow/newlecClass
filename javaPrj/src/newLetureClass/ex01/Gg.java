package newLetureClass.ex01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.invoke.MethodHandles.Lookup.ClassOption;

public class Gg {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream ps = new FileOutputStream("C:\\Users\\hi\\eclipse-workspace\\javaPrj\\res/ed3.txt");
		PrintStream ps2 = new PrintStream(ps);
		
		ps2.print(65);
		ps.write(65); 
		ps.write('A');
		ps2.print("안녕하세요~ 만나서 \"반\"갑습니다. \\^^, 다음에 또 만나요~:-)");
		System.out.println("\"안녕\" ");
	}

}
