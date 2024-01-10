package main.java.com.example;
/**
 * 
 */
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * 
 */
public class BrokenLinks {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\kamal\\eclipse-workspace\\MyProject\\src\\Resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle());
//		WebElement d = driver.findElement(By.className("drive"));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (WebElement link : links) {
			URL url = new URL(link.getAttribute("href"));
			System.out.println();
		    HttpURLConnection httpConn =  
		    	        (HttpURLConnection) url.openConnection(); 
		    httpConn.connect(); 
		    int code = httpConn.getResponseCode(); 
		    if(code >= 400) 
		      { 
		        System.out.println("Broken Link: " +  
		                            url); 
		      } 
		      else
		      { 
		        System.out.println("Valid Link: " +  
		                            url);

		      }     
		    } 
		      
		    System.out.println(); 
		    System.out.println("All Links Checked"); 
			
		    driver.quit();
		}
		
		
		
		
		// TODO Auto-generated method stub



}


