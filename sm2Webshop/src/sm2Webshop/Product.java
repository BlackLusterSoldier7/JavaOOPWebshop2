package sm2Webshop;

public abstract class Product {

	protected String name;
	protected double price;
	protected String description;

	private DiscountStrategy discountStrategy;

	public Product(String name, double price, String description) {

		this.name = name;
		this.price = price;
		this.description = description;
		this.discountStrategy = null;

	}

	public Product(String name, double price, String description, DiscountStrategy discountStrategy) {

		this.name = name;
		this.price = price;
		this.description = description;
		this.discountStrategy = discountStrategy;

	}

	// Abstract method
	public abstract void displayProductDetails();

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public interface DiscountStrategy {

		double applyDiscount(double price);

	}

	
	public interface ProductDetails {
		
		
		double getPrice(); 
		String getDescription(); 
		String getName(); 
		double getPriceAfterDiscount(); 
		
		
	}
	
	public interface DiscountSt {
		
		double applyDiscount(double originalPrice); 
		
		
		
		
	}
	
	
	
	
	
	public double getPriceAfterDiscount() {

		if (discountStrategy != null) {

			return discountStrategy.applyDiscount(price);

		} else {
			return price;
		}

	}

}
