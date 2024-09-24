package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class JsPrompt {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "https://practice.expandtesting.com/js-dialogs";
		driver.get(baseUrl);
		
		driver.findElement(By.xpath("//*[@id=\"js-prompt\"]")).click();
		driver.switchTo().alert().sendKeys("This is text");
		driver.switchTo().alert().accept();
	}
}
