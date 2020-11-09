package _game;

import java.util.Scanner;

public class main {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lv = 1;
		int lv_p = 90;
		
		String name = "강 검";
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("=========================================");
			System.out.println("1. 강화");
			System.out.println("2. 게임종료");
			System.out.println("이름 : " +lv+ name + ", 레벨 : " + lv + ", 퍼센트 : " +lv_p);
			
			int select = sc.nextInt();
			
		
			
			if(select == 2)
				return;
			
			if(select == 1) {
			  	int persent = (int)(Math.random()*100)+1; //1 100

				System.out.println(persent);
				System.out.println(lv_p);
			   	if(persent <= lv_p) {   ///74  <= 90
			   		System.out.println("=========================================");
			   		System.out.println("강화성공 ");
			   		 
			   		lv += 1;
			   		lv_p -= 5;
			   		
			   	}else {
			   		System.out.println("=========================================");
			   		System.out.println("강화실패 ");
			   		
			   		lv = 1;
			   		lv_p = 90;
			   	}
			}
			
		}
		
		// 11 33 55
		
		//  99 
		// 1 
		
	
		
	}

  
	
   
	

}
