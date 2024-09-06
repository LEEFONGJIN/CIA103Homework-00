package hw5;

import java.util.Scanner;

public class PrintSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如
//		圖：
		System.out.println("請輸入兩個整數代表長方形的 寬 與 高 ");
		Scanner sc = new Scanner(System.in);
		int[] Square = new int[2];
		PrintSquare wrong = new PrintSquare();
		PrintSquare right = new PrintSquare();

		if (sc.hasNextInt()) {
			Square[0] = sc.nextInt();
			Square[1] = sc.nextInt();
			for (int j = 0; j < Square.length; j++) {
				if (Square[j] < 1) {
					wrong.inputWrong();
					break;
				} 					
			}
			right.starSquare(Square[0], Square[1]);
		} else {
			wrong.inputWrong();;
		}
	sc.close();
	}

	

	public void inputWrong() {
		System.out.println("請重新輸入 寬 與 高 ");
	}

	public void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int k = 0; k < width; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
