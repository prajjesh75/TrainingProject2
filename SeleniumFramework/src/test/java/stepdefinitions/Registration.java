package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration {
    
	WebDriver driver = null;
	
	@Given("Browser is open")
	public void browser_is_open() {
	
		System.out.println("Inside Step - Browser is open");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
	}

	@And("User is on login page")
	public void user_is_on_login_page() {
		
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
		Thread.sleep(2000);		
	}

	@And("Clicks login button")
	public void clicks_login_button() {
		
		driver.findElement(By.id("login")).click();
		
	}

	@Then("User is Navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
	    
		driver.findElement(By.id("logout")).isDisplayed();
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}



}
