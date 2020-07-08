package locators;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousLocators {
	
	WebDriver driver;
	
	@Before
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
	}
	@Test
	public void interactWithWebElement() {
		

		// name locator
		driver.findElement(By.name("firstname")).sendKeys("Sohel");
		driver.findElement(By.name("lastname")).sendKeys("Weldingwala");
		
		//ID locator
		driver.findElement(By.id("sex-0")).click();
		
		// class locator
		//driver.findElement(By.className("input-file")).click();
		
		// Link Text
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		
		// Partial Link Text
		driver.findElement(By.partialLinkText("TF-API")).click();
		
	}
}
