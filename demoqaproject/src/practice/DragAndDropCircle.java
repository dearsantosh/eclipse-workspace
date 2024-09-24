package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropCircle {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "https://practice.expandtesting.com/drag-and-drop-circles";
		driver.get(baseUrl);
		WebElement From=driver.findElement(By.xpath("//*[@id=\"source\"]/div[1]"));	
		WebElement To=driver.findElement(By.xpath("//*[@id=\"target\"]"));
		Actions act=new Actions(driver);	
		act.dragAndDrop(From, To).build().perform();	
	}

}
