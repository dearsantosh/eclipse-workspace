package pageobject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class PageObject {
	
		public static void web_input() {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			String baseUrl = "https://practice.expandtesting.com/inputs";
		    driver.get(baseUrl);
		    
		    driver.findElement(By.xpath("//*[@id=\"input-number\"]")).sendKeys("0123456789");
		    driver.findElement(By.xpath("//*[@id=\"input-text\"]")).sendKeys("This is Kathmandu");
		    driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Kathmandu@123");
		    driver.findElement(By.xpath("//*[@id=\"input-date\"]")).sendKeys("05/12/2023");
		    driver.findElement(By.xpath("//*[@id=\"btn-display-inputs\"]")).click();
		    //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		    //driver.findElement(By.xpath("//*[@id=\"btn-clear-inputs\"]")).click();  
		}
}
