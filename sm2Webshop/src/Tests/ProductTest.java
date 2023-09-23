package Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sm2Webshop.Product;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

	private Product productWithoutDiscount;
	private Product productWithDiscount;

	@BeforeEach
	void setUp() {
		productWithoutDiscount = new Product("Macbook", 2500, "Macbook Pro 15 inch") {
			@Override
			public void displayProductDetails() {

			}
		};

		productWithDiscount = new Product("Java book", 50, "Introduction to Java programming",
				new TenPercentDiscountStrategy()) {
			@Override
			public void displayProductDetails() {
					// implementatie van abstract methode hoef je niet te doen
				// in unit testen 
			}
		};
	}

	@Test
	void testName() {

		assertEquals("Macbook", productWithoutDiscount.getName());
		assertEquals("Java book", productWithDiscount.getName());
	}

	@Test
	void testPrice() {

		assertEquals(2500, productWithoutDiscount.getPrice());
		assertEquals(50, productWithDiscount.getPrice());

	}

	@Test
	void testDescription() {

		assertEquals("Macbook Pro 15 inch", productWithoutDiscount.getDescription());
		assertEquals("Introduction to Java programming", productWithDiscount.getDescription());

	}

	@Test
	void testGetPriceAfterDiscount() {

		// Product without discount, so price remains the same
		assertEquals(2500, productWithoutDiscount.getPriceAfterDiscount());

		// Product with 10% discount, so price is 90% of original
		assertEquals(45, productWithDiscount.getPriceAfterDiscount());

	}

	@Test
	void testProductWithZeroPrice() {

		Product zeroPricedProduct = new Product("Donal Duck strip", 0, "Gratis stripboek") {

			@Override
			public void displayProductDetails() {

			}

		};

		assertEquals(0, zeroPricedProduct.getPrice());
		assertEquals(0, zeroPricedProduct.getPriceAfterDiscount());

	}

	private class TenPercentDiscountStrategy implements Product.DiscountStrategy {

		@Override
		public double applyDiscount(double price) {
			return price * 0.9;
		}

	}
}
