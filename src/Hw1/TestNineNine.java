package Hw1;

public class TestNineNine {

	public static void main(String[] args) {
		
// Part 1 用for, while 迴圈處理99乘法表
		
//		int i, j; 
//		for (i = 1; i <= 9; i++) {
//			j = 1;
//			while (j <= 9) {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			}
//			System.out.println();
		
// Part 2 用for ,do while 迴圈處理99乘法表
//		int x, y;
//		for (x = 1; x <= 9; x++) {
//			y = 1;
//			do {
//				System.out.print(x + "*" + y + "=" + x * y + "\t");
//				y++;
//			} while (y <= 9);
//			System.out.println();
//		}
//Part 3 用while ,do while 迴圈處理99乘法表
		int a,b;
		a=1;b=1;
			while( a <=9 ) {
				b=1;
				do {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
				b++;
				}while( b <=9 );
				System.out.println();
			a++;
			}
	}
}

//		}

//			System.out.print(i + "*" + j + "=" + i * j + "\t");
//		System.out.println();
