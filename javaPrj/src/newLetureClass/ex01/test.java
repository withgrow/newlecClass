package newLetureClass.ex01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.WriteAbortedException;
import java.io.Writer;
import java.lang.invoke.MethodHandles.Lookup.ClassOption;

import javax.print.attribute.standard.OutputDeviceAssigned;

import EX1.chapter01;

public class test {
public static void main(String[] args) throws IOException {
	
	char ch = 'a';
	
	FileOutputStream fos = new FileOutputStream("res/text2.txt");
	PrintStream fout = new PrintStream(fos);
	fout.println("┌────────────────┐");
	fout.println("ㅣ     성적출력     ㅣ");
	fout.println("└────────────────┘");
	
	
	
	
	

	fout.println("hello");
	fout.print(false);
	
	

	fos.write(ch);
	fos.write(ch+1);
	fos.write(ch+2);
	fos.write(ch+3);
	fos.flush();
	fos.close();

	
	System.out.print("< < 작업완료 > >");
	System.out.print("HELLO0\0");

	
	}
}
