package hw5;

import java.util.Arrays;

public class element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array1= {{ 1, 6, 3},{ 9, 5, 2}};
		double[][]  array2= {{ 1.2 , 3.5 , 2.2 },{ 7.4 , 2.1 , 8.2 }}; 
		
		element e= new element();
		System.out.println(e.maxElement(array1));
		System.out.println(e.maxElement(array2));
		
	}
	
	public int maxElement(int x[][]) {
		int intElement[] = new int[x[0].length];
		int maxintElement=0;
		for(int i=0;i < x.length;i++) {
			 
			Arrays.sort(x[i]);
			intElement[i] = x[i][(x[i].length)-1];		
			Arrays.sort(intElement);
			maxintElement = intElement[intElement.length-1];
	}
		
		return maxintElement;
		
		
		
	}
	public double maxElement(double x[][]) {
		double doubleElement[] = new double[x[0].length];
		double maxDoubleElement = 0.0;
		for(int i=0;i < x.length;i++) {
			 
			Arrays.sort(x[i]);
			doubleElement[i] = x[i][(x[i].length)-1];		
			Arrays.sort(doubleElement);
			maxDoubleElement = doubleElement[doubleElement.length-1];
	}
		
		return maxDoubleElement;
	}

}
