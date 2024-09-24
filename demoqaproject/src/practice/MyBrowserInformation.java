package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyBrowserInformation {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "https://practice.expandtesting.com/my-browser";
		driver.get(baseUrl);
	    driver.findElement(By.xpath("//*[@id=\"browser-toggle\"]")).click();
	}

}
