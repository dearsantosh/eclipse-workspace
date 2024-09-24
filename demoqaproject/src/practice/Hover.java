package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "https://practice.expandtesting.com/hovers";
		driver.get(baseUrl);
		
		 WebElement user1=driver.findElement(By.xpath("/html/body/main/div/div/div[1]/img"));
		 Actions actions = new Actions(driver);
		 actions.moveToElement(user1).click().build().perform();

	}

}
