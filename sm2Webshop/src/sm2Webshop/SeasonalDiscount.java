package sm2Webshop;

import sm2Webshop.Product.DiscountStrategy;

public class SeasonalDiscount implements DiscountStrategy {
	
	
	private double discountPercentage; 
	
	
	public SeasonalDiscount(double discountPercentage) {
		
		this.discountPercentage = discountPercentage; 
		
	}
	
	@Override 
	public double applyDiscount(double price) {
		
		return price - ((discountPercentage / 100) * price); 
		
		
	}
	
	
	
	

}
