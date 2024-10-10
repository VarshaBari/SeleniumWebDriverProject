package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://simplilearn.com/");
		driver.manage().window().maximize();
		
		// Implicit wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Explicit wait of maximum 30 seconds
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log in")));
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		// LoginLink.click();
		
		// Fluent wait with customization of explicit wait
		
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver);
		
		//Specify the timeout of the wait
		wait1.withTimeout(Duration.ofSeconds(30));
		
		//Specify polling times
		wait1.pollingEvery(Duration.ofSeconds(5));
	
		
		wait1.until(ExpectedConditions.elementToBeClickable(By.linkText("Log in")));
		

	}

}
