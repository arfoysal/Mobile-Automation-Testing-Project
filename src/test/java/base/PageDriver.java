package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class PageDriver {

	private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
	private static PageDriver instance = null;

	private PageDriver() {

	}

	public static PageDriver getInstance() {
		if (instance == null) {
			instance = new PageDriver();
		}
		return instance;
	}

	public WebDriver getDriver() {
		return webDriver.get();
	}

	public void setDriver(WebDriver driver) {
		webDriver.set(driver);
	}

	@SuppressWarnings("unchecked")
	public static AndroidDriver<WebElement> getCurrentDriver() {
		return (AndroidDriver<WebElement>)getInstance().getDriver();
	}

}
