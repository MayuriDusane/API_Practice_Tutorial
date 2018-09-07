package appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIautomator extends base {
	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// syntax to use uiautomator=>
		// driver.findElementByAndroidUIAutomator("attribute("value")");
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		// validate clickable feature for all options

		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());

	}

}
