import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthentication {

	public static void main(String[] args) throws IOException {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.linkedin.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement username=driver.findElement(By.id("session_key"));
		WebElement password=driver.findElement(By.id("session_password"));
		WebElement login=driver.findElement(By.xpath("/html/body/main/section[1]/div/div/form/button"));
		
		username.sendKeys("example@gmail.com");
		password.sendKeys("password");
		login.click();
	}
	
}
