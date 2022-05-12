package newpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars & Drivers\\Drivers\\chromedriver.exe");	
		 WebDriver driver =  new ChromeDriver();
		 driver.get("https://www.google.co.in/");
	
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.get("https://www.facebook.com/");
		 
		 Thread.sleep(10000);
		 driver.close();
		 driver.quit();
	}

}
