package Jenkins.TestNGGroup;

import org.testng.annotations.Test;

public class SeleniumTest {


	@Test(priority=1,groups="Test1")
	public void Test1() throws InterruptedException {
		/*driver.get("https://webappservices.azurewebsites.net/");
		driver.findElement(By.xpath("//*[text()='Home']")).click();*/
		System.out.println("test 1");
	}
	
	@Test(priority=2,groups="Test1")
	public void Test2() throws InterruptedException {
		System.out.println("test 2");
	}

	@Test(priority=3, groups="Test2")
	public void Test3() throws InterruptedException {
		System.out.println("test 3");
	}
	
	@Test(priority=4, groups="Test2")
	public void Test4() throws InterruptedException {
		System.out.println("test 4");
	}
}
