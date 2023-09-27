package oldClasses;


public abstract class ProductOLD2 {
	
	
	private String name; 
	private double price; 
	private String description; 
	

	private DiscountStrategy discountStrategy; 
	
	public ProductOLD2(String name, double price, String description) {
		
		
		this.name = name; 
		this.price = price;
		this.description = description; 
		this.discountStrategy = null; 
		
		
		
		
	}
	
	public ProductOLD2(String name, double price, String description, DiscountStrategy discountStrategy) { 
		
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
	
	public String getDescription() {
		
		
		return description; 
		
	}
	
	
	public void setPrice(double price) {
		
		this.price = price;
	}
	
	public void setDescription(String description) {
		
		this.description = description; 
		
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
		
		
		if(discountStrategy != null) {
			return discountStrategy.applyDiscount(price);
		} else {
			return price; 
		}
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	

}
