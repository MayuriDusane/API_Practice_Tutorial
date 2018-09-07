package appium;

import java.net.MalformedURLException;
import java.time.Duration;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gestures extends base {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//Tap
		TouchAction t = new TouchAction(driver);
		t.tap(driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")")).perform();
		driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
		
		t.press(driver.findElementByAndroidUIAutomator("text(\"People Names\")")).waitAction(Duration.ofMillis(3000)).release().perform();
		String expectedTitle= driver.findElementByAndroidUIAutomator("text(\"Sample menu\")").getText();
		String actualTitle= "Sample menu";
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Title is : Sample menu");
		}
		else
		{
			System.out.println("Wrong title is displayed....");
		}

	}

}
