import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownbyPixel {

		public static void main(String[] args) throws InterruptedException {
			
			String projectPath = System.getProperty("user.dir");
			System.out.println("projectPath : "+projectPath);
			
			System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.manage().window().maximize();
			
			driver.get("https://demoqa.com/select-menu");
	        
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//js.executeScript("window.scrollBy(0,1000)");
		    
			//WebElement Element = driver.findElement(By.id("cars"));
			//js.executeScript("arguments[0].scrollIntoView();", Element);
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}
	
}
