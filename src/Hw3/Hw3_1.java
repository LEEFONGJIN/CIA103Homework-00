package Hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Hw3_1 {

	public static void main(String[] args) {

		// 是否為三角形 、a,b,c 皆不可為0 . 、任兩邊長之和大於第三邊。
		// 當a*a+b*b=c*c 為直角三角形,所有邊具有a*a+b*b>c*c則為銳角三角形，
		// 若有一邊具a*a+b*b<c*c則為鈍角三角形。

		// 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
		// 三角形、其它三角形或不是三角形,如圖示結果:
//		Scanner sc = new Scanner(System.in);//用迴圈寫法來 建立 輸入字元(整數)
//		int[] data= new int[3];	
//		for(i = 0; i< data.length;i++){
//		data[i]= sc.nextInt();
//		}	
		int i, j, k;
		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入三個整數 並用空格隔開:");
		if (sc.hasNextInt()) {
			i = sc.nextInt();
			j = sc.nextInt();
			k = sc.nextInt();
			int[] x = { i, j, k };

			Arrays.sort(x);
			if ( (x[0] + x[2] > x[1]) && (x[2] + x[1] > x[0])&& (x[1] + x[0] > x[2])) {

				if (x[0] == x[1] && x[1] == x[2]) {
					System.out.println("正三角形");
				}

				else if (x[0] == x[1] || x[1] == x[2] || x[2] == x[0]) {
					System.out.println("等腰三角形");
				}
				else if (x[0] * x[0] + x[1] * x[1] == x[2] * x[2]) {
					System.out.println("直角三角形");
				}else {
					System.out.println("其他三角形");
				}
			} else {
				System.out.println("不是三角形");
				sc.close();

			}
		}

	}
}
