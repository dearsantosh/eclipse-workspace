package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "https://practice.expandtesting.com/upload";
		driver.get(baseUrl);
		WebElement uploadElement = driver.findElement(By.xpath("//*[@id=\"fileInput\"]"));
		uploadElement.sendKeys("C:\\Test.txt");
		driver.findElement(By.xpath("//*[@id=\"fileSubmit\"]")).click();
	}

}
