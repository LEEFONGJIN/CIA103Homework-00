package hw5;

public class MyRectangle {
//		 請設計一個類別MyRectangle：
//		 (1) 有兩個double型態的屬性為width, depth
//		  (2) 有三個方法：
//		 void setWidth(double width): 
//		 void setDepth(double depth): 
//		 double getArea():
//		  (3) 有兩個建構子：
//		 public MyRectangle(): 
//		 public MyRectangle(double width, double depth): 		 		 		 

	private double width;
	private double depth;

	void setWidth(double width) {

		if (width > 0)
			this.width = width;
		else
			System.out.println("請確認width設定");
	}

	void setDepth(double depth) {
		if (depth > 0)
			this.depth = depth;
		else
			System.out.println("請確認depth設定");

	}

	double getArea() {
		
			return width * depth;
		
		}
	

	public MyRectangle() {

	}

	public MyRectangle(double width, double depth) {
		if (width <= 0) {
			System.out.println("請確認width設定");

		}
		if (depth <= 0) {
			System.out.println("請確認depth設定");
		} else {
			this.width = width;
			this.depth = depth;
		}

	}

}
