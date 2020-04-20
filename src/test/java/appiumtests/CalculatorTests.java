package appiumtests;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTests {

	static AppiumDriver<MobileElement> appDriver;
	
	public static void main(String[] args) throws Exception {
		
		OpenCalculator();

	}	
	public static void OpenCalculator() throws Exception {				
		DesiredCapabilities cap = new DesiredCapabilities();		
		cap.setCapability("deviceName", "vivo 1920");
		cap.setCapability("udid", "575b6cf1");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");		
		cap.setCapability("appPackage", "com.android.bbkcalculator");
		cap.setCapability("appActivity", "com.android.bbkcalculator.Calculator");		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");		
		appDriver = new AppiumDriver<MobileElement>(url,cap);		
		System.out.print("Starting Calculator app");
		
		MobileElement one  = appDriver.findElement(By.id("com.android.bbkcalculator:id/digit1"));
		MobileElement plus  = appDriver.findElement(By.id("com.android.bbkcalculator:id/plus"));
		MobileElement two  = appDriver.findElement(By.id("com.android.bbkcalculator:id/digit2"));
		MobileElement result  = appDriver.findElement(By.id("com.android.bbkcalculator:id/result_text"));
		
		one.click();
		plus.click();
		two.click();
		String resultVal = result.getText();
		System.out.println("---------------Sum is --------: "+resultVal);
				
	}

}
