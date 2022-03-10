import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPath_CSS {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.google.com/");
		
		//driver.get("https://demoqa.com/select-menu");
		/* CSS Selector
		
		
		driver.findElement(By.cssSelector("input[class = 'gLFyf gsfi']")).sendKeys("Hello World");
		driver.findElement(By.cssSelector("input[class = 'gNO89b']")).click();
		
		System.out.println("Search Using CSS Selector is Successful");
		*/
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello World");
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		
		System.out.println("Search Using Xpath is Successful");
		
			
	}
	
}
