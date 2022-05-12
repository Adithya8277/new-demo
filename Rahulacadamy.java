package newpack;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rahulacadamy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars & Drivers\\Drivers\\chromedriver.exe");	
		 WebDriver driver =  new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("http://www.rahulshettyacademy.com/locatorspractice/");
		 String name ="Adithya";
		 String password ="adsu123";
		 driver.findElement(By.id("inputUsername")).sendKeys(name);
		 driver.findElement(By.name("inputPassword")).sendKeys(password);
		 driver.findElement(By.className("signInBtn")).click();
		 
	System.out.println(driver.findElement(By.tagName("p")).getText());
		
		 
		 
		 
		 
		driver.close();
	}}