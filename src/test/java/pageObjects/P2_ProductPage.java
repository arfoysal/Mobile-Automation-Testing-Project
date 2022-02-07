package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.PageDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilitties.Utilitties;

public class P2_ProductPage extends Utilitties {

	public P2_ProductPage() {
		PageFactory.initElements(new AppiumFieldDecorator(PageDriver.getCurrentDriver()), this);
	}

	@AndroidFindBy(id = "com.androidsample.generalstore:id/productAddCart")
	public List<WebElement> btnAddtocart; // public List<WebElement> name; -->for FindByElements

	@AndroidFindBy(id = "com.androidsample.generalstore:id/productPrice")
	public List<WebElement> ProductPrice;

	@AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
	public WebElement btnCart;

	public By btnAddtoCartBy = By.id("com.androidsample.generalstore:id/productAddCart");
	String addToCart = "ADD TO CART";
	
	public void scrollAndAddToCart() {
		try {
			scrollNAddToCard(btnAddtoCartBy, addToCart);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void clickOnCart() {
		btnCart.click();
	}
}
