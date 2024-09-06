package hw6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j = 0, k = 0;
		boolean route = true;
		while(route) {
			
		System.out.println("請輸入x的值");
		
		if (sc.hasNextInt()) {
			j = sc.nextInt();
			System.out.println("請輸入y的值");
			if (sc.hasNextInt()) {
				k = sc.nextInt();
				try {
					Calculator c1 = new Calculator(j, k);
					c1.powerXY();
					break;
				} catch (CalException ce) {
					System.out.println(ce.getMessage());
//					ce.printStackTrace();						
						break;
				}
			} else {
				printWrong();
				sc.next();
			}
		} else {
			printWrong();
			sc.next();
		}
		}

		sc.close();

	}

	public static void printWrong() {
		System.out.println("輸入的格式不正確");
	}

}
