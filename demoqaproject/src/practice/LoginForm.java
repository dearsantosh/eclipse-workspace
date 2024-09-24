package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginForm {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "https://practice.expandtesting.com/login";
		driver.get(baseUrl);
	    driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("practice");
	    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("SuperSecretPassword!");
	    driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();


	}
}
