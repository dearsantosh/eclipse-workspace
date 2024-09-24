package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBoxes {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "https://practice.expandtesting.com/checkboxes";
		driver.get(baseUrl);
		driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		driver.findElement(By.xpath("/html/body/main/div/div/div[2]/label")).click();
	}
}
