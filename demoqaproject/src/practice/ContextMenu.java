package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "https://practice.expandtesting.com/context-menu";
		driver.get(baseUrl);
		
		Actions action = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("//*[@id=\"hot-spot\"]"));
		action.contextClick(link).perform();
		//driver.switchTo().alert().accept();
		//WebElement element = driver.findElement(By.xpath("//*[@id=\\\"hot-spot\\\"]"));
		//element.click();
	}

}
