package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.PageDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilitties.Utilitties;

public class P3_CheckoutPage extends Utilitties{

	public P3_CheckoutPage() {
		PageFactory.initElements(new AppiumFieldDecorator(PageDriver.getCurrentDriver()), this);
	}

	@AndroidFindBy(id = "com.androidsample.generalstore:id/productPrice")
	public List<WebElement> ProductPrice;

	@AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
	public WebElement btnCard;

	@AndroidFindBy(id = "com.androidsample.generalstore:id/totalAmountLbl")
	public WebElement totalAmount;

	public By producPricBy = By.id("com.androidsample.generalstore:id/productPrice");
	
	public double scrollAndSumAllCartProduct() {
		double addedsum = 0;
		try {
			addedsum = scrollNCollectPrice(producPricBy);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return addedsum;
	}
	
	public double getActualTotal() {
		String totaltext = totalAmount.getText();
		double total = getAmount(totaltext);
		return total;	
	}
}
