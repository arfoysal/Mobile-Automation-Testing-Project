package utilitties;

import java.text.DecimalFormat;
import java.time.Duration;
import java.util.HashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import base.PageDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Utilitties {

	public void scrollToText(String text) {
		(PageDriver.getCurrentDriver()).findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"" + text + "\"));");
	}

	// convert string to double number
	public static double getAmount(String value) {
		value = value.substring(1);
		double amountValue = Double.parseDouble(value);
		return Double.parseDouble(new DecimalFormat("##.##").format(amountValue)); // return total amount with two
																					// precision after decimal point
	}

	// Scroll any custom amount by percentage of screen ratio
	public void scrollDown(double startPosition, double endPosition) {
		Dimension dimension = PageDriver.getCurrentDriver().manage().window().getSize();
		int scrollStart = (int) (dimension.getHeight() * startPosition);
		int scrollEnd = (int) (dimension.getHeight() * endPosition);

		new TouchAction<>((PerformsTouchActions) PageDriver.getCurrentDriver())
				.press(PointOption.point(0, scrollStart)) // tap on start position
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) // Hold for 1sec
				.moveTo(PointOption.point(0, scrollEnd)) // moving towards end position
				.release().perform();
	}

	// Scroll and Add to cart all product from product page by using smiler by
	// locator product page ADD TO CART button.
	public void scrollNAddToCard(By listItems, String text) throws InterruptedException {
		int i = 0;
		while (i < 21) {
			for (WebElement element : PageDriver.getCurrentDriver().findElements(listItems)) {
				if (element.getAttribute("text").equals(text)) {
					element.click();
				}
				i++; // for maximum number of scroll and avoid infinite loop
			}
			scrollDown(0.5, 0.1); // scroll screen from 50% to 10%
		}
	}

	// Scroll and collect price of all listed product by using smiler by locator on
	// current page.
	public double scrollNCollectPrice(By listItems) throws InterruptedException {
		HashSet<WebElement> set = new HashSet<>(); // Using Hashset to avoid duplicate
		double sum = 0;
		int i = 0;
		while (i < 16) {
			for (WebElement element : PageDriver.getCurrentDriver().findElements(listItems)) {
				if (set.add(element)) { // if add successful return true and also verify this element is unique
					String amountString = element.getText();
					double amountvalue = getAmount(amountString);
					sum += amountvalue;
				}
				i++; // for maximum number of scroll and avoid infinite loop
			}
			scrollDown(0.6, 0.2); // scroll screen from 50% to 20%
		}
		return sum;
	}

}
