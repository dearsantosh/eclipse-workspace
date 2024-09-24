package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String baseUrl = "https://practice.expandtesting.com/tooltips";
		driver.get(baseUrl);
		
		 String expectedTooltip = "Tooltip on top";
		 WebElement tool = driver.findElement(By.xpath("//*[@id=\"btn1\"]"));
		 String actualTooltip = tool.getAttribute("title");	
		 System.out.println("Tooltip on top"+actualTooltip);	
		 if(actualTooltip.equals(expectedTooltip)) {							
	            System.out.println("Test Case Passed");					
	        }
	}

}
