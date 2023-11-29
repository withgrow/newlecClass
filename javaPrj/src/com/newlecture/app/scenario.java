package com.newlecture.app;

public class scenario {

	public static void main(String[] args) {
		
		//롤 포지션 확률에 따른 배정 해보기
		//포지션 배정 (탑 40% / 정글 30% / 미드,원딜,서폿 10%씩 랜덤으로 배정)
		System.out.println("소환사의 협곡에 오신 것을 환영합니다.");
		 int num = (int)(Math.random()*10) +1; //랜덤 선택하기
		 System.out.println("너 뭐뽑혔니 ?" + num); //확인해보기
		 System.out.println();
	        
		 
		 	//탑 40%
	        if(num == 1 || num == 2 || num == 3 || num ==4) {
	            System.out.println("탑이 나왔습니다."); //확인해보기
	            
	            int numTop = (int)(Math.random()*10) +1; //탑에서 또 확률 나누기
	      
	            
	            System.out.println("너 뭐뽑혔니 ?" + numTop); //확인해보기
	            
	            //럼블 30%
	            if(numTop==1 || numTop==2 || numTop==3) {
	            	System.out.println("럼블");
	            }
	            //나르 30%
	            else if(numTop==4 || numTop==5 || numTop==6) {
	            	System.out.println("나르");
	            }
	            //잭스 10%
	            else if(numTop==7) {
	            	System.out.println("잭스");
	            }
	            //제이스 10%
	            else if(numTop==8) {
	            	System.out.println("제이스");
	            }
	            //케넨 10%
	            else if(numTop==9) {
	            	System.out.println("케넨");
	            }
	            //오른 10%
	            else  {
	            	System.out.println("오른");
	            } 
	        }
	        
	        
	        //정글 30%
	        else if (num == 5 || num == 6 || num == 7) {
	            System.out.println("정글이 나왔습니다."); //확인해보기
	            
	            int numJug = (int)(Math.random()*5) +1; //정글에서 또 확률나누기
	            
	            System.out.println("너 뭐뽑혔니 ?" + numJug); //확인해보기
	            
	            //자르반 20%
	            if(numJug==1) {
	            	System.out.println("자르반");
	            }
	            //바이 20%
	            else if(numJug==2) {
	            	System.out.println("바이");
	            }
	            //오공 20%
	            else if(numJug==3) {
	            	System.out.println("오공");
	            }
	            //그브 20%
	            else if(numJug==4) {
	            	System.out.println("그브");
	            }
	            // 니달리 20%
	            else  {
	            	System.out.println("니달리");
	            }
	        }
	        
	        
	        //미드 10%
	        else if (num == 8) {
	            System.out.println("미드가 나왔습니다."); // 확인해보기
	            
	            int numMid = (int)(Math.random()*10) +1; //미드에서 또 확률나누기
	            
	            System.out.println("너 뭐뽑혔니 ?" + numMid); //확인해보기
	            
	            //럼블 30%
	            if(numMid ==1 || numMid ==2 || numMid ==3) {
	            	System.out.println("럼블");
	            }
	            //사일러스 30%
	            else if(numMid ==4 || numMid ==5 || numMid ==6) {
	            	System.out.println("사일러스");
	            }
	            //제이스 20%
	            else if(numMid ==7 || numMid ==8 ) {
	            	System.out.println("제이스");
	            }
	            //리산 10%
	            else if(numMid ==9 ) {
	            	System.out.println("리산");
	            }
	            //오리아나 10%
	            else {
	            	System.out.println("오리아나");
	            }
	        }
	        
	        
	        //원딜 10%
	        else if (num == 9) {
	        	
	            System.out.println("원딜이 나왔습니다."); //확인해보기
	            
	            int numBot = (int)(Math.random()*3) +1; // 바텀에서 또 확률 나누기
	            
	            System.out.println("너 뭐뽑혔니 ?" + numBot); // 확인해보기
	            
	            //바루스 33%
	            if(numBot ==1) {
	            	System.out.println("바루스");
	            }
	            //애쉬 33%
	            else if(numBot ==2) {
	            	System.out.println("애쉬");
	            }
	            //진 33%
	            else  {
	            	System.out.println("진");
	            }
	        }
	        
	        
	        //서폿 10%
	        else if (num == 10) {
	        	
	            System.out.println("서폿이 나왔습니다."); //확인해보기
	            
	            int numSup = (int)(Math.random()*5) +1; // 서폿에서 또 확률 나누기
	            
	            System.out.println("너 뭐뽑혔니 ?" + numSup); // 확인해보기
	            
	            //노틸 40%
	            if(numSup == 1 || numSup == 2) {
	            	System.out.println("노틸러스");
	            }
	            //레오나 40%
	            else if(numSup == 3 || numSup == 4) {
	            	System.out.println("레오나");
	            }
	            //룰루 20%
	            else {
	            	System.out.println("룰루");
	            }
	       
	        }
	        
	        System.out.println();
	        System.out.println("건승하십쇼~!"); //끝난거 확인
	}
}
