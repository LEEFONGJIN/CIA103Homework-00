package Hw3;

import java.util.Scanner;

public class GPTtri {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入三個數字（邊長），用空格分隔：");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (isTriangle(a, b, c)) {
            if (a == b && b == c) {
                System.out.println("正三角形");
            } else if (a == b || b == c || a == c) {
                System.out.println("等腰三角形");
            } else {
                System.out.println("其它三角形");
            }
        } else {
            System.out.println("不是三角形");
        }

        scanner.close();
    }

    private static boolean isTriangle(double a, double b, double c) {
        // 判斷三個邊長是否能構成三角形
        return (a + b > c) && (a + c > b) && (b + c > a);

	}

}
