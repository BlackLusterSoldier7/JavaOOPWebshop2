package sm2Webshop;

public class Clothing extends Product {

	private String size;
	private String material;
	
	
	public Clothing(String name, double price, String description, String size, String material) {
		
		super(name, price, description); 
		this.size = size; 
		this.material = material; 
		
	}
	
	
	

	public Clothing(String name, double price, String description, DiscountStrategy discountStrategy , String size, String material) {

		super(name, price, description, discountStrategy);
		this.size = size;
		this.material = material;

	}

	@Override
	public void displayProductDetails() {

		System.out.println("Clothing Product: " + name + " - Size: " + size + " - Material: " + material);

	}

}