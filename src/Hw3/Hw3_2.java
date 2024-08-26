package Hw3;

import java.util.Scanner;

public class Hw3_2 {

	public static void main(String[] args) {
		//請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
		//對則顯示正確訊息
		int i;
		i = (int)(Math.random()*10);	
		int numberIn;
		Scanner numsc = new Scanner(System.in);
		System.out.println("來玩猜數字遊戲吧"+"\n"+"請輸入一個0-9之間的數字");
		Outer:
		while(numsc.hasNextInt()) {
			numberIn = numsc.nextInt();
			if ( numberIn<0 || numberIn>9 ) {
				System.out.println("請重新輸入數字 數字範圍:0~9");
			}else {
				if(numberIn == i ) {
					System.out.print("猜對瞜");
					break;
				}else {
					System.out.println("答錯瞜 繼續猜吧");
					continue Outer;
					
				}
			}
		}
		numsc.close();
		
			
		
	}

}
