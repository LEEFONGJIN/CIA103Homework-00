package Hw1;

public class Test4Numbers {

	public static void main(String[] args) {
//		 WAY 1 :請建立一個JAVA 可輸出0~100裡面 4的倍數
		int x = 0;
		while (x <= 100 && ((x % 4) == 0)) {
			System.out.print(x + " ");
			x += 4;
		}
		System.out.println(" ");
//		 WAY 2:請建立一個JAVA 可輸出0~100裡面 4的倍數
		int y = 0;
		int count = 4;
		do {
			System.out.print(y);
			y += count;
		} while (y <= 100);
		System.out.println(" ");//位於main方法 以利資料換行 方便觀察使用
//      WAY 3:請建立一個JAVA 可輸出0~100裡面 4的倍數
		for (int i = 0; i <= 100; i++) { // 若計次 (i+=4) 則if可以不用寫
			if (i % 4 == 0) {
				System.out.print(i + " ");// println:會換行 print:不換行 | ( i +" " ) 數字間加空白
			}
		}
	}
}
