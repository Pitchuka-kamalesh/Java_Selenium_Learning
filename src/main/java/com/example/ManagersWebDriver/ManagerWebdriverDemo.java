package main.java.com.example.ManagersWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManagerWebdriverDemo {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager");
		
		driver.quit();
		
		
	}
	
	




}
