package webdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement SignUp = driver.findElement(By.partialLinkText("Sign up for Facebook"));
		SignUp.click();

		WebElement day = driver.findElement(By.id("day"));
		Select ddDay = new Select(day);
		ddDay.selectByVisibleText("1");

		WebElement month = driver.findElement(By.id("month"));
		Select ddMonth = new Select(month);
		ddMonth.selectByVisibleText("Jan");

		WebElement year = driver.findElement(By.id("year"));

		Select ddyear = new Select(year);
		ddyear.selectByVisibleText("1985");

		// Gender

		WebElement gender = driver.findElement(By.xpath("//input[@name=\"sex\" and @value=\"1\"]"));
		gender.click();

		// Print all the months values from month dropdown
		List<WebElement> months = driver.findElements(By.xpath("//select[@id='month']/option"));

		// System.out.println("First month is " + months.get(0).getText());
		// System.out.println("Second month is " + months.get(1).getText());

		for (WebElement m : months) {
			System.out.println(m.getText());

			// Find total no of linkc on page

		}
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
	}
}
