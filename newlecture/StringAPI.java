package class1205.exam;

public class StringAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 위 문자열의 길이를 출력하는 코드를 작성하세요

		// 출력: 74
		String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
		System.out.println(str.length());

		// ‘.’의 index를 출력하는 코드를 작성하세요
		System.out.println(str.indexOf('.'));

		// 출력: 73


		System.out.println(str.indexOf("simply"));
		// “simply”의 index를 출력하는 코드를 작성하세요

		// 출력: 15

		System.out.println(str.substring(6,11));

		// 문자열을 잘라 “Ipsum”을 출력하는 코드를 작성하세요


		// 문자열의 모든 문자를 대문자로 변환한후 출력하는 코드를 작성하세요

		// 위 참고 링크 확인 toUpperCase
		System.out.println(str.toUpperCase());


		// 문자열의 모든 문자를 소문자로 변환한후 출력하는 코드를 작성하세요

		// 위 참고 링크 확인 toLowerCase
		System.out.println(str.toLowerCase());

		// str.charAt(4)를 활용하여 출력 결과를 확인해보세요
		System.out.println(str.charAt(4));

		// 공백을 기준으로 문자열을 분할하여 배열에 넣고, 이 배열을 출력하세요

		String arr[] = str.split(" ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		// 위 참고 링크 확인 split

		// 힌트 .split(“ “);

		// 출력:

		// Lorem

		// Ipsum

		// is

		// simply

		// …생략

		// typesetting

		// industry.
	}

}
