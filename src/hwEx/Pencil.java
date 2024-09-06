package hwEx;

public class Pencil extends Pen{
	
	public Pencil() {
		
	}
	public Pencil(String brand, double price) {
		super(brand, price);
	}
	public double getPrice() {
		
		return super.getPrice() * 0.8;
		
	}
		
	public void write() {
		System.out.println("削鉛筆再寫");
	} 
	
}
