package appium;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SwipeDemo extends base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		TouchAction t = new TouchAction(driver);

		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();
		// long press on 15 and wait for 2 seconds and move the pointer to element 50
		// and release the pointer
		t.press(driver.findElementByXPath("//*[@content-desc='15']")).waitAction(Duration.ofMillis(2000))
				.moveTo(driver.findElementByXPath("//*[@content-desc='50']")).release().perform();

	}

}
