package Hw3;

import java.util.Scanner;

public class Hw3_3 {

	public static void main(String[] args) {
//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數
//		(提示:Scanner)
//		(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)		
		System.out.println("阿文 請輸入1~9之中不想要的數字");
		int i, j;
		int count1 = 0;
		int countnum = 0;
		int[] numberSelect = new int[6];
		int[] lotto = new int[50];
		Scanner numlotto = new Scanner(System.in);
		outer:
		while (numlotto.hasNextInt()) {
			j = numlotto.nextInt();
			if ( j > 10 || j < 0  ) {
				System.out.println("請重新輸入數字");
				continue outer;
			} else {
				for (i = 0; i < lotto.length; i++) {
					lotto[i] = i;
					if ((i % 10 != j) && (i / 10 != j) && i != 0) {
						System.out.print(lotto[i] + " ");
						countnum ++;
						if ((count1 % 10) == 9) {
							System.out.println();
						}
						count1 ++;
					}
					if((i % 10 == j) || (i / 10 == j) || i == 0) {
						lotto[i]=0;
						
			
					}

				}
				System.out.println();
				System.out.println("可選取總數為"+countnum+"個");
				System.out.println("已為您排除不想要的數字 如上");
				outer2:
				for(int k = 0; k < numberSelect.length ; k++ ) {					
					numberSelect[k]=(int)(Math.random()*49+1);
					for(int l = 0 ;l<k;l++) {
						if(numberSelect[k]==numberSelect[l]) 
						{
							k --;
							continue outer2;
						}
					}
					if( lotto[numberSelect[k]] == 0 ) {
						k --;
						continue outer2;
					}
					else {
					System.out.println(lotto[numberSelect[k]]);
					}
					
				}
				
			}
			break;
		}
//		public static boolean isNumeric(String str) {
//	        // 正則表達式，匹配整數和浮點數
//	        return str.matches("-?\\d+(\\.\\d+)?");
//	    }
//		
	}
}

//			System.out.println("為您亂數取六個數字");
//			outer:
//			for(int k=0;k<6;k++) {
//				numberSelect[k]=(int)(Math.random()*49)+1;
//				if( numberSelect[k] == 0 )
//				System.out.println(numberSelect);

//		int remainingnumber;
//		remainingnumber = 0;
//		for(int number=1; number <= 49 ; number++ ) {
//			if( (number/10) != 4 && (number%10) != 4) {
//				System.out.print(number+" ");
//				remainingnumber +=1;
//			}			
