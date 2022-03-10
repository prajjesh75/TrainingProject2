import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
		System.setProperty("webdriver.gecko.driver", projectPath+"\\Drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//driver.get("https://demoqa.com/select-menu");
		
		driver.navigate().to("https://www.google.com/");
		
		driver.findElement(By.className("gb_1")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().to("https://www.google.com/");
		
		driver.navigate().refresh();
		
		System.out.println("Navigation Methods Executed Successfully");
		
				
		driver.close();
		
		
	}
}
