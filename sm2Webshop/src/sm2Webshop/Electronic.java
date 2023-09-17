package sm2Webshop;

public class Electronic extends Product {

	private String brand;
	private String warrantyPeriod;
	
	
	
	public Electronic(String name, double price, String description, String brand, String warrantyPeriod) {
		
		
		super(name, price, description); 
		this.brand = brand; 
		this.warrantyPeriod = warrantyPeriod; 
		
	}
	
	

	public Electronic(String name, double price, String description, DiscountStrategy discountStrategy , String brand, String warrantyPeriod) {

		super(name, price, description, discountStrategy);
		this.brand = brand;
		this.warrantyPeriod = warrantyPeriod;

	}

	@Override
	public void displayProductDetails() {

		System.out.println("Electronic Product: " + name + " - Brand: " + brand + " - Warranty: " + warrantyPeriod);

	}
	
	public String getBrand() {
		
		return brand; 
		
	}
	
	
	public String getWarrantyPeriod() {
		
		return warrantyPeriod; 
		
	}
	

}
