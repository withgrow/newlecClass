package com.newlecture.app;

public class Chapter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5|8);
		System.out.println(5&8);
		System.out.println(5^8);
		System.out.println(~5);
		System.out.println(3<<2);
		System.out.println(10>>2);
		
//		int size = 2_066_231_296;
		short b1 =0xB6 ;
		byte b2 =0x62 ;
		byte b3 =0x0B ;
		byte b4 =0x00 ;
		
		//10110110 01100010 00001011 00000000 -Big Endian
		// ->
		//00000000 00001011 01100010 10110110 -Little Endian
		
		// 각 바이트의 순서를 바꾼다
		// b1 => 10110110 -> 00000000 00000000 00000000 10110110 ->(int)b1 <<0
		// b2 => 01100010 -> 00000000 00000000 01100010 00000000 ->(int)b2 <<8
		// b3 => 00001011 -> 00000000 00001011 00000000 00000000 ->(int)b3 <<16
		// b4 => 00000000 -> 00000000 00000000 00000000 00000000 ->(int)b4 <<24(00000000으로 똑같아서 안해도 될 것 같음.)
		
		int size = (int)b1 << 0
					| (int)b2 <<8
					| (int)b3 <<16
					| (int)b4 <<24;
		
		System.out.println(size);
		
		float avg = 81f;
		
		System.out.println(avg > 80? "굿" : "노굿");
		


	}

}
