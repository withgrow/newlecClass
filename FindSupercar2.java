package exam1204;

public class FindSupercar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int HighSpeed=0;
		int fastIndex=0;
		int classicIndex=0;
		int[] superCar = {100,326,56,220,49,300};
		for(int i=0; i<superCar.length; i++) {
			
			if(superCar[i]>HighSpeed) {
				HighSpeed = superCar[i];
				fastIndex=i;
			}
			if(superCar[i]==56) {
				classicIndex = i;
			}
			
		}
		
		System.out.printf("가장 빠른차는 %d 번째 속력은 %d 입니다 \n", fastIndex+1, HighSpeed);		
		System.out.printf("클래식 슈퍼카의 인덱스는 %d\n",classicIndex);
	}

}
