package Hw2;

public class Hw2 {

	public static void main(String[] args) {
//		• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int x = 0;
		for (int num = 1; num <= 1000; num++) {
			if (num % 2 == 0) {
				x += num;
			}
		}
		System.out.println(x);
		System.out.println("===========================================");
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int y = 1;
		for (int multiply = 1; multiply <= 10; multiply++) {
			y *= multiply;
		}
		System.out.println(y);
		System.out.println("===========================================");
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int z = 1;
		int count = 1;
		while (count <= 10) {

			z *= count;
			count++;

		}
		System.out.println(z);
		System.out.println("===========================================");
//		• 請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100
		int a;
		int num2;
		for (num2 = 1; num2 <= 10; num2++) {
			a = num2 * num2;
			System.out.print(a + " ");
		}
		System.out.println("\n"+"===========================================");
//		• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//		輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
//      x/10==4 || x%10==4
		int remainingnumber;
		remainingnumber = 0;
		for(int number=1; number <= 49 ; number++ ) {
			if( (number/10) != 4 && (number%10) != 4) {
				System.out.print(number+" ");
				remainingnumber +=1;
			}			
		}
		System.out.println("\n"+"阿文可選擇之數字如上方所示");
		System.out.println(remainingnumber+"個數字可以選擇");
		System.out.println("\n"+"===========================================");
//		• 請設計一隻Java程式,輸出結果為以下://思路:總計有10排 第N排有11-N個數字故 row+line<=11
//			1 2 3 4 5 6 7 8 9 10
//			1 2 3 4 5 6 7 8 9
//			1 2 3 4 5 6 7 8
//			1 2 3 4 5 6 7
//			1 2 3 4 5 6
//			1 2 3 4 5
//			1 2 3 4
//			1 2 3
//			1 2
//			1
		int row, column;
		for( row=1 ; row<=10 ; row++){
			for( column=1 ;column+row<=11;column++){
				System.out.print(column+" ");
			}
			System.out.println();
		}
		System.out.println("\n"+"===========================================");
//		請設計一隻Java程式,輸出結果為以下:
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
		char bignumber;
		for(bignumber='A';bignumber<='F';bignumber++){
			for(int lines = 5 ; bignumber+lines>='F' ; lines--) {
				System.out.print(bignumber);
		}
		System.out.println();
		}
		
		
	}
}