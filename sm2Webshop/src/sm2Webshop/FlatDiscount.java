package sm2Webshop;

import sm2Webshop.Product.DiscountStrategy;

public class FlatDiscount implements DiscountStrategy {

	private double discountAmount;

	public FlatDiscount(double discountAmount) {

		this.discountAmount = discountAmount;

	}

	@Override
	public double applyDiscount(double price) {

		return price - ((discountAmount / 100) * price);

	}

}
