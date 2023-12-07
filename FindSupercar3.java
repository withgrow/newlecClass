package exam1204;

import java.awt.font.NumericShaper;

import javax.security.auth.kerberos.KerberosCredMessage;

public class FindSupercar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문득 뉴렉이는 슈퍼카들의 평균 속도와 평균 속도보다 빠른 차들이 몇개인지 궁금해졌어요.

		// 뉴렉이를 도와서 슈퍼카들의 평균 속도와, 평균 속도보다 빠른 차들의 개수를 출력해주세요

		// 출력:

		// 평균 속도: 174.16666666666666 ( 또는 174로 출력해도 무관)

		// 평균속도보다 빠른 차의 개수는 3개

		int[] superCars = { 100, 320, 56, 220, 49, 300 };
		float avgSpped = 0;
		int number = 0;
		int total = 0;

		for (int i = 0; i < superCars.length; i++) {
			total += superCars[i];

		}
		avgSpped = total / superCars.length;
		for (int j = 0; j < superCars.length; j++) {
			if (superCars[j] > avgSpped) {
				number++;
			}
		}

		System.out.printf("평균속도 : %f \n", avgSpped);
		System.out.printf("평균속도보다 빠른 차의 개수는 %d 개", number);

	}

}
