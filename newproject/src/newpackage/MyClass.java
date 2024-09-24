package newpackage;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	String baseUrl = "http://demo.guru99.com/test/newtours/";
    driver.get(baseUrl);
    //driver.close();
	}
}
