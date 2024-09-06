package hw5;

public class randomAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 請設計一個方法為randAvg()，
//		從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，
		System.out.println("本次亂數的結果");	
		randomAvg r= new randomAvg();
		r.randAvg();
	}
	
	public void randAvg() {
		int[] x= new int[10];
		double total =0;
		double Avg= 0.0;
		for(int i = 0;i < 10;i++) {
			x[i]= (int)(Math.random()*101);
			System.out.print(x[i]+" ");
			total += x[i];
		}
		Avg = (double)(total/x.length) ;	
		System.out.println();
		System.out.print(Avg);
		
	}

}
