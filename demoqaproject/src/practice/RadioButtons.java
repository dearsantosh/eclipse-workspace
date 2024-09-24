package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButtons {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "https://practice.expandtesting.com/radio-buttons";
		driver.get(baseUrl);
	    driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div/div[2]/div/div/div[4]/label")).click();
	    driver.findElement(By.xpath("/html/body/main/div/div/div/div[2]/div/div[2]/div/div/div[2]/label")).click();
	}

}
