package class1205.exam;

public class FindLongestSupercar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] supercars = {"Lamborghini Sesto Elemento", "Mercedes-Benz SLR McLaren", 
				"ASTON MARTIN Victor", "Ferrari 360 Modena"};
	
		int maxLen =0;
		int index =0;
		for(int i=0; i<supercars.length; i++) {
			
			if(supercars[i].length()>maxLen) {
				maxLen =supercars[i].length();
				index=i;
			}
		}
		System.out.printf("가장 빠른 차의 문자길이 = %d \n",maxLen);
		System.out.println(supercars[index]);
	}

}
