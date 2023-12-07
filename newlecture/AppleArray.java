package exam1204;

public class AppleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 뉴렉이는 무거운 사과를 왼쪽으로 두고싶어요. 뉴렉이를 도와 사과의 위치를 변경해주세요
		// 출력:
		// 사과의 위치를 바꾸기 전:

		// 10 34

		// 사과의 위치를 바꾼 후:

		// 34 10

		int[] apples = { 10, 34 };
		System.out.print("사과의 위치를 바꾸기 전: ");
		for (int apple : apples) {
			System.out.printf("%d ", apple);
		
			
		}
		System.out.println();
		System.out.print("사과의 위치를 바꾼 후: ");
		int tmp = 0;

		tmp = apples[0];
	apples[0] = apples[1];
	apples[1] = tmp;
		for (int apple : apples) {
			System.out.printf("%d ", apple);
		}

	}

}
