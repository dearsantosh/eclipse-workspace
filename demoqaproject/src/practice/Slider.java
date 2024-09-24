package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "https://practice.expandtesting.com/horizontal-slider";
		driver.get(baseUrl);
		WebElement element = driver.findElement(By.xpath("/html/body/main/div/div/div/input"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(element,245,293).perform();
		
	}

}
