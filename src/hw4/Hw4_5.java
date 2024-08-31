package hw4;

import java.util.Scanner;

public class Hw4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
		int[] Year = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// 每個月有多少天 預留0的索引值位置給1月時做運算
		int totalday = 0;
		int x =0;
		Scanner sc = new Scanner(System.in);
		int[] date = new int[3];
		System.out.println("請輸入西元__年__月__日");
		outer: 
		while (sc.hasNextInt()) {
			date[0] = sc.nextInt();
			date[1] = sc.nextInt();
			date[2] = sc.nextInt();
			x= date[1];
			for(int i = 0;i<date.length;i++) {
				if(date[i]<0) {
					dateWrong();
					continue outer;
				}
			}
				if ((date[0] % 4 == 0 && date[0] % 100 != 0) || (date[0] % 400 == 0)) {
					if (date[1] == 2 && date[2] > 29) {
						dateWrong();// 排除2月且閏年的時候
						continue outer;
					}
					Year[2] = 29;// 如果是閏年的話 將2月變成29天
					if (date[1] > 12 || date[1]<1 || date[2] > Year[x] || date[2] == 0) {
						dateWrong();// 排除大小月且日數大於30/31的時候
						continue outer;
					}
				}
				if ((date[0] % 4 != 0 || date[0] % 100 == 0 && date[0] % 400 != 0)) {
					if (date[1] == 2 && date[2] > 28) {
						dateWrong();// 排除2月且非閏年的時候
						continue outer;
					}
					if (date[1] > 12 || date[1]< 1 || date[2] > Year[x] || date[2] == 0) {
						dateWrong();// 排除大小月且日數大於30/31的時候
						continue outer;
					}
				}
			break;
			}
		
	

		for (int i = 0; i <= date[1]-1; i++) {
			totalday += Year[i];
		}
		totalday += date[2];
		sc.close();
		System.out.println("輸入的日期為該年第" + totalday + "天");

	}

	public static void dateWrong(){
		System.out.println("請重新輸入日期");
	
	}
}
