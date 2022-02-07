package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.Base;
import pageObjects.P3_CheckoutPage;

public class TC_03_CheckoutPageTest extends Base {

	@Test
	public void checkoutPage() throws InterruptedException {
		P3_CheckoutPage checkoutPage = new P3_CheckoutPage();
		double totalPrice = checkoutPage.scrollAndSumAllCartProduct();
		System.out.println("Sum of Products Individually:" + totalPrice);
		double total = checkoutPage.getActualTotal();
		System.out.println("TotalValue from the application: " + total);
		assertEquals(total, totalPrice);
	}

}
