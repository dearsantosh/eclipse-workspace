package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddRemoveElement {
	 public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "https://practice.expandtesting.com/add-remove-elements";
	    driver.get(baseUrl);
	    driver.findElement(By.xpath("/html/body/main/div/div/button")).click();
	    driver.findElement(By.xpath("/html/body/main/div/div/button")).click();
	    driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).click();

	}
}
