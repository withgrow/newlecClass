import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class ExamBufApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int count = 0; // 젤 윗 라인 빼고, 파일 라인수 세기

		{
			FileInputStream fis = new FileInputStream("D:\\class-7\\work\\class1205\\res\\test.csv");
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

		/* 배열 저장 */
		int[] kors = new int[count]; // 국어성적을 저장하기 위한 배열생성
		int[] engs = new int[count];
		int[] maths = new int[count];
		String[] names = new String[count];

		{
			FileInputStream fis = new FileInputStream("D:\\class-7\\work\\class1205\\res\\test.csv");
			Scanner scan = new Scanner(fis);

			scan.nextLine(); // 첫줄 뺴기

			for (int j = 0; j < count; j++) {// scan이 가리키고 있는 파일에 다음 라인이 없을때 까지 반복

				String date2 = scan.nextLine(); // 한줄 읽어오기
				String[] arr2 = date2.split(","); // 한줄 읽어온것을 ","로 분리하여 배열에 저장

				names[j] = arr2[0];
				kors[j] = Integer.parseInt(arr2[1]); // kors배열에 각 이름의 국어 성적 저장
				engs[j] = Integer.parseInt(arr2[2]);
				maths[j] = Integer.parseInt(arr2[3]);

			}
			scan.close();
			fis.close();
		}

		/* 성적 출력 */

		{
			int korSum = 0, engSum = 0, mathSum = 0;
			int totalSum = 0;

			for (int i = 0; i < count; i++) {
				String name = names[i];
				int kor = kors[i];
				int eng = engs[i];
				int math = maths[i];
				int total = kor + eng + math;

				korSum += kor;
				engSum += eng;
				mathSum += math;
				totalSum += total;
				Double avg = (double) total / 3;

				System.out.printf("이름: %s 국어: %d 영어: %d 수학: %d 총합: %d 평균 :%f  \n", name, kor, eng, math, total, avg);

			}

			/*
			 * int[] tmpArr = kors; kors =engs; engs= tmpArr; 참조변경
			 */

			System.out.println("변경 전 = " + Arrays.toString(kors));
				for (int j = 0; j < count - 1; j++) {    // <라운드라생각>
					for (int i = 0; i < count - 1 - j; i++) { // <비교횟수라생각>
	
						if (kors[i] > kors[i + 1]) {
	
							int tmp = 0;
							tmp = kors[i];
							kors[i] = kors[i + 1];
							kors[i + 1] = tmp;
							System.out.println(Arrays.toString(kors));
						}
	
					}
				}


			
			for(int j=0; j<count; j++) {
				
				int minIndex = j;
				for (int i = 0; i < count - 1; i++) {	
					
					if (kors[i] < kors[i + 1]) {
						minIndex = i;
					}
					
					int tmp = 0;
					
					tmp = kors[minIndex];
					kors[minIndex] = kors[i];
					kors[i] = tmp;

				}
			}
		}
		System.out.println(Arrays.toString(kors));

		/*
		 * System.out.println("arr[0], arr[2] 변경전 =>=>" + Arrays.toString(kors)); int
		 * tmp = 0; tmp = kors[0]; kors[0] = kors[2]; kors[2] = tmp;
		 * System.out.println("arr[0], arr[2] 변경후 =>" + Arrays.toString(kors)); 변경작업
		 */

	}

}
