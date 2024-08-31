package hw4;

import java.util.Arrays;

public class Hw4_1 {

	public static void main(String[] args) {
//		有個一維陣列如下:
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示:陣列,length屬性)
		int[] origin = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		Arrays.sort(origin);
		int sum = 0;
		double avgnumber=0;
		for(int i=0; i< origin.length;i++) {
			sum += origin[i];			
		}
		avgnumber=sum/origin.length;
		System.out.println("此陣列平均值為"+avgnumber);
		for(int i=0;i<origin.length;i++) {
			if(avgnumber<origin[i]) {
				System.out.print(origin[i]+" ");
			}
			
			
		}
		System.out.println("以上的值為大於平均值的元素");
		
		
	}

}
