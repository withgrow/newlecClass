

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.spi.ImageInputStreamSpi;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class app {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int count = 0; // 젤 윗 라인 빼고, 파일 라인수 세기
		Exam[] exam = new Exam[count];
		{
			FileInputStream fis = new FileInputStream("E:\\hong\\workspace\\JavaProject\\res\\test.csv");
			Scanner scan = new Scanner(fis);

			String p = scan.nextLine(); // 한줄 뺴기

			while (scan.hasNext()) { // 퍼서 버려야한다, 안버리면 버퍼에 계속있는다.
				count++;
				scan.nextLine();
			}

			scan.close();
			fis.close();
		}
		System.out.println(count);

//		/* 배열 저장 */
//		int[] kors = new int[count]; // 국어성적을 저장하기 위한 배열생성
//		int[] engs = new int[count];
//		int[] maths = new int[count];
//		String[] names = new String[count];

		Exam[] exams = new Exam[count];

		{
			FileInputStream fis = new FileInputStream("E:\\hong\\workspace\\JavaProject\\res\\test.csv");
			Scanner scan = new Scanner(fis);

			scan.nextLine(); // 첫줄 뺴기

			for (int j = 0; j < count; j++) {// scan이 가리키고 있는 파일에 다음 라인이 없을때 까지 반복

				String date2 = scan.nextLine(); // 한줄 읽어오기
				String[] arr2 = date2.split(","); // 한줄 읽어온것을 ","로 분리하여 배열에 저장

				exams[j] = new Exam();
				exams[j].kor = Integer.parseInt(arr2[1]);
				exams[j].eng = Integer.parseInt(arr2[2]);
				exams[j].math = Integer.parseInt(arr2[3]);
				exams[j].name = arr2[0];
				

			}
			scan.close();
			fis.close();
		}
//------------------------------------------------- 입력받기
		// 배열 공간 늘리기
		{

			Exam[] temp = new Exam[count + 1];

			for (int i = 0; i < count; i++)
				temp[i] = exams[i];

			exams = temp;

		}
		{

			Scanner scan = new Scanner(System.in);
			Exam exam1 = new Exam();
			System.out.println("이름입력");
			exam1.name = scan.next();
			System.out.println("국어성적입력");
			exam1.kor = scan.nextInt();
			System.out.println("영어성적입력");
			exam1.eng = scan.nextInt();
			System.out.println("수학성적입력");
			exam1.math = scan.nextInt();

			exams[5] = exam1;

		}
//-------------------------------------------------
		{
			for (int j = 0; j < (count + 1) - 1; j++) { // 내림차순 정렬
				for (int i = 0; i < (count + 1) - 1 - j; i++) {

					if (exams[i].kor < exams[i + 1].kor) {

						Exam tmp = exams[i];
						exams[i] = exams[i + 1];
						exams[i + 1] = tmp;

					}

				}
			}
		}

		System.out.println(exams[0].name + exams[0].kor);
		System.out.println(exams[1].kor);

		/* 성적 출력 */ {
			int korSum = 0, engSum = 0, mathSum = 0;
			int totalSum = 0;

			for (int i = 0; i < count + 1; i++) {
				Exam exam2 = exams[i];
				String name = exam2.name;
				int kor = exam2.kor;
				int eng = exam2.eng;
				int math = exam2.math;
				int total = kor + eng + math;

				korSum += kor;
				engSum += eng;
				mathSum += math;
				totalSum += total;
				double avg = (double) total / 3;

				System.out.printf("이름: %s 국어: %d 영어: %d 수학: %d 총합: %d 평균 :%f  \n", name, kor, eng, math, total, avg);
			}

			/*
			 * 버블정렬
			 * System.out.printf("        　 국어: %d, 영어: %d, 수학: %d, 최종합 : %d",korSum,engSum,
			 * mathSum,totalSum);
			 * 
			 * System.out.println("변경 전 = " + Arrays.toString(kors)); for (int j = 0; j
			 * <count - 1; j++) { // <라운드라생각> for (int i = 0; i < count - 1 - j; i++) {
			 * //<비교횟수라생각>
			 * 
			 * if (kors[i] > kors[i + 1]) {
			 * 
			 * int tmp = 0; tmp = kors[i]; kors[i] = kors[i + 1]; kors[i + 1] = tmp;
			 * System.out.println(Arrays.toString(kors)); }
			 * 
			 * } }
			 */

		}

	}

}
