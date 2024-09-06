package hw5;

public class MyRectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		• 請另外建立一個MyRectangleMain類別，此類別只有main方法
//		 將收到的引數指定給width屬性
//		 將收到的引數指定給depth屬性
//		 能計算該長方形的面積
//		 不帶參數也無內容的建構子
//		 傳入的兩個引數會指定給對應的屬性
//		 (1) 使用public MyRectangle()建構子建立物件，
//		 設定width, depth為10, 20，透過getArea()印出結果
//		 (2) 使用public MyRectangle(double width, double depth)建構子建立物件，
//		 設定width, depth為10, 20，透過getArea()印出結果
//		(1)
		MyRectangle r1 = new MyRectangle();
		r1.setDepth(10);
		r1.setWidth(20);
		System.out.println(r1.getArea());
		System.out.println("============================");
//		(2)
		MyRectangle r2 = new MyRectangle(10.0,20.0);
		System.out.println(r2.getArea());
	}

}
