package stepdefinitions;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserStackBaseTest {

	WebDriver driver;
	public static final String USERNAME = System.getenv("rajeshp_MKjP67");
	public static final String AUTOMATE_KEY = System.getenv("kiZiXAnV9K2ar6tJ745i");
	public static final String URL = "https://" + "rajeshp_MKjP67" + ":" + "kiZiXAnV9K2ar6tJ745i" + "@hub-cloud.browserstack.com/wd/hub";
	
	@Parameters({"browser", "browser_version", "os", "os_version"})
	@BeforeMethod
	public void setUp(String browserName, String browser_version, String os, String os_version, Method name) throws InterruptedException {
		
		System.out.println("browser name is :" +browserName);
		String methodName = name.getName();
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("os", os);
		caps.setCapability("os_version", os_version);
		caps.setCapability("browser_version", browser_version);
		caps.setCapability("name", methodName);
		
		if (browserName.equals("chrome")) {
		    WebDriverManager.chromedriver().setup();
		    caps.setCapability("browser", "Chrome");
		} else if (browserName.equals("firefox")) {
		    WebDriverManager.firefoxdriver().setup();
		    caps.setCapability("browser", "Firefox");
		}
		
	
		
		try {
			Thread.sleep(5000);
			driver = new RemoteWebDriver(new URL(URL), caps);
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} catch (MalformedURLException e) {
			e.printStackTrace(); 
		}
	}
		
		@AfterMethod(alwaysRun = true)
		public void tearDown() {
		  driver.quit();
		}
	
}
