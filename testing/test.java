package newpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars & Drivers\\Drivers\\chromedriver.exe");	
		 WebDriver driver =  new ChromeDriver();
		driver.get("https://fiserv-test.appiancloud.com/suite/sites/fedacc");
		
		driver.findElement(By.xpath("//*[@id='un']")).sendKeys("");
		driver.findElement(By.xpath("//*[@id='pw']")).sendKeys("Hello@123");
		driver.findElement(By.xpath("//*[@id='loginForm']/div[3]/div/div[2]/input")).click();

		driver.findElement(By.xpath("//*[text()='Project Intake' and class='StrongText---richtext_strong']")).click();
	
		driver.quit();
}
}
