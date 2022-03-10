package com.selenium.testing;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStack {

	public static final String USERNAME = System.getenv("rajeshp_MKjP67");
	public static final String AUTOMATE_KEY = System.getenv("kiZiXAnV9K2ar6tJ745i");
	public static final String URL = "https://" + "rajeshp_MKjP67" + ":" + "kiZiXAnV9K2ar6tJ745i" + "@hub-cloud.browserstack.com/wd/hub";
	public static void main (String[] args) throws Exception {
	
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "OS X");
		caps.setCapability("os_version", "Catalina");
		caps.setCapability("browser", "Safari");
		caps.setCapability("browser_version", "13.0");
		caps.setCapability("project", "My_First_Test");
		caps.setCapability("build", "v.0.1");
		caps.setCapability("name", "My_First_Test");
		caps.setCapability("browserstack.local", "false");
		caps.setCapability("browserstack.selenium_version", "3.141.59");
		//new URL(URL)
		//WebDriver driver = new RemoteWebDriver(new URL("https://" + "rajeshp_MKjP67" + ":" + "kiZiXAnV9K2ar6tJ745i" + "@hub-cloud.browserstack.com/wd/hub"), caps);
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		
		element.sendKeys("BrowserStack");
		element.submit();
		
		System.out.println(driver.getTitle());
		driver.quit();
		}
	
	/*
	@Test
	public void executeSessionTwo() throws MalformedURLException {
	
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os_version", "11");
		caps.setCapability("device", "iPhone 8 Plus");
		caps.setCapability("real_mobile", "true");
		caps.setCapability("browserstack.local", "false");
		
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("http://login.yahoo.com");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.quit();
		}
	
	@Test
	public void executeSessionThree() throws MalformedURLException {
	
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "OS X");
		caps.setCapability("os_version", "Catalina");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "83.0");
		caps.setCapability("browserstack.local", "false");
		caps.setCapability("browserstack.selenium_version", "3.5.2");
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("http://www.browserstack.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.quit();
		}
		*/
	
}
