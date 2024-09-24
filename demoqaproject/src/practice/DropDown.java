package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "https://practice.expandtesting.com/dropdown";
		driver.get(baseUrl);
		
		Select drp1= new Select(driver.findElement(By.xpath("//*[@id=\"dropdown\"]")));
		drp1.selectByVisibleText("Option 2");
		
		Select drp2= new Select(driver.findElement(By.xpath("//*[@id=\"elementsPerPageSelect\"]")));
		drp2.selectByVisibleText("50");
		
		Select drp3= new Select(driver.findElement(By.xpath("//*[@id=\"country\"]")));
		drp3.selectByVisibleText("Nepal");
	}

}
