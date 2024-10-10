package testng;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleTCExample extends BaseClass{
	
	
	
	

	
	@Test
	public void TC01() {
		System.out.println("Inside TC 01");
		
	}
	@Test (enabled=true)
	public void TC02() {
		System.out.println("Inside TC 02");
		
	}
	@Test(groups={"regression","sanity"})
	public void TC03() {
		System.out.println("Inside TC 03");
		
	}
}
