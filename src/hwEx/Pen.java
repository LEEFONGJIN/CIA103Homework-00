package hwEx;

public abstract class Pen {

	private String brand;
		private double price;
		
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public void setPrice(double price) {
		if (price>0)
			this.price=price;
		else
			System.out.println("請重新確認價格");
		
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getPrice() {
		
		return price;
		
	}
	
	public Pen() {
		
	}
	public Pen(String brand,double price) {
		this.brand= brand;
		setPrice(price);
		
	}
	public abstract  void write();
	
	
}
