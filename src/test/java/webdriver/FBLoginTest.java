package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().clearDriverCache().setup();


		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement Login= driver.findElement(By.name("email"));
		Login.sendKeys("abcd");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("abcd1223");
		
		WebElement LoginBtn= driver.findElement(By.xpath("//button[@type='submit']"));
		
		LoginBtn.click();

	}

}
