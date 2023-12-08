import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ExamAppString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("D:\\class-7\\work\\class1205\\res\\test.csv");
		Scanner scan = new Scanner(fis);

		String p = scan.nextLine();

		int allSumKor = 0;
		int allSumeng = 0;
		int allSummath = 0;
		int number = 0;
		int allTotal = 0;
		int count=0;
		float allAvg=0;


		while (scan.hasNext()) {

			String line = scan.nextLine();

			String tokens[] = line.split(",");

			String name = tokens[0];
			number++; // 총인원수

			int kor = Integer.valueOf(tokens[1]);
			allSumKor += kor; // 총 국어 점수    

			int eng = Integer.valueOf(tokens[2]);
			allSumeng += eng;

			int math = Integer.valueOf(tokens[3]);
			allSummath += math;

			int total = kor + eng + math;
			allTotal += total;
			float avg = (float) total / 3;
			 allAvg = (float)allTotal/count;
			count ++;

			System.out.printf("이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d, 합 : %d, 평균 : %.2f \n", name, kor, eng, math, total,
					avg);

		}
		

		fis.close();
		scan.close();
		/*자원을 먼저 닫아야함, 최대한 빨리  */
		System.out.printf("총인원수 : %d명, 국어총합 :%d, 수학총합 : %d, 영어총합 : %d, 전체총합 : %d 전체평균 : %f", number, allSumKor, allSumeng,
				allSummath, allTotal,allAvg);


	}

}
