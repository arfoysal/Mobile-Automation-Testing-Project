package testcases;

import org.testng.annotations.Test;

import base.Base;
import pageObjects.P2_ProductPage;

public class TC_02_ProductsPageTest extends Base {

	@Test
	public void productsPageAddToCart() throws InterruptedException {
		P2_ProductPage products = new P2_ProductPage();
		products.scrollAndAddToCart();
		products.clickOnCart();

	}

}
