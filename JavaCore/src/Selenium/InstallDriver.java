package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstallDriver {

	public static void main(String[] args) {
		

System.setProperty("webdriver.chrome.driver", "/D:/Ayu/Installs/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
	
		driver.get("http://admin.testpedia.in/");
		
		
		
	//	driver.findElement()
		
	
		
	}

}
