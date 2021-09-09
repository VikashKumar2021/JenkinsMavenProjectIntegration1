package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	WebDriver driver;

	@Test
	public void test1(){

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.in");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		Assert.assertEquals(driver.getTitle(), "eBay India Seller Center");
		System.out.println("Completed");
		Assert.assertEquals(driver.getTitle(), "eBay India Seller Center");
		
	}

}
