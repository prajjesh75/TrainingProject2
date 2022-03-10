import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	    driver.get("https://demoqa.com/select-menu");
		
				
		//select the second dropdown using "select by visible text"
		
		Select se = new Select(driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));
		se.selectByVisibleText("White");
		Thread.sleep(5000);
		
		//select the third dropdown using "select by index"
		/*
		Select selectByIndex = new Select(driver.findElement(By.id("oldSelectMenu")));
		selectByIndex.selectByIndex(2);
		Thread.sleep(5000);
		*/
		
		
		
	}
	
}
