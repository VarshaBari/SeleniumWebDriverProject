package testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class OneTCExample extends BaseClass{

	@Test(groups={"regression","sanity"})
	public void TestCase_00() {
		System.out.println("Inside TC00");
	}


}
