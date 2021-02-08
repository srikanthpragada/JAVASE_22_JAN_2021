package oop;

class Product {
	protected String name;
	protected int price, qoh;
	public Product(String name, int price, int qoh) {
		this.name = name;
		this.price = price;
		this.qoh = qoh;
	}
	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.qoh);
	}
}

class DiscountedProduct extends Product  {
	protected int disrate;

	public DiscountedProduct(String name, int price, int qoh, int disrate) {
		super(name, price, qoh);
		this.disrate = disrate;
	}
	
	@Override 
	public void print() {
		super.print();
		System.out.println(this.disrate);
	}
}

public class TestProduct {

	public static void main(String[] args) {
		DiscountedProduct dp = 
				new DiscountedProduct("Product1",10000,10,20);
        dp.print();
        
        Product p = dp;  // upcasting 
        DiscountedProduct dp2 = (DiscountedProduct) p; // Downcasting 
        
        
        
	}

}
