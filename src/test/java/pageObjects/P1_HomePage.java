package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.PageDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilitties.Utilitties;

public class P1_HomePage extends Utilitties {

	public P1_HomePage() {
		PageFactory.initElements(new AppiumFieldDecorator(PageDriver.getCurrentDriver()), this);
	}

	String countryName = "Bangladesh";
	String name = "Kathy";

	@AndroidFindBy(id = "android:id/text1")
	public WebElement dropDown;

	@AndroidFindBy(xpath = "//*[@text='Bangladesh']")
	public WebElement chooseCountryBangladesh;

	@AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
	public WebElement nameField;

	@AndroidFindBy(xpath = "//*[@text='Female']")
	public WebElement female;

	@AndroidFindBy(xpath = "//*[@text='Male']")
	public WebElement male;

	@AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
	public WebElement letsShopBtn;

	public void scrollandSelectCountry() {
		dropDown.click();
		scrollToText(countryName);
		chooseCountryBangladesh.click();

	}

	public void writeUserName() {
		nameField.sendKeys(name);
	}
	
	public void hidekeyboard() {
		PageDriver.getCurrentDriver().hideKeyboard();
	}

	public void selectGender() {
		female.click();
	}
	
	public void letsShopClick() {
		letsShopBtn.click();
		
	}

}
