package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Base;

public class TC0999_EcommerceMyUnittest extends Base {

	@Test
	public void myTestforUnitTest() throws IOException, InterruptedException {

		Thread.sleep(2000);
		// driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Appium");
		// Utilitties util = new Utilitties();
		// P1_HomePage home = new P1_HomePage();
		// home.nameField.sendKeys("appium");
		// home.getNameField().sendKeys("appium");
		Thread.sleep(2000);

		// driver.hideKeyboard();

		// P2_ProductPage productPage = new P2_ProductPage();
		/*
		 * productPage.btnAddtocard.get(0).click(); Thread.sleep(2000);
		 * productPage.btnAddtocard.get(1).click();
		 */
		/*
		 * productPage.btnAddtocard.get(1).click(); Thread.sleep(3000);
		 * productPage.btnAddtocard.get(0).click(); Thread.sleep(3000);
		 * util.scrollToText("Air Jordan 9 Retro");
		 * productPage.btnAddtocard.get(0).click(); Thread.sleep(3000);
		 */

		// util.scrollDown(.6, .3)

		// P3_CheckoutPage checkoutPage = new P3_CheckoutPage();
		// double sum = util.scrollNCollectPrice(checkoutPage.producPricBy);
		/*
		 * util.scrollToText("Converse All Star"); double sum = 0; for(int i = 0; i<
		 * checkoutPage.ProductPrice.size(); i++) { String amountString =
		 * checkoutPage.ProductPrice.get(i).getText(); double amountvalue =
		 * util.getAmount(amountString); sum += amountvalue; }
		 */
		// String actsum = checkoutPage.totalAmount.getText();
		// double aSum = util.getAmount(actsum);
		// System.out.println("______________" + sum + " " + aSum);

	}

}
