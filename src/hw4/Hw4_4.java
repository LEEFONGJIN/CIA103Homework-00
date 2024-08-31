package hw4;

import java.util.Scanner;

public class Hw4_4 {

	public static void main(String[] args) {
//		阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下: empno{25,32,8,19,27},{2500,800,500,1000,1200}
//
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
		int countEmployee = 0;
		int[][] y = { { 2500, 800, 500, 1000, 1200}, { 25, 32, 8, 19, 27 } };
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入欲借的金額");
		outer:
		while(sc.hasNextInt()){
			int x=sc.nextInt();
			if (x < 0) {
				System.out.println("請重新輸入欲借的金額");
				continue outer;
			} else {
				System.out.println("有錢可借的員工編號:");
				for(int i = 0; i < y[0].length; i++){
					if ((y[0][i]) >= x){
						System.out.println(y[1][i]);
						countEmployee++;
					}
				}
			}
			System.out.println("總共有" + countEmployee + "人!");
		}
		sc.close();
	}

}
